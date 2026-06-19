package com.kh.ex1.model.vo;

public class Product {
	
	private String productName;
	private int price;
	private String brand;
	
	
	public Product(){
		
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getprice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println(this.productName + " / " + this.price 
				+ " / " + this.brand);
	}
	
}
