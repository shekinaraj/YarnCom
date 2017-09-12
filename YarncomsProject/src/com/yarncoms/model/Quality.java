package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Quality")
public class Quality {
	
	@Id
	@GeneratedValue
	@Column(name = "qualityId")
	private Long qualityId;

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

	@Column(name = "virginTypeCotton")
	private String virginTypeCotton;

	@Column(name = "virginTypePolyster")
	private String virginTypePolyster;

	@Column(name = "virginTypeViscose")
	private String virginTypeViscose;

	@Column(name = "blendYarnQuality")
	private String blendYarnQuality;

	public Long getQualityId() {
		return qualityId;
	}

	public void setQualityId(Long qualityId) {
		this.qualityId = qualityId;
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
