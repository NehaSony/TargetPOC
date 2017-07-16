/**
 * 
 */
package com.myRetail.restfull.myRetail.model;

import java.util.List;

/**
 * @author sonyn
 *
 */
public class Items {
	private List<Identifier> identifier;
	private String relation;
	private String relation_description;
	private String data_page_link;
	private int imn_identifier;
	private String parent_id;
	private Boolean is_orderable;
	private Boolean is_sellable;
	private String general_description;
	private Boolean is_circular_publish;
	private List<BusinessProcessStatus> business_process_status;
	private String dpci;
	private int department_id;
	private int class_id;
	private int item_id;
	private Description online_description;
	private Description store_description;
	private List<AlternateDescription> alternate_description;
	private List<Features> features;
	/**
	 * @return the identifier
	 */
	public List<Identifier> getIdentifier() {
		return identifier;
	}
	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(List<Identifier> identifier) {
		this.identifier = identifier;
	}
	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}
	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}
	/**
	 * @return the relation_description
	 */
	public String getRelation_description() {
		return relation_description;
	}
	/**
	 * @param relation_description the relation_description to set
	 */
	public void setRelation_description(String relation_description) {
		this.relation_description = relation_description;
	}
	/**
	 * @return the data_page_link
	 */
	public String getData_page_link() {
		return data_page_link;
	}
	/**
	 * @param data_page_link the data_page_link to set
	 */
	public void setData_page_link(String data_page_link) {
		this.data_page_link = data_page_link;
	}
	/**
	 * @return the imn_identifier
	 */
	public int getImn_identifier() {
		return imn_identifier;
	}
	/**
	 * @param imn_identifier the imn_identifier to set
	 */
	public void setImn_identifier(int imn_identifier) {
		this.imn_identifier = imn_identifier;
	}
	/**
	 * @return the parent_id
	 */
	public String getParent_id() {
		return parent_id;
	}
	/**
	 * @param parent_id the parent_id to set
	 */
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	/**
	 * @return the is_orderable
	 */
	public Boolean getIs_orderable() {
		return is_orderable;
	}
	/**
	 * @param is_orderable the is_orderable to set
	 */
	public void setIs_orderable(Boolean is_orderable) {
		this.is_orderable = is_orderable;
	}
	/**
	 * @return the is_sellable
	 */
	public Boolean getIs_sellable() {
		return is_sellable;
	}
	/**
	 * @param is_sellable the is_sellable to set
	 */
	public void setIs_sellable(Boolean is_sellable) {
		this.is_sellable = is_sellable;
	}
	/**
	 * @return the general_description
	 */
	public String getGeneral_description() {
		return general_description;
	}
	/**
	 * @param general_description the general_description to set
	 */
	public void setGeneral_description(String general_description) {
		this.general_description = general_description;
	}
	/**
	 * @return the is_circular_publish
	 */
	public Boolean getIs_circular_publish() {
		return is_circular_publish;
	}
	/**
	 * @param is_circular_publish the is_circular_publish to set
	 */
	public void setIs_circular_publish(Boolean is_circular_publish) {
		this.is_circular_publish = is_circular_publish;
	}
	/**
	 * @return the business_process_status
	 */
	public List<BusinessProcessStatus> getBusiness_process_status() {
		return business_process_status;
	}
	/**
	 * @param business_process_status the business_process_status to set
	 */
	public void setBusiness_process_status(List<BusinessProcessStatus> business_process_status) {
		this.business_process_status = business_process_status;
	}
	/**
	 * @return the dpci
	 */
	public String getDpci() {
		return dpci;
	}
	/**
	 * @param dpci the dpci to set
	 */
	public void setDpci(String dpci) {
		this.dpci = dpci;
	}
	/**
	 * @return the department_id
	 */
	public int getDepartment_id() {
		return department_id;
	}
	/**
	 * @param department_id the department_id to set
	 */
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	/**
	 * @return the class_id
	 */
	public int getClass_id() {
		return class_id;
	}
	/**
	 * @param class_id the class_id to set
	 */
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	/**
	 * @return the item_id
	 */
	public int getItem_id() {
		return item_id;
	}
	/**
	 * @param item_id the item_id to set
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	/**
	 * @return the online_description
	 */
	public Description getOnline_description() {
		return online_description;
	}
	/**
	 * @param online_description the online_description to set
	 */
	public void setOnline_description(Description online_description) {
		this.online_description = online_description;
	}
	/**
	 * @return the store_description
	 */
	public Description getStore_description() {
		return store_description;
	}
	/**
	 * @param store_description the store_description to set
	 */
	public void setStore_description(Description store_description) {
		this.store_description = store_description;
	}
	/**
	 * @return the alternate_description
	 */
	public List<AlternateDescription> getAlternate_description() {
		return alternate_description;
	}
	/**
	 * @param alternate_description the alternate_description to set
	 */
	public void setAlternate_description(List<AlternateDescription> alternate_description) {
		this.alternate_description = alternate_description;
	}
	/**
	 * @return the features
	 */
	public List<Features> getFeatures() {
		return features;
	}
	/**
	 * @param features the features to set
	 */
	public void setFeatures(List<Features> features) {
		this.features = features;
	}
	
	
	
	
	
	
}
