package com.kh.ex2;

public class Rectangle implements Shape {

	private double horizon;  // 가로
	private double vertical; // 세로
	
	public Rectangle(double horizon, double vertical) {
		super();
		this.horizon = horizon;
		this.vertical = vertical;
	}

	@Override
	public double calculateArea() {
		return horizon * vertical;
	}
}
