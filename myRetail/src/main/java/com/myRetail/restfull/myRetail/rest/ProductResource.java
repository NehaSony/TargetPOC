/**
 * 
 */
package com.myRetail.restfull.myRetail.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myRetail.restfull.myRetail.business.BusinessException;
import com.myRetail.restfull.myRetail.business.ProductBO;
import com.myRetail.restfull.myRetail.model.Product;
import com.myRetail.restfull.myRetail.model.ProductResponse;

/**
 * @author sonyn
 *
 */

@RestController
@RequestMapping("/myRetail")
public class ProductResource {

	@Autowired
	private ProductBO prod;

	RestTemplate restTemplate = new RestTemplate();

	/**
	 * Create Data by id
	 *
	 */

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> createProduct(@RequestBody Product product) {
		try {
			prod.createProduct(product);
			return ResponseEntity.ok("Product with id : " + product.getId() + " created sucessfully");
		} catch (BusinessException b) {
			return ResponseEntity.badRequest().body("Product with id already exists");
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Was unable to process you request due to server error");
		}

	}

	/**
	 * Read Data by id
	 *
	 */

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getProductById(@PathVariable(value = "id") long id) {
		Product product = new Product();
		Map<String, String> errorMap = new HashMap<String,String>();
		try {
			product = prod.getProductByID(id);
			if (product != null) {
				return ResponseEntity.ok(product);
			}
		} catch (BusinessException b) {
			errorMap.put("ErrorMsg", "Invalid id provided");
			return ResponseEntity.badRequest().body(errorMap);
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Was unable to connect to API server");
		}
		return null;
	}

	/**
	 * Update Data by id
	 *
	 */

	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> modifyProductById(@RequestBody Product product,
			@PathVariable(value = "id") int id) {
		try {
			if (id != product.getId())
				return ResponseEntity.badRequest().body("Invalid id provided");
			prod.modifyProductById(product, id);
			return ResponseEntity.ok("Product with id : " + id + " modified sucessfully");
		} catch (BusinessException b) {
			return ResponseEntity.badRequest().body("Invalid Parameters");
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Was unable to process you request due to server error");
		}

	}

	/**
	 * Delete Data by id
	 *
	 */

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> removeProductById(@PathVariable(value = "id") int id) {
		try {
			if (prod.removeProductByID(id)) {
				return ResponseEntity.ok("Product with id : " + id + " deleted sucessfully");
			} else
				throw new BusinessException();
		} catch (BusinessException b) {
			return ResponseEntity.badRequest().body("Invalid id provided");
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body("Was unable to connect to API server");
		}
	}

	/**
	 * Additional operations::::::
	 *
	 */

	// List All Price Details in DB

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody List<Product> getProducts() {
		return prod.getProducts();

	}

	/**
	 * API consumption
	 *
	 */

	@RequestMapping(value = "/productName/{id}", method = RequestMethod.GET)
	public @ResponseBody ProductResponse getProductNameById(@PathVariable(value = "id") int id) {
		ProductResponse response = restTemplate.getForObject(
				"https://api.target.com/products/v3/" + id
						+ "?fields=descriptions&id_type=TCIN&key=43cJWpLjH8Z8oR18KdrZDBKAgLLQKJjz",
				ProductResponse.class);
		return response;
	}

}
