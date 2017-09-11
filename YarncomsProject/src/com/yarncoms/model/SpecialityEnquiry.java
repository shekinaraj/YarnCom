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
@Table(name = "speciality_enquiry")
public class SpecialityEnquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enquiryId")
	private long enquiryId;

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

	@Column(name = "yarnCountIn")
	private String yarnCountIn;

	@Column(name = "ply")
	private String ply;

	@Column(name = "specifyPly")
	private String specifyPly;

	@Column(name = "useFor")
	private String useFor;

	@Column(name = "material")
	private String material;

	@Column(name = "process")
	private String process;

	@Column(name = "cottonType")
	private String cottonType;

	@Column(name = "yarnType")
	private String yarnType;

	@Column(name = "filament")
	private String filament;

	@Column(name = "remarks")
	private String remarks;

	public long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(long enquiryId) {
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

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getYarnCountIn() {
		return yarnCountIn;
	}

	public void setYarnCountIn(String yarnCountIn) {
		this.yarnCountIn = yarnCountIn;
	}

	public String getPly() {
		return ply;
	}

	public void setPly(String ply) {
		this.ply = ply;
	}

	public String getSpecifyPly() {
		return specifyPly;
	}

	public void setSpecifyPly(String specifyPly) {
		this.specifyPly = specifyPly;
	}

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getCottonType() {
		return cottonType;
	}

	public void setCottonType(String cottonType) {
		this.cottonType = cottonType;
	}

	public String getYarnType() {
		return yarnType;
	}

	public void setYarnType(String yarnType) {
		this.yarnType = yarnType;
	}

	public String getFilament() {
		return filament;
	}

	public void setFilament(String filament) {
		this.filament = filament;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}