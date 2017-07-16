/**
 * 
 */
package com.myRetail.restfull.myRetail.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.QueryBuilder;
import com.myRetail.restfull.myRetail.model.Product;


/**
 * @author sonyn
 *
 */
@Component
@Service
@SpringBootApplication
@Transactional
public class ProductDao {

private final MongoTemplate mongoTemplate;
	
	@Autowired
    public ProductDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

	public List<Product> getProducts() {
		try {
			List<Product> product = mongoTemplate.findAll(Product.class);
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Product getProductByID(long id) {
		try {
			Product product = mongoTemplate.findById(id,Product.class);
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Boolean modifyProduct(Product product) {
		
		try{
			product.setName(null);
			mongoTemplate.save(product);
			return true;
		} catch (Exception e){
			return false;
		}	
	}
	
	public Boolean addProduct(Product product) {
		try{
			product.setName(null);
			mongoTemplate.insert(product);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Boolean isProductExists(int id) {
		try{
			Product product = mongoTemplate.findById(id,Product.class);
			if (product != null)
			return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean createProduct(Product product) {
	try{
		
		mongoTemplate.insert(product);
		return true;
		
	} catch (Exception e) {
		
		return false;
		
	}		
	}

	public Boolean removeProductByID(int id) {
		try {
			Query q =  new Query(where("id").is(id));
//			Product product = mongoTemplate.findById(id,Product.class);
//			mongoTemplate.remove(product);
			mongoTemplate.remove(q,Product.class);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
