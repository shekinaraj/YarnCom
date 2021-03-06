package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enquirytable")
public class EnquiryTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "cvEnquiryId")
	private long cvEnquiryId;

	@Column(name = "enquiryId")
	private String enquiryId;

	@Column(name = "enquiryFrom")
	private String enquiryFrom;
	
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
	
	@Column(name = "viberNo")
	private String viberNo;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "otherCountry")
	private String otherCountry;

	@Column(name = "technicalPerson")
	private String technicalPerson;

	@Column(name = "enqDate")
	private String enqDate;

	@Column(name = "enqStatus")
	private String enqStatus;

	@Column(name = "enqLevel")
	private int enqLevel;

	@Column(name = "reasonforClosing")
	private String reasonforClosing;
	
	@Column(name = "count")
	private String count;
	
	@Column(name = "warpCount")
	private Long warpCount;
	
	@Column(name = "weftCount")
	private Long weftCount;
	
	@Column(name = "productDescription")
	private String productDescription;

	@Column(name = "remarks")
	private String remarks;

	public long getCvEnquiryId() {
		return cvEnquiryId;
	}

	public void setCvEnquiryId(long cvEnquiryId) {
		this.cvEnquiryId = cvEnquiryId;
	}

	public String getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquiryFrom() {
		return enquiryFrom;
	}

	public void setEnquiryFrom(String enquiryFrom) {
		this.enquiryFrom = enquiryFrom;
	}

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

	public String getViberNo() {
		return viberNo;
	}

	public void setViberNo(String viberNo) {
		this.viberNo = viberNo;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
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

	public String getTechnicalPerson() {
		return technicalPerson;
	}

	public void setTechnicalPerson(String technicalPerson) {
		this.technicalPerson = technicalPerson;
	}

	public String getEnqDate() {
		return enqDate;
	}

	public void setEnqDate(String enqDate) {
		this.enqDate = enqDate;
	}

	public String getEnqStatus() {
		return enqStatus;
	}

	public void setEnqStatus(String enqStatus) {
		this.enqStatus = enqStatus;
	}

	public int getEnqLevel() {
		return enqLevel;
	}

	public void setEnqLevel(int enqLevel) {
		this.enqLevel = enqLevel;
	}

	public String getReasonforClosing() {
		return reasonforClosing;
	}

	public void setReasonforClosing(String reasonforClosing) {
		this.reasonforClosing = reasonforClosing;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
