package com.yarncoms.model;

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
