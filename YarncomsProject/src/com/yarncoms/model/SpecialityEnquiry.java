package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "speciality_enquiry")
public class SpecialityEnquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "specialityEnquiryId")
	private long specialityEnquiryId;
	
	@Column(name = "yarnEnquiryId")
	private int yarnEnquiryId;
	
	@Column(name = "yarnCountIn")
	private long yarnCountIn;
	
	@Column(name = "ply")
	private String ply;
	
	@Column(name = "specifyPly")
	private String specifyPly;
	
	@Column(name = "useFor")
	private String useFor;
	
	@Column(name = "material")
	private String material;
	
	@Column(name = "process")
	private String process;
	
	@Column(name = "cottonType")
	private String cottonType;
	
	@Column(name = "yarnType")
	private String yarnType;
	
	@Column(name = "yarnSpecialityDenier")
	private String yarnSpecialityDenier;
	
	@Column(name = "yarnSpecialityQuality")
	private String yarnSpecialityQuality;
	
	@Column(name = "specialityBlendRatio")
	private String specialityBlendRatio;
	
	@Column(name = "specialityBlendPercentageCotton")
	private String specialityBlendPercentageCotton;
	
	@Column(name = "specialityBlendPercentagePolyster")
	private String specialityBlendPercentagePolyster;

	@Column(name = "specialityBlendPercentageViscose")
	private String specialityBlendPercentageViscose;
	
	@Column(name = "specialityOtherMaterial")
	private String specialityOtherMaterial;
	
	@Column(name = "specialityOtherMaterialPercentage")
	private String specialityOtherMaterialPercentage;
	
	@Column(name = "specialityColour")
	private String specialityColour;
	
	@Column(name = "filament")
	private String filament;
	
	@Column(name = "remarks")
	private String remarks;

	
	public long getSpecialityEnquiryId() {
		return specialityEnquiryId;
	}

	public void setSpecialityEnquiryId(long specialityEnquiryId) {
		this.specialityEnquiryId = specialityEnquiryId;
	}

	public int getYarnEnquiryId() {
		return yarnEnquiryId;
	}

	public void setYarnEnquiryId(int yarnEnquiryId) {
		this.yarnEnquiryId = yarnEnquiryId;
	}

	public long getYarnCountIn() {
		return yarnCountIn;
	}

	public void setYarnCountIn(long yarnCountIn) {
		this.yarnCountIn = yarnCountIn;
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

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getCottonType() {
		return cottonType;
	}

	public void setCottonType(String cottonType) {
		this.cottonType = cottonType;
	}

	public String getYarnType() {
		return yarnType;
	}

	public void setYarnType(String yarnType) {
		this.yarnType = yarnType;
	}

	public String getYarnSpecialityDenier() {
		return yarnSpecialityDenier;
	}

	public void setYarnSpecialityDenier(String yarnSpecialityDenier) {
		this.yarnSpecialityDenier = yarnSpecialityDenier;
	}	

	public String getYarnSpecialityQuality() {
		return yarnSpecialityQuality;
	}

	public void setYarnSpecialityQuality(String yarnSpecialityQuality) {
		this.yarnSpecialityQuality = yarnSpecialityQuality;
	}

	public String getSpecialityBlendRatio() {
		return specialityBlendRatio;
	}

	public String getSpecialityBlendPercentageCotton() {
		return specialityBlendPercentageCotton;
	}

	public void setSpecialityBlendPercentageCotton(String specialityBlendPercentageCotton) {
		this.specialityBlendPercentageCotton = specialityBlendPercentageCotton;
	}

	public String getSpecialityBlendPercentagePolyster() {
		return specialityBlendPercentagePolyster;
	}

	public void setSpecialityBlendPercentagePolyster(String specialityBlendPercentagePolyster) {
		this.specialityBlendPercentagePolyster = specialityBlendPercentagePolyster;
	}

	public String getSpecialityBlendPercentageViscose() {
		return specialityBlendPercentageViscose;
	}

	public void setSpecialityBlendPercentageViscose(String specialityBlendPercentageViscose) {
		this.specialityBlendPercentageViscose = specialityBlendPercentageViscose;
	}

	public void setSpecialityBlendRatio(String specialityBlendRatio) {
		this.specialityBlendRatio = specialityBlendRatio;
	}

	public String getSpecialityOtherMaterial() {
		return specialityOtherMaterial;
	}

	public void setSpecialityOtherMaterial(String specialityOtherMaterial) {
		this.specialityOtherMaterial = specialityOtherMaterial;
	}

	public String getSpecialityOtherMaterialPercentage() {
		return specialityOtherMaterialPercentage;
	}

	public void setSpecialityOtherMaterialPercentage(String specialityOtherMaterialPercentage) {
		this.specialityOtherMaterialPercentage = specialityOtherMaterialPercentage;
	}

	public String getSpecialityColour() {
		return specialityColour;
	}

	public void setSpecialityColour(String specialityColour) {
		this.specialityColour = specialityColour;
	}

	public String getFilament() {
		return filament;
	}

	public void setFilament(String filament) {
		this.filament = filament;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
}
