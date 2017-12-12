package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerVisit")
public class CustomerVisit {
	
	@Column(name = "prefix")
	private String prefix = "CV";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "customerVisitId")
	private String customerVisitId;
	
	@Column(name = "customerType")
	private String customerType;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "technicalPerson")
	private String technicalPerson;
	
	@Column(name = "dateOfVisit")
	private String dateOfVisit;
	
	@Column(name = "purposeOfVisit")
	private String purposeOfVisit;
	
	@Column(name = "contactPersonName")
	private String contactPersonName;
	
	@Column(name = "typeOfIndustry")
	private String typeOfIndustry;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "countryCode")
	private String countryCode;
	
	@Column(name = "mobileNumber")
	private String mobileNumber;

	@Column(name = "comments")
	private String comments;
	
	@Column(name = "remarks")
	private String remarks;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getCustomerVisitId() {
		return customerVisitId;
	}

	public void setCustomerVisitId(String customerVisitId) {
		this.customerVisitId = customerVisitId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTechnicalPerson() {
		return technicalPerson;
	}

	public void setTechnicalPerson(String technicalPerson) {
		this.technicalPerson = technicalPerson;
	}

	public String getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}

	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getTypeOfIndustry() {
		return typeOfIndustry;
	}

	public void setTypeOfIndustry(String typeOfIndustry) {
		this.typeOfIndustry = typeOfIndustry;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "CustomerVisit [customerVisitId=" + customerVisitId
				+ ", companyName=" + companyName + ", dateOfVisit="
				+ dateOfVisit + ", purposeOfVisit=" + purposeOfVisit
				+ ", contactPersonName=" + contactPersonName
				+ ", typeOfIndustry=" + typeOfIndustry + ", designation="
				+ designation + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + ", comments=" + comments + ", remarks="
				+ remarks + "]";
	}
		
}
