package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerProduct")
public class CustomerProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerProductId")
	private Long customerProductId;
	
	@Column(name = "yarnProductId")
	private Long yarnProductId;
	
	@Column(name = "fabricProductId")
	private Long fabricProductId;
	
	/*@Column(name = "description")
	private String description;*/
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "construction")
	private String construction;
	
	@Column(name = "customerId")
	private String customerId;
	
	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "companyName")
	private String companyName;

	public Long getCustomerProductId() {
		return customerProductId;
	}

	public void setCustomerProductId(Long customerProductId) {
		this.customerProductId = customerProductId;
	}

	public Long getYarnProductId() {
		return yarnProductId;
	}

	public void setYarnProductId(Long yarnProductId) {
		this.yarnProductId = yarnProductId;
	}

	public Long getFabricProductId() {
		return fabricProductId;
	}

	public void setFabricProductId(Long fabricProductId) {
		this.fabricProductId = fabricProductId;
	}

	/*public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/

	public String getConstruction() {
		return construction;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
