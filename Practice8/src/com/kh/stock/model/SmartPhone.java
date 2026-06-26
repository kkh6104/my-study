package com.kh.stock.model;

public class SmartPhone extends Device{

	private String os;
	
	public SmartPhone() {}

	public SmartPhone(String brand, String name, int price,String os) {
		super(brand, name, price);
		this.os = os;
		
	}

	@Override
	public String getInformation() {
//		return "[스마트폰] 브랜드: " + brand +", 제품명: " + name + ", 가격: "+ price + "원 | os: " + os;
		return String.format("[스마트폰] %s | os: %s", super.getInformation(), os);
	}


	
	
	
}
