package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private Long productId;

	@Column(name = "materialId")
	private Long materialId;

	@Column(name = "customerId")
	private String customerId;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "enquiryFor")
	private String enquiryFor;

	@Column(name = "count")
	private String count;
	
	@Column(name = "yarnPackage")
	private String yarnPackage;
	
	@Column(name = "hankType")
	private String hankType;

	@Column(name = "countType")
	private String countType;

	@Column(name = "yarnCountIn")
	private String yarnCountIn;

	@Column(name = "ply")
	private String ply;

	@Column(name = "yarnQuality")
	private String yarnQuality;

	@Column(name = "usagee")
	private String usagee;

	@Column(name = "typeofYarn")
	private String typeofYarn;

	@Column(name = "specifyPly")
	private String specifyPly;

	@Column(name = "yarnType")
	private String yarnType;

	@Column(name = "coreDenier")
	private int coreDenier;

	@Column(name = "pVACountInNE")
	private int pVACountInNE;

	@Column(name = "purpose")
	private String purpose;

	@Column(name = "filament")
	private String filament;

	@Column(name = "useFor")
	private String useFor;

	@Column(name = "waxed")
	private String waxed;

	@Column(name = "materialType")
	private String materialType;

	@Column(name = "specialityType")
	private String specialityType;

	@Column(name = "texDenier")
	private String texDenier;

	@Column(name = "colour")
	private String colour;

	@Column(name = "doublingType")
	private String doublingType;

	@Column(name = "processed")
	private String processed;

	@Column(name = "material")
	private String material;

	@Column(name = "quality")
	private String quality;

	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "subject")
	private String subject;

	@Column(name = "remarks")
	private String remarks;

	
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEnquiryFor() {
		return enquiryFor;
	}

	public void setEnquiryFor(String enquiryFor) {
		this.enquiryFor = enquiryFor;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
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

	public String getCountType() {
		return countType;
	}

	public void setCountType(String countType) {
		this.countType = countType;
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

	public String getYarnQuality() {
		return yarnQuality;
	}

	public void setYarnQuality(String yarnQuality) {
		this.yarnQuality = yarnQuality;
	}

	public String getUsagee() {
		return usagee;
	}

	public void setUsagee(String usagee) {
		this.usagee = usagee;
	}

	public String getTypeofYarn() {
		return typeofYarn;
	}

	public void setTypeofYarn(String typeofYarn) {
		this.typeofYarn = typeofYarn;
	}

	public String getSpecifyPly() {
		return specifyPly;
	}

	public void setSpecifyPly(String specifyPly) {
		this.specifyPly = specifyPly;
	}

	public String getYarnType() {
		return yarnType;
	}

	public void setYarnType(String yarnType) {
		this.yarnType = yarnType;
	}

	public int getCoreDenier() {
		return coreDenier;
	}

	public void setCoreDenier(int coreDenier) {
		this.coreDenier = coreDenier;
	}

	public int getpVACountInNE() {
		return pVACountInNE;
	}

	public void setpVACountInNE(int pVACountInNE) {
		this.pVACountInNE = pVACountInNE;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getFilament() {
		return filament;
	}

	public void setFilament(String filament) {
		this.filament = filament;
	}

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
	}

	public String getWaxed() {
		return waxed;
	}

	public void setWaxed(String waxed) {
		this.waxed = waxed;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getSpecialityType() {
		return specialityType;
	}

	public void setSpecialityType(String specialityType) {
		this.specialityType = specialityType;
	}

	public String getTexDenier() {
		return texDenier;
	}

	public void setTexDenier(String texDenier) {
		this.texDenier = texDenier;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMaterial() {
		return material;
	}
}
