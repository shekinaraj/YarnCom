package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Column(name = "prefix")
	private String prefix = "C";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private Long customerId;

	@Column(name = "customerType")
	private String customerType;
	
	@Column(name = "status")
	private String status;

	@Column(name = "customerCategory")
	private String customerCategory;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "rating")
	private String rating;

	@Column(name = "website")
	private String website;

	@Column(name = "contactPersonName")
	private String contactPersonName;

	@Column(name = "contactPersonEmail")
	private String contactPersonEmail;

	@Column(name = "mobileNo")
	private long mobileNo;

	@Column(name = "whatsApp")
	private long whatsApp;

	@Column(name = "viberNo")
	private long viberNo;

	@Column(name = "officeNo")
	private long officeNo;

	@Column(name = "faxNo")
	private long faxNo;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "pincode")
	private int pincode;

	@Column(name = "country")
	private String country;

	@Column(name = "state")
	private String state;

	@Column(name = "introBy")
	private String introBy;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(long whatsApp) {
		this.whatsApp = whatsApp;
	}

	public long getViberNo() {
		return viberNo;
	}

	public void setViberNo(long viberNo) {
		this.viberNo = viberNo;
	}

	public long getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(long officeNo) {
		this.officeNo = officeNo;
	}

	public long getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(long faxNo) {
		this.faxNo = faxNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIntroBy() {
		return introBy;
	}

	public void setIntroBy(String introBy) {
		this.introBy = introBy;
	}
		

}
