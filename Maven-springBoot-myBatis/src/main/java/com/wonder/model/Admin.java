package com.wonder.model;

import java.io.Serializable;

public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adminId;
	private String adminName;
	private String adminPasswd;
	private String adminPower;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPasswd() {
		return adminPasswd;
	}
	public void setAdminPasswd(String adminPasswd) {
		this.adminPasswd = adminPasswd;
	}
	public String getAdminPower() {
		return adminPower;
	}
	public void setAdminPower(String adminPower) {
		this.adminPower = adminPower;
	}
	
}
