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
	
	@Column(name = "material")
	private String material;
	
	@Column(name="isQualityMaterial")
	private String isQualityMaterial;

	@Column(name = "quality")
	private String quality;

	@Column(name = "cottonType")
	private String cottonType;

	@Column(name = "yarnQuality")
	private String yarnQuality;

	@Column(name = "blendRatio")
	private String blendRatio;

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
	
	@Column(name = "otherMaterial")
	private String otherMaterial;

	@Column(name = "otherMaterialPercentage")
	private String otherMaterialPercentage;

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getIsQualityMaterial() {
		return isQualityMaterial;
	}

	public void setIsQualityMaterial(String isQualityMaterial) {
		this.isQualityMaterial = isQualityMaterial;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
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
	

}
