package com.kh.stock.model;

public class Device {

	protected String brand;
	protected String name;
	protected int price;
	
	public Device(){}

	public Device(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
		
	public String getInformation(){
//		return "브랜드: " + brand+", 제품명: " + name + ", 가격: "+ price + "원";
		return String.format("브랜드: %s, 제품명: %s, 가격: %d원", brand, name, price);
	}
}
