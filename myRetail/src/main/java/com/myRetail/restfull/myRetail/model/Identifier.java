/**
 * 
 */
package com.myRetail.restfull.myRetail.model;

/**
 * @author sonyn
 *
 */
public class Identifier {
	private String id_type;
	private String id;
	private String is_primary;
	private String source;
	/**
	 * @return the id_type
	 */
	public String getId_type() {
		return id_type;
	}
	/**
	 * @param id_type the id_type to set
	 */
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the is_primary
	 */
	public String getIs_primary() {
		return is_primary;
	}
	/**
	 * @param is_primary the is_primary to set
	 */
	public void setIs_primary(String is_primary) {
		this.is_primary = is_primary;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	
}
