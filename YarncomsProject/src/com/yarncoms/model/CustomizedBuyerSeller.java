package com.yarncoms.model;

import javax.persistence.Column;

public class CustomizedBuyerSeller {
	
	@Column(name = "enquiryFor")
	private String enquiryFor;
	
	@Column(name = "brand")
	private String brand;
	
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
	
	@Column(name = "count")
	private String count;
	
	@Column(name = "warpCount")
	private Long warpCount;
	
	@Column(name = "weftCount")
	private Long weftCount;
	
	@Column(name = "productDescription")
	private String productDescription;

	public String getEnquiryFor() {
		return enquiryFor;
	}

	public void setEnquiryFor(String enquiryFor) {
		this.enquiryFor = enquiryFor;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Long getWarpCount() {
		return warpCount;
	}

	public void setWarpCount(Long warpCount) {
		this.warpCount = warpCount;
	}

	public Long getWeftCount() {
		return weftCount;
	}

	public void setWeftCount(Long weftCount) {
		this.weftCount = weftCount;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
