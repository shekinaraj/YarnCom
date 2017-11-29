package com.yarncoms.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoginLogTable")
public class LoginLogTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Long id;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "loginDateAndTime")
	private String loginDateAndTime = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(Calendar.getInstance().getTime());
	
	@Column(name = "ipNumber")
	private String ipNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLoginDateAndTime() {
		return loginDateAndTime;
	}

	public void setLoginDateAndTime(String loginDateAndTime) {
		this.loginDateAndTime = loginDateAndTime;
	}

	public String getIpNumber() {
		return ipNumber;
	}

	public void setIpNumber(String ipNumber) {
		this.ipNumber = ipNumber;
	}
	
	

}
