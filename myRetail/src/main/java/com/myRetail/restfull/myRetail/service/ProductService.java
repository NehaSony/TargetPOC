/**
 * 
 */
package com.myRetail.restfull.myRetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.myRetail.restfull.myRetail.dao.ProductDao;
import com.myRetail.restfull.myRetail.model.Product;
import com.myRetail.restfull.myRetail.model.ProductResponse;

/**
 * @author sonyn
 *
 */
@Service

public class ProductService {
	
	@Autowired
	private ProductDao prod;

	public List<Product> getProducts() {
		return prod.getProducts();
	}

	public Product getProductByID(long id) {
		Product product;
		RestTemplate restTemplate = new RestTemplate(); 
		ProductResponse response = restTemplate.getForObject( "https://api.target.com/products/v3/"+id+"?fields=descriptions&id_type=TCIN&key=43cJWpLjH8Z8oR18KdrZDBKAgLLQKJjz", ProductResponse.class);
		product = prod.getProductByID(id);
		if (null!= product && null != response 
				&& null != response.getProduct_composite_response() 
				&& null != response.getProduct_composite_response().getItems() 
				&& null != response.getProduct_composite_response().getItems().get(0) 
				&& null != response.getProduct_composite_response().getItems().get(0).getOnline_description()){
		product.setName(response.getProduct_composite_response().getItems().get(0).getOnline_description().getValue());
		}
		return product;
	}

	public Boolean modifyProductById(Product product) {
		
		return prod.modifyProduct(product);
	}

	public Boolean createProduct(Product product) {
		
		return prod.createProduct(product);
		
	}

	public Boolean removeProductByID(int id) {
		
		return prod.removeProductByID(id);
	}

}
