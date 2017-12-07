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
	
	@Column(name = "prefix")
	private String prefix = "Y";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@Column(name = "name")
	private String name;
	
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
	
	@Column(name = "purpose")
	private String purpose;
	
	@Column(name = "waxed")
	private String waxed;
	
	@Column(name = "typeofYarn")
	private String typeofYarn;

	@Column(name = "yarnCountIn")
	private String yarnCountIn;
	
	@Column(name = "count")
	private String count;
	
	@Column(name = "ply")
	private String ply;
	
	@Column(name = "specifyPly")
	private String specifyPly;
	
	@Column(name = "doublingType")
	private String doublingType;
	
	@Column(name = "usagee")
	private String usagee;
	
	@Column(name = "yarnType")
	private String yarnType;

	@Column(name = "coreDenier")
	private String coreDenier;

	@Column(name = "pVACountInNE")
	private String pVACountInNE;

	@Column(name = "yarnQuality")
	private String yarnQuality;

	@Column(name = "quality")
	private String quality;

	@Column(name = "material")
	private String material;

	@Column(name = "cottonType")
	private String cottonType;

	@Column(name = "filament")
	private String filament;

	@Column(name = "colour")
	private String colour;

	@Column(name = "blendRatio")
	private String blendRatio;

	@Column(name = "blendCotton")
	private String blendCotton;

	@Column(name = "blendPolyester")
	private String blendPolyester;

	@Column(name = "blendViscose")
	private String blendViscose;

	@Column(name = "otherMaterial")
	private String otherMaterial;

	@Column(name = "otherMaterialPercentage")
	private String otherMaterialPercentage;

	@Column(name = "countType")
	private String countType;

	@Column(name = "materialType")
	private String materialType;

	@Column(name = "texDenier")
	private String texDenier;
	
	@Column(name = "fibreBlend")
	private String fibreBlend;
	
	@Column(name = "dyed")
	private String dyed;
	
	@Column(name = "wasteTypeCotton")
	private String wasteTypeCotton;
	
	@Column(name = "wasteTypePolyester")
	private String wasteTypePolyester;
	
	@Column(name = "wasteTypeViscose")
	private String wasteTypeViscose;

	@Column(name = "processed")
	private String processed;

	@Column(name = "processingType")
	private String processingType;

	@Column(name = "yarnPackage")
	private String yarnPackage;
	
	@Column(name = "hankType")
	private String hankType;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "remarks")
	private String remarks;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}

	public Long getCvId() {
		return cvId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getTypeofYarn() {
		return typeofYarn;
	}

	public void setTypeofYarn(String typeofYarn) {
		this.typeofYarn = typeofYarn;
	}

	public String getYarnCountIn() {
		return yarnCountIn;
	}

	public void setYarnCountIn(String yarnCountIn) {
		this.yarnCountIn = yarnCountIn;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
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

	public String getDoublingType() {
		return doublingType;
	}

	public void setDoublingType(String doublingType) {
		this.doublingType = doublingType;
	}

	public String getUsagee() {
		return usagee;
	}

	public void setUsagee(String usagee) {
		this.usagee = usagee;
	}

	public String getYarnType() {
		return yarnType;
	}

	public void setYarnType(String yarnType) {
		this.yarnType = yarnType;
	}

	public String getCoreDenier() {
		return coreDenier;
	}

	public void setCoreDenier(String coreDenier) {
		this.coreDenier = coreDenier;
	}

	public String getpVACountInNE() {
		return pVACountInNE;
	}

	public void setpVACountInNE(String pVACountInNE) {
		this.pVACountInNE = pVACountInNE;
	}

	public String getYarnQuality() {
		return yarnQuality;
	}

	public void setYarnQuality(String yarnQuality) {
		this.yarnQuality = yarnQuality;
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

	public String getCottonType() {
		return cottonType;
	}

	public void setCottonType(String cottonType) {
		this.cottonType = cottonType;
	}

	public String getFilament() {
		return filament;
	}

	public void setFilament(String filament) {
		this.filament = filament;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBlendRatio() {
		return blendRatio;
	}

	public void setBlendRatio(String blendRatio) {
		this.blendRatio = blendRatio;
	}

	public String getBlendCotton() {
		return blendCotton;
	}

	public void setBlendCotton(String blendCotton) {
		this.blendCotton = blendCotton;
	}

	public String getBlendPolyester() {
		return blendPolyester;
	}

	public void setBlendPolyester(String blendPolyester) {
		this.blendPolyester = blendPolyester;
	}

	public String getBlendViscose() {
		return blendViscose;
	}

	public void setBlendViscose(String blendViscose) {
		this.blendViscose = blendViscose;
	}

	public String getOtherMaterial() {
		return otherMaterial;
	}

	public void setOtherMaterial(String otherMaterial) {
		this.otherMaterial = otherMaterial;
	}

	public String getOtherMaterialPercentage() {
		return otherMaterialPercentage;
	}

	public void setOtherMaterialPercentage(String otherMaterialPercentage) {
		this.otherMaterialPercentage = otherMaterialPercentage;
	}

	public String getCountType() {
		return countType;
	}

	public void setCountType(String countType) {
		this.countType = countType;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getTexDenier() {
		return texDenier;
	}

	public void setTexDenier(String texDenier) {
		this.texDenier = texDenier;
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

	public String getWasteTypePolyester() {
		return wasteTypePolyester;
	}

	public void setWasteTypePolyester(String wasteTypePolyester) {
		this.wasteTypePolyester = wasteTypePolyester;
	}

	public String getWasteTypeViscose() {
		return wasteTypeViscose;
	}

	public void setWasteTypeViscose(String wasteTypeViscose) {
		this.wasteTypeViscose = wasteTypeViscose;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getProcessingType() {
		return processingType;
	}

	public void setProcessingType(String processingType) {
		this.processingType = processingType;
	}

	public String getYarnPackage() {
		return yarnPackage;
	}

	public void setYarnPackage(String yarnPackage) {
		this.yarnPackage = yarnPackage;
	}

	public String getHankType() {
		return hankType;
	}

	public void setHankType(String hankType) {
		this.hankType = hankType;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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
