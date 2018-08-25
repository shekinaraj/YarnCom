package com.yarncoms.model;

import javax.persistence.Column;

public class YarnBase {

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

	public YarnBase(String enquiryId, String enquiryFrom, String enquiryFor, String brand, String companyName,
			String contactPersonName, String contactPersonEmail, String countryCode, String contactNo,
			String technicalPerson, String enqDate, String enqStatus, int enqLevel, String reasonforClosing,
			String count, Long warpCount, Long weftCount, String productDescription, String remarks) {
		this.enquiryId = enquiryId;
		this.enquiryFrom = enquiryFrom;
		this.enquiryFor = enquiryFor;
		this.brand = brand;
		this.companyName = companyName;
		this.contactPersonName = contactPersonName;
		this.contactPersonEmail = contactPersonEmail;
		this.countryCode = countryCode;
		this.contactNo = contactNo;
		this.technicalPerson = technicalPerson;
		this.enqDate = enqDate;
		this.enqStatus = enqStatus;
		this.enqLevel = enqLevel;
		this.reasonforClosing = reasonforClosing;
		this.count = count;
		this.warpCount = warpCount;
		this.weftCount = weftCount;
		this.productDescription = productDescription;
		this.remarks = remarks;
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
