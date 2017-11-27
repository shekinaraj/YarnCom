package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SupplierData")
public class SupplierData {
	
	@Column(name = "prefix")
	private String prefix = "SD";
	
	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private int id;
	
	@Column(name="enquiryId")
	private String enquiryId;
	
	@Column(name = "supplierName" )
	private String supplierName;
	
	@Column(name = "supplierQuote")
	private String supplierQuote;
	
	@Column(name = "offerPrice")
	private String offerPrice;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "value")
	private String value;
	
	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "customerId")
	private String customerId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "flag")
	private String flag;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierQuote() {
		return supplierQuote;
	}

	public void setSupplierQuote(String supplierQuote) {
		this.supplierQuote = supplierQuote;
	}

	public String getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	

	
}
