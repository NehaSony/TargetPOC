/**
 * 
 */
package com.myRetail.restfull.myRetail.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sonyn
 *
 */

@Document(collection = "product")
public class Product {
	@Id
	private long id;
	private String name;
	private Price current_price;
	
	
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the current_price
	 */
	public Price getCurrent_price() {
		return current_price;
	}
	/**
	 * @param current_price the current_price to set
	 */
	public void setCurrent_price(Price current_price) {
		this.current_price = current_price;
	}
	
	
	
}
