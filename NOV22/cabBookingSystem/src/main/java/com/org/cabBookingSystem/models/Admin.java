package com.org.cabBookingSystem.models;

//Admin -> a_id(PK), a_name, a_email, a_password
//encapsulation
public class Admin {
	
	private int aId;
	private String aName;
	private String aEmail;
	private String aPassword;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	
	

}
