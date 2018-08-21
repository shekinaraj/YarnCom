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
@Table(name = "FabricEnquiry")
public class FabricEnquiry{
	
	@Column(name = "prefix")
	private String prefix = "F";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "enquiryId")
	private Long enquiryId;
	
	@Column(name = "cvId")
	private Long cvId;

	@Column(name = "enquirydate")
	private String enquiryDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

	@Column(name = "enquiryFrom")
	private String enquiryFrom;

	@Column(name = "commission")
	private String commission;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "contactPersonName")
	private String contactPersonName;

	@Column(name = "countryCode")
	private String countryCode;
	
	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "technicalPerson")
	private String technicalPerson;
	
	@Column(name = "enquirysource")
	private String enquirySource;

	@Column(name = "enquiryreferredby")
	private String enquiryReferredBy;

	@Column(name = "priority")
	private String priority;
	
	@Column(name = "enquiryFor")
	private String enquiryFor;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "warpCount")
	private Long warpCount;

	@Column(name = "warpPly")
	private String warpPly;

	@Column(name = "warpSpecifyPly")
	private Long warpSpecifyPly;

	@Column(name = "warpYarnQuality")
	private String warpYarnQuality;

	@Column(name = "warpYarnType")
	private String warpYarnType;

	@Column(name = "warpCoreDenier")
	private int warpCoreDenier;

	@Column(name = "warpPVACountInNE")
	private int warpPVACountInNE;

	@Column(name = "weftCount")
	private Long weftCount;

	@Column(name = "weftPly")
	private String weftPly;

	@Column(name = "weftSpecificPly")
	private Long weftSpecificPly;

	@Column(name = "weftYarnQuality")
	private String weftYarnQuality;

	@Column(name = "weftYarnType")
	private String weftYarnType;

	@Column(name = "weftCoreDenier")
	private Long weftCoreDenier;

	@Column(name = "weftPVACountInNe")
	private Long weftPVACountInNe;

	@Column(name = "material")
	private String material;

	@Column(name = "epi")
	private Long epi;

	@Column(name = "ppi")
	private Long ppi;

	@Column(name = "pickInsertion")
	private String pickInsertion;

	@Column(name = "parallelValue")
	private String parallelValue;

	@Column(name = "width")
	private int width;

	@Column(name = "weaveType")
	private String weaveType;

	@Column(name = "specificWeaveType")
	private String specificWeaveType;

	@Column(name = "widthOfStrip")
	private int widthOfStrip;

	@Column(name = "selvedge")
	private String selvedge;

	@Column(name = "specificSelvedge")
	private String specificSelvedge;

	@Column(name = "construction")
	private String construction;
	
	@Column(name = "level")
	private int level;

	@Column(name = "remarks")
	private String remarks;

	public Long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}

	public Long getCvId() {
		return cvId;
	}
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setCvId(Long cvId) {
		this.cvId = cvId;
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

	public String getTechnicalPerson() {
		return technicalPerson;
	}

	public void setTechnicalPerson(String technicalPerson) {
		this.technicalPerson = technicalPerson;
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

	public Long getWarpCount() {
		return warpCount;
	}

	public void setWarpCount(Long warpCount) {
		this.warpCount = warpCount;
	}

	public String getWarpPly() {
		return warpPly;
	}

	public void setWarpPly(String warpPly) {
		this.warpPly = warpPly;
	}

	public Long getWarpSpecifyPly() {
		return warpSpecifyPly;
	}

	public void setWarpSpecifyPly(Long warpSpecifyPly) {
		this.warpSpecifyPly = warpSpecifyPly;
	}

	public String getWarpYarnQuality() {
		return warpYarnQuality;
	}

	public void setWarpYarnQuality(String warpYarnQuality) {
		this.warpYarnQuality = warpYarnQuality;
	}

	public String getWarpYarnType() {
		return warpYarnType;
	}

	public void setWarpYarnType(String warpYarnType) {
		this.warpYarnType = warpYarnType;
	}

	public int getWarpCoreDenier() {
		return warpCoreDenier;
	}

	public void setWarpCoreDenier(int warpCoreDenier) {
		this.warpCoreDenier = warpCoreDenier;
	}

	public int getWarpPVACountInNE() {
		return warpPVACountInNE;
	}

	public void setWarpPVACountInNE(int warpPVACountInNE) {
		this.warpPVACountInNE = warpPVACountInNE;
	}

	public Long getWeftCount() {
		return weftCount;
	}

	public void setWeftCount(Long weftCount) {
		this.weftCount = weftCount;
	}

	public String getWeftPly() {
		return weftPly;
	}

	public void setWeftPly(String weftPly) {
		this.weftPly = weftPly;
	}

	public Long getWeftSpecificPly() {
		return weftSpecificPly;
	}

	public void setWeftSpecificPly(Long weftSpecificPly) {
		this.weftSpecificPly = weftSpecificPly;
	}

	public String getWeftYarnQuality() {
		return weftYarnQuality;
	}

	public void setWeftYarnQuality(String weftYarnQuality) {
		this.weftYarnQuality = weftYarnQuality;
	}

	public String getWeftYarnType() {
		return weftYarnType;
	}

	public void setWeftYarnType(String weftYarnType) {
		this.weftYarnType = weftYarnType;
	}

	public Long getWeftCoreDenier() {
		return weftCoreDenier;
	}

	public void setWeftCoreDenier(Long weftCoreDenier) {
		this.weftCoreDenier = weftCoreDenier;
	}

	public Long getWeftPVACountInNe() {
		return weftPVACountInNe;
	}

	public void setWeftPVACountInNe(Long weftPVACountInNe) {
		this.weftPVACountInNe = weftPVACountInNe;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Long getEpi() {
		return epi;
	}

	public void setEpi(Long epi) {
		this.epi = epi;
	}

	public Long getPpi() {
		return ppi;
	}

	public void setPpi(Long ppi) {
		this.ppi = ppi;
	}

	public String getPickInsertion() {
		return pickInsertion;
	}

	public void setPickInsertion(String pickInsertion) {
		this.pickInsertion = pickInsertion;
	}

	public String getParallelValue() {
		return parallelValue;
	}

	public void setParallelValue(String parallelValue) {
		this.parallelValue = parallelValue;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getWeaveType() {
		return weaveType;
	}

	public void setWeaveType(String weaveType) {
		this.weaveType = weaveType;
	}

	public String getSpecificWeaveType() {
		return specificWeaveType;
	}

	public void setSpecificWeaveType(String specificWeaveType) {
		this.specificWeaveType = specificWeaveType;
	}

	public int getWidthOfStrip() {
		return widthOfStrip;
	}

	public void setWidthOfStrip(int widthOfStrip) {
		this.widthOfStrip = widthOfStrip;
	}

	public String getSelvedge() {
		return selvedge;
	}

	public void setSelvedge(String selvedge) {
		this.selvedge = selvedge;
	}

	public String getSpecificSelvedge() {
		return specificSelvedge;
	}

	public void setSpecificSelvedge(String specificSelvedge) {
		this.specificSelvedge = specificSelvedge;
	}

	public String getConstruction() {
		return construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
