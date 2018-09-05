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

	@Column(name = "blendCotton")
	private String blendCotton;

	@Column(name = "blendPolyester")
	private String blendPolyester;

	@Column(name = "blendViscose")
	private String blendViscose;

	@Column(name = "processed")
	private String processed;

	@Column(name = "colour")
	private String colour;

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
	
	@Column(name = "blendVirginCotton")
	private int blendVirginCotton;
	
	@Column(name = "blendWasteCotton")
	private int blendWasteCotton;
	
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

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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

	@Column(name = "wasteCottonPercentage")
	private int wasteCottonPercentage;
	
	@Column(name = "virginCottonPercentage")
	private int virginCottonPercentage;

	public int getWasteCottonPercentage() {
		return wasteCottonPercentage;
	}

	public void setWasteCottonPercentage(int wasteCottonPercentage) {
		this.wasteCottonPercentage = wasteCottonPercentage;
	}

	public int getVirginCottonPercentage() {
		return virginCottonPercentage;
	}

	public void setVirginCottonPercentage(int virginCottonPercentage) {
		this.virginCottonPercentage = virginCottonPercentage;
	}

	public int getBlendVirginCotton() {
		return blendVirginCotton;
	}

	public void setBlendVirginCotton(int blendVirginCotton) {
		this.blendVirginCotton = blendVirginCotton;
	}

	public int getBlendWasteCotton() {
		return blendWasteCotton;
	}

	public void setBlendWasteCotton(int blendWasteCotton) {
		this.blendWasteCotton = blendWasteCotton;
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
