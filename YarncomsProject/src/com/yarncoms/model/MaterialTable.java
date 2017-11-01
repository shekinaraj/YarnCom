package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Material")
public class MaterialTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "materialId")
	private Long materialId;
	
	@Column(name = "materialName")
	private String materialName;

	@Column(name = "isQualityMaterial")
	private String isQualityMaterial;

	@Column(name = "cottonType")
	private String cottonType;

	@Column(name = "yarnQuality")
	private String yarnQuality;

	@Column(name = "BlendRatio")
	private String BlendRatio;

	@Column(name = "blendPercentageCotton")
	private String blendPercentageCotton;

	@Column(name = "blendPercentagePolyster")
	private String blendPercentagePolyster;

	@Column(name = "blendPercentageViscose")
	private String blendPercentageViscose;

	@Column(name = "process")
	private String process;

	@Column(name = "colour")
	private String colour;
	
	@Column(name = "qualityName")
	private String qualityName;

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
	
	@Column(name = "weavingOtherMaterial")
	private String weavingOtherMaterial;

	@Column(name = "weavingOtherMaterialPercentage")
	private String weavingOtherMaterialPercentage;

	@Column(name = "virginTypeCotton")
	private String virginTypeCotton;

	@Column(name = "virginTypePolyster")
	private String virginTypePolyster;

	@Column(name = "virginTypeViscose")
	private String virginTypeViscose;

	@Column(name = "blendYarnQuality")
	private String blendYarnQuality;
	
	/*
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
*/	
	
	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getIsQualityMaterial() {
		return isQualityMaterial;
	}

	public void setIsQualityMaterial(String isQualityMaterial) {
		this.isQualityMaterial = isQualityMaterial;
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

	public String getBlendRatio() {
		return BlendRatio;
	}

	public void setBlendRatio(String blendRatio) {
		BlendRatio = blendRatio;
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

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getQualityName() {
		return qualityName;
	}

	public void setQualityName(String qualityName) {
		this.qualityName = qualityName;
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

	public String getBlendYarnQuality() {
		return blendYarnQuality;
	}

	public void setBlendYarnQuality(String blendYarnQuality) {
		this.blendYarnQuality = blendYarnQuality;
	}

}
