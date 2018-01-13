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
	private Long id;
	
	@Column(name="enquiryId")
	private String enquiryId;
	
	@Column(name = "supplierName" )
	private String supplierName;
	
	@Column(name = "supplierRating")
	private String supplierRating;
	
	@Column(name = "supplierQuote")
	private String supplierQuote;
	
	@Column(name = "supplierCurrency")
	private String supplierCurrency;
	
	@Column(name = "offerPrice")
	private String offerPrice;
	
	@Column(name = "finalPrice")
	private String finalPrice;
	
	@Column(name = "otherPrice")
	private int otherPrice;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "value")
	private String value;
	
	@Column(name = "countryCode")
	private String countryCode;
	
	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "customerId")
	private String customerId;
	
	@Column(name = "companyName")
	private String companyName;

	@Column(name = "contactPersonName")
	private String contactPersonName;
	
	@Column(name = "productDescription")
	private String productDescription;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getSupplierRating() {
		return supplierRating;
	}

	public void setSupplierRating(String supplierRating) {
		this.supplierRating = supplierRating;
	}

	public String getSupplierQuote() {
		return supplierQuote;
	}

	public void setSupplierQuote(String supplierQuote) {
		this.supplierQuote = supplierQuote;
	}

	public String getSupplierCurrency() {
		return supplierCurrency;
	}

	public void setSupplierCurrency(String supplierCurrency) {
		this.supplierCurrency = supplierCurrency;
	}

	public String getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}

	public int getOtherPrice() {
		return otherPrice;
	}

	public void setOtherPrice(int otherPrice) {
		this.otherPrice = otherPrice;
	}

	public String getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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
