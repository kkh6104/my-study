package com.kh.ex1;

public class Dog implements Animal, Baby {
	/* 
	 	void move();
	 	void eat();
	 	void makeSound();
	 */
	
	// * 오버라이딩 조건 : 부모클래스의 메서드와 메소드명 동일 / 매개변수 정보 동일 / 반환형 동일 
	public void move() {
		System.out.println("네 발로 걸어갑니다...");
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍~");
	}
	
	@Override
	public void eat() {
		System.out.println("사료를 먹습니다..");
	}

	



}
