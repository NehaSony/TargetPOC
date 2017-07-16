/**
 * 
 */
package com.myRetail.restfull.myRetail.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.myRetail.restfull.myRetail.model.ProductName;

/**
 * @author sonyn
 *
 */
@Component
public interface ProductNameDao extends CrudRepository<ProductName, String>{

}
