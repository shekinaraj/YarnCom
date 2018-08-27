package com.yarncoms.model;

import javax.persistence.Column;

public class YarnBase {

	@Column(name = "enquiryId")
	private String enquiryId;

	@Column(name = "enquiryFor")
	private String enquiryFor;

	@Column(name = "enqDate")
	private String enqDate;
	
	@Column(name = "enqStatus")
	private String enqStatus;

	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "brand")
	private String brand;

	@Column(name = "customerType")
	private String customerType;
	
	@Column(name = "customerCategory")
	private String customerCategory;
	
	@Column(name = "companyName")
	private String companyName;

	@Column(name = "contactPersonName")
	private String contactPersonName;

	@Column(name = "contactPersonEmail")
	private String contactPersonEmail;

	@Column(name = "countryCode")
	private String countryCode;

	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "viberNo")
	private String viberNo;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "otherCountry")
	private String otherCountry;
	
	@Column(name = "website")
	private String website;

	public YarnBase(String enquiryId, String enquiryFor, String enqDate, String productDescription, String brand,
			String customerType, String customerCategory, String companyName, String contactPersonName,
			String contactPersonEmail, String countryCode, String contactNo, String viberNo, String country,
			String otherCountry, String website) {
		super();
		this.enquiryId = enquiryId;
		this.enquiryFor = enquiryFor;
		this.enqDate = enqDate;
		this.productDescription = productDescription;
		this.brand = brand;
		this.customerType = customerType;
		this.customerCategory = customerCategory;
		this.companyName = companyName;
		this.contactPersonName = contactPersonName;
		this.contactPersonEmail = contactPersonEmail;
		this.countryCode = countryCode;
		this.contactNo = contactNo;
		this.viberNo = viberNo;
		this.country = country;
		this.otherCountry = otherCountry;
		this.website = website;
	}

	public String getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquiryFor() {
		return enquiryFor;
	}

	public void setEnquiryFor(String enquiryFor) {
		this.enquiryFor = enquiryFor;
	}

	public String getEnqDate() {
		return enqDate;
	}

	public void setEnqDate(String enqDate) {
		this.enqDate = enqDate;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
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

	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
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

	public String getViberNo() {
		return viberNo;
	}

	public void setViberNo(String viberNo) {
		this.viberNo = viberNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOtherCountry() {
		return otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	

}
