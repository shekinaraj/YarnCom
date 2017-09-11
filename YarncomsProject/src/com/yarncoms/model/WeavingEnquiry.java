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
@Table(name = "weavingenquiry")
public class WeavingEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "enquiryId")
	private Long enquiryId;

	@Column(name = "enquirydate")
	private String enquiryDate = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());

	@Column(name = "enquiryFrom")
	private String enquiryFrom;

	@Column(name = "commission")
	private String commission;

	@Column(name = "name")
	private String name;

	@Column(name = "contactNo")
	private long contactNo;
	
	@Column(name = "technicalPerson")
	private String technicalPerson;

	@Column(name = "enquirysource")
	private String enquirySource;

	@Column(name = "enquiryreferredby")
	private String enquiryReferredBy;

	@Column(name = "priority")
	private String priority;
	
	@Column(name = "purpose")
	private String purpose;

	@Column(name = "waxed")
	private String waxed;

	@Column(name = "weavingCount")
	private Long weavingCount;

	@Column(name = "typeofYarn")
	private String typeofYarn;

	@Column(name = "weavingYarnCountIn")
	private String weavingYarnCountIn;

	@Column(name = "weavingCountNo")
	private Long weavingCountNo;

	@Column(name = "weavingPly")
	private String weavingPly;

	@Column(name = "weavingSpecifyPly")
	private Long weavingSpecifyPly;

	@Column(name = "weavingYarnType")
	private String weavingYarnType;

	@Column(name = "weavingCoreDenier")
	private String weavingCoreDenier;

	@Column(name = "weavingPVACountInNE")
	private Long weavingPVACountInNE;

	@Column(name = "usagee")
	private String usagee;

	@Column(name = "quality")
	private String quality;

	@Column(name = "material")
	private String material;

	@Column(name = "weavingYarnCottonType")
	private String weavingYarnCottonType;

	@Column(name = "weavingYarnQuality")
	private String weavingYarnQuality;

	@Column(name = "fibreBlend")
	private String fibreBlend;

	@Column(name = "dyed")
	private String dyed;

	@Column(name = "wasteTypeCotton")
	private String wasteTypeCotton;

	@Column(name = "wasteTypePolyster")
	private String wasteTypePolyster;

	@Column(name = "wasteTypeViscose")
	private String wasteTypeViscose;

	@Column(name = "virginTypeCotton")
	private String virginTypeCotton;

	@Column(name = "virginTypePolyster")
	private String virginTypePolyster;

	@Column(name = "virginTypeViscose")
	private String virginTypeViscose;

	@Column(name = "blendRatio")
	private String blendRatio;

	@Column(name = "blendPercentageCotton")
	private String blendPercentageCotton;

	@Column(name = "blendPercentagePolyster")
	private String blendPercentagePolyster;

	@Column(name = "blendPercentageViscose")
	private String blendPercentageViscose;

	@Column(name = "weavingOtherMaterial")
	private String weavingOtherMaterial;

	@Column(name = "weavingOtherMaterialPercentage")
	private String weavingOtherMaterialPercentage;

	@Column(name = "countType")
	private String countType;

	@Column(name = "weavingType")
	private String weavingType;

	@Column(name = "weavingDenier")
	private String weavingDenier;

	@Column(name = "noOfFilament")
	private String noOfFilament;

	@Column(name = "colour")
	private String colour;

	@Column(name = "doublingType")
	private String doublingType;

	@Column(name = "processed")
	private String processed;

	@Column(name = "processingType")
	private String processingType;

	@Column(name = "productDescription")
	private String productDescription;

	@Column(name = "remarks")
	private String remarks;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
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

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getWaxed() {
		return waxed;
	}

	public void setWaxed(String waxed) {
		this.waxed = waxed;
	}

	public Long getWeavingCount() {
		return weavingCount;
	}

	public void setWeavingCount(Long weavingCount) {
		this.weavingCount = weavingCount;
	}

	public String getTypeofYarn() {
		return typeofYarn;
	}

	public void setTypeofYarn(String typeofYarn) {
		this.typeofYarn = typeofYarn;
	}

	public String getWeavingYarnCountIn() {
		return weavingYarnCountIn;
	}

	public void setWeavingYarnCountIn(String weavingYarnCountIn) {
		this.weavingYarnCountIn = weavingYarnCountIn;
	}

	public Long getWeavingCountNo() {
		return weavingCountNo;
	}

	public void setWeavingCountNo(Long weavingCountNo) {
		this.weavingCountNo = weavingCountNo;
	}

	public String getWeavingPly() {
		return weavingPly;
	}

	public void setWeavingPly(String weavingPly) {
		this.weavingPly = weavingPly;
	}

	public Long getWeavingSpecifyPly() {
		return weavingSpecifyPly;
	}

	public void setWeavingSpecifyPly(Long weavingSpecifyPly) {
		this.weavingSpecifyPly = weavingSpecifyPly;
	}

	public String getWeavingYarnType() {
		return weavingYarnType;
	}

	public void setWeavingYarnType(String weavingYarnType) {
		this.weavingYarnType = weavingYarnType;
	}

	public String getWeavingCoreDenier() {
		return weavingCoreDenier;
	}

	public void setWeavingCoreDenier(String weavingCoreDenier) {
		this.weavingCoreDenier = weavingCoreDenier;
	}

	public Long getWeavingPVACountInNE() {
		return weavingPVACountInNE;
	}

	public void setWeavingPVACountInNE(Long weavingPVACountInNE) {
		this.weavingPVACountInNE = weavingPVACountInNE;
	}

	public String getUsagee() {
		return usagee;
	}

	public void setUsagee(String usagee) {
		this.usagee = usagee;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getWeavingYarnCottonType() {
		return weavingYarnCottonType;
	}

	public void setWeavingYarnCottonType(String weavingYarnCottonType) {
		this.weavingYarnCottonType = weavingYarnCottonType;
	}

	public String getWeavingYarnQuality() {
		return weavingYarnQuality;
	}

	public void setWeavingYarnQuality(String weavingYarnQuality) {
		this.weavingYarnQuality = weavingYarnQuality;
	}

	public String getFibreBlend() {
		return fibreBlend;
	}

	public void setFibreBlend(String fibreBlend) {
		this.fibreBlend = fibreBlend;
	}

	public String getDyed() {
		return dyed;
	}

	public void setDyed(String dyed) {
		this.dyed = dyed;
	}

	public String getWasteTypeCotton() {
		return wasteTypeCotton;
	}

	public void setWasteTypeCotton(String wasteTypeCotton) {
		this.wasteTypeCotton = wasteTypeCotton;
	}

	public String getWasteTypePolyster() {
		return wasteTypePolyster;
	}

	public void setWasteTypePolyster(String wasteTypePolyster) {
		this.wasteTypePolyster = wasteTypePolyster;
	}

	public String getWasteTypeViscose() {
		return wasteTypeViscose;
	}

	public void setWasteTypeViscose(String wasteTypeViscose) {
		this.wasteTypeViscose = wasteTypeViscose;
	}

	public String getVirginTypeCotton() {
		return virginTypeCotton;
	}

	public void setVirginTypeCotton(String virginTypeCotton) {
		this.virginTypeCotton = virginTypeCotton;
	}

	public String getVirginTypePolyster() {
		return virginTypePolyster;
	}

	public void setVirginTypePolyster(String virginTypePolyster) {
		this.virginTypePolyster = virginTypePolyster;
	}

	public String getVirginTypeViscose() {
		return virginTypeViscose;
	}

	public void setVirginTypeViscose(String virginTypeViscose) {
		this.virginTypeViscose = virginTypeViscose;
	}

	public String getBlendRatio() {
		return blendRatio;
	}

	public void setBlendRatio(String blendRatio) {
		this.blendRatio = blendRatio;
	}

	public String getBlendPercentageCotton() {
		return blendPercentageCotton;
	}

	public void setBlendPercentageCotton(String blendPercentageCotton) {
		this.blendPercentageCotton = blendPercentageCotton;
	}

	public String getBlendPercentagePolyster() {
		return blendPercentagePolyster;
	}

	public void setBlendPercentagePolyster(String blendPercentagePolyster) {
		this.blendPercentagePolyster = blendPercentagePolyster;
	}

	public String getBlendPercentageViscose() {
		return blendPercentageViscose;
	}

	public void setBlendPercentageViscose(String blendPercentageViscose) {
		this.blendPercentageViscose = blendPercentageViscose;
	}

	public String getWeavingOtherMaterial() {
		return weavingOtherMaterial;
	}

	public void setWeavingOtherMaterial(String weavingOtherMaterial) {
		this.weavingOtherMaterial = weavingOtherMaterial;
	}

	public String getWeavingOtherMaterialPercentage() {
		return weavingOtherMaterialPercentage;
	}

	public void setWeavingOtherMaterialPercentage(String weavingOtherMaterialPercentage) {
		this.weavingOtherMaterialPercentage = weavingOtherMaterialPercentage;
	}

	public String getCountType() {
		return countType;
	}

	public void setCountType(String countType) {
		this.countType = countType;
	}

	public String getProcessingType() {
		return processingType;
	}

	public void setProcessingType(String processingType) {
		this.processingType = processingType;
	}

	public String getWeavingType() {
		return weavingType;
	}

	public void setWeavingType(String weavingType) {
		this.weavingType = weavingType;
	}

	public String getWeavingDenier() {
		return weavingDenier;
	}

	public void setWeavingDenier(String weavingDenier) {
		this.weavingDenier = weavingDenier;
	}

	public String getNoOfFilament() {
		return noOfFilament;
	}

	public void setNoOfFilament(String noOfFilament) {
		this.noOfFilament = noOfFilament;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDoublingType() {
		return doublingType;
	}

	public void setDoublingType(String doublingType) {
		this.doublingType = doublingType;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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
