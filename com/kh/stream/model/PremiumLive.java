package com.kh.stream.model;

public class PremiumLive extends Content{

	private String platform;

	public PremiumLive(String title, int ageRestriction, int price, String platform) {
		super(title, ageRestriction, price);
		this.platform = platform;
	}
	
	@Override
	public String toString() {
	    return "[라이브] " + super.toString() + ", 플랫폼: " + platform;
	}
	
	
}
