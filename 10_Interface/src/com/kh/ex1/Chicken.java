package com.kh.ex1;

public class Chicken implements Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("두 발로 걸어갑니다..");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("지렁이를 먹습니다...");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("꼬끼오~~~");
	}

	
	
}
