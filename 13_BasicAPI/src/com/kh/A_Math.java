package com.kh;

public class A_Math {
	/*
	 * Math 클래스 (java.lang)
	 * 
	 * * 특징: 모든 필드는 상수 필드, 모든 메소드는 static 메소드
	 * 			생성자가 private 으로 되어 있음! -> 생성 불가!
	 * 
	 * => 싱글톤 패턴 : 한 번만 메모리 영역에 올려놓고 재사용하는 개념
	 */
	public static void main(String[] args) {
		// 상수 필드 : PI
		System.out.println("파이 : " + Math.PI);
		
		// 랜덤값 반환 : random()
		System.out.println("랜덤값 : " + Math.random());
		
		// 절대값 반환 : abs(값)
		int num = -123;
		System.out.println("절대값 : " + Math.abs(num));
		
		// 제곱값 반환 : pow(밑, 지수)
		System.out.println("2의 10승은 : " + Math.pow(2,10));
		
		// 올림 : ceil(값)
		double num2 = 12.49;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// 버림(내림) : floor(값) 
		System.out.println("버림 : " + Math.floor(num2));
		
		// 반올림 : round(값)
		System.out.println("파이 : " + Math.round(num2));
		
		// Math math = new Math(); // => private 
	}

}
