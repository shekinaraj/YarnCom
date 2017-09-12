package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductTable")
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "productId")
	private Long productId;

	@Column(name = "count")
	private int count;

	@Column(name = "yarnCountIn")
	private String yarnCountIn;

	@Column(name = "countNo")
	private int countNo;

	@Column(name = "Ply")
	private String Ply;

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

	@Column(name = "doubling_Type")
	private String doubling_Type;

	@Column(name = "processed")
	private String processed;

	@Column(name = "material")
	private String material;

	@Column(name = "quality")
	private String quality;

	@Column(name = "product_Description")
	private String product_Descrption;

	@Column(name = "remarks")
	private String remarks;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public int getCountNo() {
		return countNo;
	}

	public void setCountNo(int countNo) {
		this.countNo = countNo;
	}

	public String getPly() {
		return Ply;
	}

	public void setPly(String ply) {
		Ply = ply;
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

	public String getDoubling_Type() {
		return doubling_Type;
	}

	public void setDoubling_Type(String doubling_Type) {
		this.doubling_Type = doubling_Type;
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

	public String getProduct_Descrption() {
		return product_Descrption;
	}

	public void setProduct_Descrption(String product_Descrption) {
		this.product_Descrption = product_Descrption;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
