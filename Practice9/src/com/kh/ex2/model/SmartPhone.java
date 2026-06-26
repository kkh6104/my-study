package com.kh.ex2.model;

public abstract class SmartPhone {

	private String maker;
	
	public SmartPhone() {

	}
	
	public abstract String printinfomation();

	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
}
