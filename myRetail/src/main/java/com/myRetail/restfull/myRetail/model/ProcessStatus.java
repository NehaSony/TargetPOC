/**
 * 
 */
package com.myRetail.restfull.myRetail.model;

/**
 * @author sonyn
 *
 */
public class ProcessStatus {
	
	private Boolean is_ready;
	private String operation_description;
	private String operation_code;
	/**
	 * @return the is_ready
	 */
	public Boolean getIs_ready() {
		return is_ready;
	}
	/**
	 * @param is_ready the is_ready to set
	 */
	public void setIs_ready(Boolean is_ready) {
		this.is_ready = is_ready;
	}
	/**
	 * @return the operation_description
	 */
	public String getOperation_description() {
		return operation_description;
	}
	/**
	 * @param operation_description the operation_description to set
	 */
	public void setOperation_description(String operation_description) {
		this.operation_description = operation_description;
	}
	/**
	 * @return the operation_code
	 */
	public String getOperation_code() {
		return operation_code;
	}
	/**
	 * @param operation_code the operation_code to set
	 */
	public void setOperation_code(String operation_code) {
		this.operation_code = operation_code;
	}

}
