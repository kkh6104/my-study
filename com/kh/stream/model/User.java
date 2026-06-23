package com.kh.stream.model;

public class User {

	private String name;
	private int age;
	private int point;
	
	public User() {}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", point=" + point + "]";
	}
	
	

	
	
	
}
