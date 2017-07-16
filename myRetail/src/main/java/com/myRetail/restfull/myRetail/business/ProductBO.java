/**
 * 
 */
package com.myRetail.restfull.myRetail.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myRetail.restfull.myRetail.model.Product;
import com.myRetail.restfull.myRetail.service.ProductService;

/**
 * @author sonyn
 *
 */
@Component
public class ProductBO {

	@Autowired
	ProductService prod;

	public List<Product> getProducts() {
		return prod.getProducts();
	}

	public Product getProductByID(long id) throws BusinessException {
		Product product;
		product = prod.getProductByID(id);
		if (product != null) {
			return product;
		} else {
			throw new BusinessException();
		}
	}

	public Boolean modifyProductById(Product product, int id) throws BusinessException {
		Boolean modifiedProduct;
		modifiedProduct = prod.modifyProductById(product);
		if (product.getId() != id || prod.getProductByID(id) == null) {
			throw new BusinessException();
		} else {
			if (modifiedProduct) {
				return modifiedProduct;
			} else {
				throw new BusinessException();
			}
		}
	}

	public Boolean createProduct(Product product) throws BusinessException {
		if (prod.getProductByID(product.getId()) == null) {
			return prod.createProduct(product);
		} else {
			throw new BusinessException();
		}

	}

	public Boolean removeProductByID(int id) throws BusinessException {
		if (prod.getProductByID(id) == null) {
			throw new BusinessException();
		} else {
			return prod.removeProductByID(id);
		}
	}

}
