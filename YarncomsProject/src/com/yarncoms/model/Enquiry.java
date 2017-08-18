package com.yarncoms.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enquirydetails")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "enquiryid")
	private Long enquiryId;
	
	/*private Timestamp enquiryDate = new Timestamp(System.currentTimeMillis());*/
	
	
	/*@Column(name = "enquirydate")
	Timestamp stamp = new Timestamp(System.currentTimeMillis());
	@SuppressWarnings("deprecation")
	private Date enquiryDate = new Date(stamp.getDate());
*/	
	@Column(name = "enquirydate")
	private String enquiryDate = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	
	
	@Column(name = "enquiryfrom")
	private String enquiryFrom;
	
	
	@Column(name = "commission")
	private String commission;
	
	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "enquirysource")
	private String enquirySource;
	
	@Column(name = "enquiryreferredby")
	private String enquiryReferredBy;
	
	@Column(name = "priority")
	private String priority;
	
	@Column(name = "remarks")
	private String remarks;
	
	public Enquiry() {
	}

	public Enquiry(Enquiry enquiry) {
		this.enquiryId = enquiry.enquiryId;
	//	this.enquiryDate = enquiry.enquiryDate;
		this.enquiryFrom = enquiry.enquiryFrom;
		this.commission = enquiry.commission;
		this.customerName =enquiry.customerName;
		this.enquirySource = enquiry.enquirySource;
		this.enquiryReferredBy = enquiry.enquiryReferredBy;
		this.priority= enquiry.priority;
		this.remarks = enquiry.remarks;
	}

	public Long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}


	

	public String getEnquiryDate() {
		return enquiryDate;
	}

	public void setEnquiryDate(String enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	public String getEnquiryFrom() {
		return enquiryFrom;
	}

	public void setEnquiryFrom(String enquiryFrom) {
		this.enquiryFrom = enquiryFrom;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEnquirySource() {
		return enquirySource;
	}

	public void setEnquirySource(String enquirySource) {
		this.enquirySource = enquirySource;
	}

	public String getEnquiryReferredBy() {
		return enquiryReferredBy;
	}

	public void setEnquiryReferredBy(String enquiryReferredBy) {
		this.enquiryReferredBy = enquiryReferredBy;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
