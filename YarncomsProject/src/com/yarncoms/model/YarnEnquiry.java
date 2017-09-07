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
@Table(name = "yarn_enquiry")
public class YarnEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "yarnEnquiryId")
	private Long yarnEnquiryId;
	
	@Column(name = "enquiryId")
	private Long enquiryId;

	@Column(name = "enquirydate")
	private String enquiryDate = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());

	@Column(name = "enquiryFrom")
	private String enquiryFrom;

	@Column(name = "commission")
	private String commission;

	@Column(name = "customerName")
	private String customerName;

	@Column(name = "contactNo")
	private long contactNo;

	@Column(name = "agentName")
	private String agentName;

	@Column(name = "enquirysource")
	private String enquirySource;

	@Column(name = "enquiryreferredby")
	private String enquiryReferredBy;

	@Column(name = "priority")
	private String priority;

	
	@Column(name = "purpose")
	private String purpose;

	@Column(name = "count")
	private int count;

	@Column(name = "remark")
	private String remark;
	
	public YarnEnquiry() {
		
	}
	
	public YarnEnquiry(YarnEnquiry yarnEnquiry) {
		this.yarnEnquiryId = yarnEnquiry.yarnEnquiryId;
		this.count = yarnEnquiry.count;
		this.remark = yarnEnquiry.remark;
	}

	public Long getYarnEnquiryId() {
		return yarnEnquiryId;
	}

	public void setYarnEnquiryId(Long yarnEnquiryId) {
		this.yarnEnquiryId = yarnEnquiryId;
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

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	


	
}
