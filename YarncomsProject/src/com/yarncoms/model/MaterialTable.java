package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Material")
public class MaterialTable {

	@Id
	@GeneratedValue

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

	@Column(name = "blendPrecentagePolyster")
	private String blendPrecentagePolyster;

	@Column(name = "blendPrecentageViscose")
	private String blendPrecentageViscose;

	@Column(name = "process")
	private String process;

	@Column(name = "colour")
	private String colour;

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

	public String getBlendPrecentagePolyster() {
		return blendPrecentagePolyster;
	}

	public void setBlendPrecentagePolyster(String blendPrecentagePolyster) {
		this.blendPrecentagePolyster = blendPrecentagePolyster;
	}

	public String getBlendPrecentageViscose() {
		return blendPrecentageViscose;
	}

	public void setBlendPrecentageViscose(String blendPrecentageViscose) {
		this.blendPrecentageViscose = blendPrecentageViscose;
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

}
