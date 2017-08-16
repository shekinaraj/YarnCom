package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FabricEnquiry")
public class FabricEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "fabricEnquiryId")
	private Long fabricEnquiryId;

	@Column(name = "enquiryId")
	private Long enquiryId;

	@Column(name = "warpCount")
	private Long warpCount;

	@Column(name = "warpPly")
	private String warpPly;

	@Column(name = "warpSpecifyPly")
	private Long warpSpecifyPly;

	@Column(name = "warpYarnQuality")
	private String warpYarnQuality;

	@Column(name = "warpYarnType")
	private String warpYarnType;

	@Column(name = "warpCoreDenier")
	private int warpCoreDenier;

	@Column(name = "warpPVACountInNE")
	private int warpPVACountInNE;

	@Column(name = "weftCount")
	private Long weftCount;

	@Column(name = "weftPly")
	private String weftPly;

	@Column(name = "weftSpecificPly")
	private Long weftSpecificPly;

	@Column(name = "weftYarnQuality")
	private String weftYarnQuality;

	@Column(name = "weftYarnType")
	private String weftYarnType;

	@Column(name = "weftCoreDenier")
	private Long weftCoreDenier;

	@Column(name = "PVACountInNe")
	private Long PVACountInNe;

	@Column(name = "material")
	private String material;

	@Column(name = "EPI")
	private Long EPI;

	@Column(name = "PPI")
	private Long PPI;

	@Column(name = "pickInsertion")
	private int pickInsertion;

	@Column(name = "parallelValue")
	private int parallelValue;

	@Column(name = "width")
	private int width;

	@Column(name = "weaveType")
	private String weaveType;

	@Column(name = "specificWeaveType")
	private String specificWeaveType;

	@Column(name = "widthOfStrip")
	private int widthOfStrip;

	@Column(name = "selvedge")
	private String selvedge;

	@Column(name = "specificSelvedge")
	private String specificSelvedge;

	@Column(name = "construction")
	private String construction;

	@Column(name = "remarks")
	private String remarks;

	public Long getFabricEnquiryId() {
		return fabricEnquiryId;
	}

	public void setFabricEnquiryId(Long fabricEnquiryId) {
		this.fabricEnquiryId = fabricEnquiryId;
	}

	public Long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}

	public Long getWarpCount() {
		return warpCount;
	}

	public void setWarpCount(Long warpCount) {
		this.warpCount = warpCount;
	}

	public String getWarpPly() {
		return warpPly;
	}

	public void setWarpPly(String warpPly) {
		this.warpPly = warpPly;
	}

	public Long getWarpSpecifyPly() {
		return warpSpecifyPly;
	}

	public void setWarpSpecifyPly(Long warpSpecifyPly) {
		this.warpSpecifyPly = warpSpecifyPly;
	}

	public String getWarpYarnQuality() {
		return warpYarnQuality;
	}

	public void setWarpYarnQuality(String warpYarnQuality) {
		this.warpYarnQuality = warpYarnQuality;
	}

	public String getWarpYarnType() {
		return warpYarnType;
	}

	public void setWarpYarnType(String warpYarnType) {
		this.warpYarnType = warpYarnType;
	}

	public int getWarpCoreDenier() {
		return warpCoreDenier;
	}

	public void setWarpCoreDenier(int warpCoreDenier) {
		this.warpCoreDenier = warpCoreDenier;
	}

	public int getWarpPVACountInNE() {
		return warpPVACountInNE;
	}

	public void setWarpPVACountInNE(int warpPVACountInNE) {
		this.warpPVACountInNE = warpPVACountInNE;
	}

	public Long getWeftCount() {
		return weftCount;
	}

	public void setWeftCount(Long weftCount) {
		this.weftCount = weftCount;
	}

	public String getWeftPly() {
		return weftPly;
	}

	public void setWeftPly(String weftPly) {
		this.weftPly = weftPly;
	}

	public Long getWeftSpecificPly() {
		return weftSpecificPly;
	}

	public void setWeftSpecificPly(Long weftSpecificPly) {
		this.weftSpecificPly = weftSpecificPly;
	}

	public String getWeftYarnQuality() {
		return weftYarnQuality;
	}

	public void setWeftYarnQuality(String weftYarnQuality) {
		this.weftYarnQuality = weftYarnQuality;
	}

	public String getWeftYarnType() {
		return weftYarnType;
	}

	public void setWeftYarnType(String weftYarnType) {
		this.weftYarnType = weftYarnType;
	}

	public Long getWeftCoreDenier() {
		return weftCoreDenier;
	}

	public void setWeftCoreDenier(Long weftCoreDenier) {
		this.weftCoreDenier = weftCoreDenier;
	}

	public Long getPVACountInNe() {
		return PVACountInNe;
	}

	public void setPVACountInNe(Long pVACountInNe) {
		PVACountInNe = pVACountInNe;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Long getEPI() {
		return EPI;
	}

	public void setEPI(Long ePI) {
		EPI = ePI;
	}

	public Long getPPI() {
		return PPI;
	}

	public void setPPI(Long pPI) {
		PPI = pPI;
	}

	public int getPickInsertion() {
		return pickInsertion;
	}

	public void setPickInsertion(int pickInsertion) {
		this.pickInsertion = pickInsertion;
	}

	public int getParallelValue() {
		return parallelValue;
	}

	public void setParallelValue(int parallelValue) {
		this.parallelValue = parallelValue;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getWeaveType() {
		return weaveType;
	}

	public void setWeaveType(String weaveType) {
		this.weaveType = weaveType;
	}

	public String getSpecificWeaveType() {
		return specificWeaveType;
	}

	public void setSpecificWeaveType(String specificWeaveType) {
		this.specificWeaveType = specificWeaveType;
	}

	public int getWidthOfStrip() {
		return widthOfStrip;
	}

	public void setWidthOfStrip(int widthOfStrip) {
		this.widthOfStrip = widthOfStrip;
	}

	public String getSelvedge() {
		return selvedge;
	}

	public void setSelvedge(String selvedge) {
		this.selvedge = selvedge;
	}

	public String getSpecificSelvedge() {
		return specificSelvedge;
	}

	public void setSpecificSelvedge(String specificSelvedge) {
		this.specificSelvedge = specificSelvedge;
	}

	public String getConstruction() {
		return construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

}
