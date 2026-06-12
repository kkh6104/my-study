package com.kh.ex2;

public class Quiz2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		System.out.printf("교환 전: a = %d, b = %d",a,b);
		System.out.println();
		
		c = b;
		b = a;
		a = c;

		System.out.printf("교환 후: a = %d, b = %d",a,b);
		System.out.println();
		
	}
	
}
