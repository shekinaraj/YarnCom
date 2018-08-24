package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerProduct")
public class CustomerProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerProductId")
	private Long customerProductId;
	
	@Column(name = "yarnProductId")
	private Long yarnProductId;
	
	@Column(name = "fabricProductId")
	private Long fabricProductId;
	
	/*@Column(name = "description")
	private String description;*/
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "customerId")
	private String customerId;
	
	@Column(name = "contactPersonName")
	private String contactPersonName;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "enquiryFor")
	private String enquiryFor;
	
	@Column(name = "countryCode")
	private String countryCode;

	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "contactPersonEmail")
	private String contactPersonEmail;
	
	@Column(name = "count")
	private String count;
	
	@Column(name = "warpCount")
	private Long warpCount;
	
	@Column(name = "weftCount")
	private Long weftCount;

	public Long getCustomerProductId() {
		return customerProductId;
	}

	public void setCustomerProductId(Long customerProductId) {
		this.customerProductId = customerProductId;
	}

	public Long getYarnProductId() {
		return yarnProductId;
	}

	public void setYarnProductId(Long yarnProductId) {
		this.yarnProductId = yarnProductId;
	}

	public Long getFabricProductId() {
		return fabricProductId;
	}

	public void setFabricProductId(Long fabricProductId) {
		this.fabricProductId = fabricProductId;
	}

	/*public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/

	public String getBrand() {
		return brand;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEnquiryFor() {
		return enquiryFor;
	}

	public void setEnquiryFor(String enquiryFor) {
		this.enquiryFor = enquiryFor;
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

	public String getContactPersonEmail() {
		return contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
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

}
