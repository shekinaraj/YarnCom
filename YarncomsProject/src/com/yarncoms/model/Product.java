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

	@Column(name = "count")
	private int count;

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

	@Column(name = "PVACountInNE")
	private int PVACountInNE;

	@Column(name = "purpose")
	private String purpose;

	@Column(name = "filament")
	private String filament;

	@Column(name = "useFor")
	private String useFor;

	@Column(name = "waxed")
	private String waxed;

	@Column(name = "texturisedType")
	private String texturisedType;

	@Column(name = "denier")
	private int denier;

	@Column(name = "no_Of_Filament")
	private int no_Of_Filament;

	@Column(name = "colour")
	private String colour;

	@Column(name = "texturised_Quality")
	private String texturised_Quality;

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

	@Column(name = "remarks")
	private String remarks;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Long getMaterialId() {
		return materialId;
	}
	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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

	public int getPVACountInNE() {
		return PVACountInNE;
	}

	public void setPVACountInNE(int pVACountInNE) {
		PVACountInNE = pVACountInNE;
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

	public String getTexturisedType() {
		return texturisedType;
	}

	public void setTexturisedType(String texturisedType) {
		this.texturisedType = texturisedType;
	}

	public int getDenier() {
		return denier;
	}

	public void setDenier(int denier) {
		this.denier = denier;
	}

	public int getNo_Of_Filament() {
		return no_Of_Filament;
	}

	public void setNo_Of_Filament(int no_Of_Filament) {
		this.no_Of_Filament = no_Of_Filament;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTexturised_Quality() {
		return texturised_Quality;
	}

	public void setTexturised_Quality(String texturised_Quality) {
		this.texturised_Quality = texturised_Quality;
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

	public String getMaterial() {
		return material;
	}

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
}
