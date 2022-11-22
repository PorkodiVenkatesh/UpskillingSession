package com.org.cabBookingSystem.models;
// c_number(Pk), c_name, seaters
public class Cab {
	
	private int cNumber;
	private String cName;
	private int seaters;
	public int getcNumber() {
		return cNumber;
	}
	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getSeaters() {
		return seaters;
	}
	public void setSeaters(int seaters) {
		this.seaters = seaters;
	}
	

}
