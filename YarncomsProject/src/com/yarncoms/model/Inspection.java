package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inspection")
public class Inspection {
	
	@Column(name = "prefix")
	private String prefix = "I";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "inspectionTableId")
	private long inspectionTableId;
	
	@Column(name = "cvInspectionId")
	private String cvInspectionId;
	
	@Column(name = "customerType")
	private String customerType;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "technicalPerson")
	private String technicalPerson;
	
	@Column(name = "inspectionDate")
	private String inspectionDate;
	
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
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "reasonForClosing")
	private String reasonForClosing;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public long getInspectionTableId() {
		return inspectionTableId;
	}

	public void setInspectionTableId(long inspectionTableId) {
		this.inspectionTableId = inspectionTableId;
	}

	public String getCvInspectionId() {
		return cvInspectionId;
	}

	public void setCvInspectionId(String cvInspectionId) {
		this.cvInspectionId = cvInspectionId;
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

	public String getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReasonForClosing() {
		return reasonForClosing;
	}

	public void setReasonForClosing(String reasonForClosing) {
		this.reasonForClosing = reasonForClosing;
	}
	
	


}
