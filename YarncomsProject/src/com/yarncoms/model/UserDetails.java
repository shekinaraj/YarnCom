package com.yarncoms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	private static String user = "User";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "UserId")
	private String userId;
	
	@Column(name = "UserName")
	private String userName;

	@Column(name = "Password")
	private String password;
	
	@Column(name = "Role")
	private String role;
	
	@Column(name = "countryCode")
	private String countryCode;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;

	@Column(name="EmailId")
	private String emailId;
	
	@Column(name = "ipNumber")
	private String ipNumber;
	
	@Column(name = "status")
	private String status;

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		UserDetails.user = user;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getIpNumber() {
		return ipNumber;
	}

	public void setIpNumber(String ipNumber) {
		this.ipNumber = ipNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

		

}
