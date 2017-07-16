/**
 * 
 */
package com.myRetail.restfull.myRetail.model;

import java.util.List;

/**
 * @author sonyn
 *
 */

public class ProductCompositeResponse {
	private List<RequestAttributes> request_attributes;
	private List<Items> items;
	/**
	 * @return the request_attributes
	 */
	public List<RequestAttributes> getRequest_attributes() {
		return request_attributes;
	}
	/**
	 * @param request_attributes the request_attributes to set
	 */
	public void setRequest_attributes(List<RequestAttributes> request_attributes) {
		this.request_attributes = request_attributes;
	}
	/**
	 * @return the items
	 */
	public List<Items> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<Items> items) {
		this.items = items;
	}
}
