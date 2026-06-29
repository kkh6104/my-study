package model;

public class User {

	private int userID;
	private String name;
	private int age;
	private int balance;

	public User() {
	}
	
	

	public User(int userID, String name, int age, int balance) {
		this.userID = userID;
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

	public int getUserID() {

		return this.userID;
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
