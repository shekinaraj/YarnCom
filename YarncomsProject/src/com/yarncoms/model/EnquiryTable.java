package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name = "enquirytable")
public class EnquiryTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "cvEnquiryId")
	private long cvEnquiryId;

	@Column(name = "enquiryId")
	private long enquiryId;

	@Column(name = "enquiryFrom")
	private String enquiryFrom;

	@Column(name = "name")
	private String name;

	@Column(name = "contactNo")
	private long contactNo;

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

	@Column(name = "remarks")
	private String remarks;

	public long getCvEnquiryId() {
		return cvEnquiryId;
	}

	public void setCvEnquiryId(long cvEnquiryId) {
		this.cvEnquiryId = cvEnquiryId;
	}

	public long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(long enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquiryFrom() {
		return enquiryFrom;
	}

	public void setEnquiryFrom(String enquiryFrom) {
		this.enquiryFrom = enquiryFrom;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public StoredProcedureQuery createStoredProcedureQuery(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}