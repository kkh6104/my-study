package com.kh.ex2;

public class Circle implements Shape {

	private double radius;
	
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
}
