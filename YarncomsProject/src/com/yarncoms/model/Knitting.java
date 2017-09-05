package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="knitting")
public class Knitting {
	
	@Id
	@GeneratedValue
	
	@Column(name="knittingId")
	private Long knittingId;
	
	@Column(name="yarnEnquiryId")
	private Long yarnEnquiryId;
	
	@Column(name="waxed")
	private String waxed;
	
	@Column(name = "count")
	private int count;
	
	@Column(name = "typeOfYarn")
	private String typeOfYarn;
	
	@Column(name = "yarnCountIn")
	private String yarnCountIn;
	
	@Column(name = "countNo")
	private Long countNo;
	
	@Column(name = "ply")
	private String ply;
	
	@Column(name = "specifyPly")
	private String specifyPly;
	
	@Column(name = "yarnType")
	private String yarnType;
	
	@Column(name = "coreDenier")
	private String coreDenier;
	
	@Column(name = "PVACountInNE")
	private Long PVACountInNE;
	
	@Column(name = "Usagee")
	private Long Usagee;
	
	@Column(name = "quality")
	private String quality;
	
	@Column(name = "material")
	private String material;
	
	@Column(name = "cottonType")
	private String cottonType;
		
	@Column(name = "yarnQuality")
	private String yarnQuality;
	
	@Column(name ="fibreBlend")
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
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "denier")
	private String denier;
	
	@Column(name = "noOfFilament")
	private String noOfFilament;
	
	@Column(name = "colour")
	private String colour;
	
	@Column(name = "doublingType")
	private String doublingType;
	
	@Column(name = "processed")
	private String processed;
	
	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "remarks")
	private String remarks;

	public Long getKnittingId() {
		return knittingId;
	}

	public void setKnittingId(Long knittingId) {
		this.knittingId = knittingId;
	}

	
	public Long getYarnEnquiryId() {
		return yarnEnquiryId;
	}

	public void setYarnEnquiryId(Long yarnEnquiryId) {
		this.yarnEnquiryId = yarnEnquiryId;
	}

	public String getWaxed() {
		return waxed;
	}

	public void setWaxed(String waxed) {
		this.waxed = waxed;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getTypeOfYarn() {
		return typeOfYarn;
	}

	public void setTypeOfYarn(String typeOfYarn) {
		this.typeOfYarn = typeOfYarn;
	}

	public String getYarnCountIn() {
		return yarnCountIn;
	}

	public void setYarnCountIn(String yarnCountIn) {
		this.yarnCountIn = yarnCountIn;
	}

	public Long getCountNo() {
		return countNo;
	}

	public void setCountNo(Long countNo) {
		this.countNo = countNo;
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

	public Long getPVACountInNE() {
		return PVACountInNE;
	}

	public void setPVACountInNE(Long pVACountInNE) {
		PVACountInNE = pVACountInNE;
	}

	
	public Long getUsagee() {
		return Usagee;
	}

	public void setUsagee(Long usagee) {
		Usagee = usagee;
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

	public String getYarnQuality() {
		return yarnQuality;
	}

	public void setYarnQuality(String yarnQuality) {
		this.yarnQuality = yarnQuality;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDenier() {
		return denier;
	}

	public void setDenier(String denier) {
		this.denier = denier;
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
