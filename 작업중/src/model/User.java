package model;

import java.io.Serializable;

public class User implements Serializable {

	
	private String name;
	private int age;
	private int balance;

	public User() {
	}
	
	

	public User(String name, int age, int balance) {
		
		this.name = name;
		this.age = age;
		this.balance = balance;
	}



	public int getAge() {
		return age;
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	


	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



}
