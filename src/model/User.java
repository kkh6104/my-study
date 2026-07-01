package model;

import java.io.Serializable;

public class User implements Serializable {

	private String userID;
	private String name;
	private int age;
	private int balance;

	public User() {
	}

	public User(String userID, String name, int age, int balance) {

		this.userID = userID;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public String getUserID() {
		return userID;
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

	@Override
	public String toString() {
		return "ID : " + userID + ", 이름 : " + name + ", 나이 : " + age + ", 잔액 :" + balance + "원";
	}

}
