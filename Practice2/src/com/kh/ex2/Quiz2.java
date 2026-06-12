package com.kh.ex2;

public class Quiz2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int x;
		
		System.out.printf("%-5s: a = %d, b = %d\n","교환 전", a, b);
		
		x = b;
		b = a;
		a = x;

		System.out.printf("%-5s: a = %d, b = %d\n","교환 후", a, b);
		
	}
	
}
