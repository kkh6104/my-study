package com.kh;

import java.util.Scanner;

public class B_Comparison {

	/*
	  비교 연산자 (이항 연산자)
	 : 두 값을 비교하는 연산자
	 : 조건을 만족하면 true, 만족하지 않으면 false
	 
	 * 종류
	 * - 대소 비교 연산자 : < > >= <=
	 * - 동등 비교 연산자 : == !=
	 
	 */
	
	public static void main(String[] args) {
		
		// 입력 받은 두 정수의 값을 비교
		// -> Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.println("정수1과 정수2는 같은 값인가? " + (n1 == n2) );
		System.out.println("정수1이 정수2보다 큰가? " + (n1 > n2) );
		System.out.println("정수2 짝수인가? " + (n2 % 2 == 0) );
		// => 2로 나누었을 때 나머지가 0이면 짝수!
		
		System.out.println("정수2는 'A'의 유니코드(아스키코드)인가? " + (n2 == 'A'));
		
		
		sc.close();
	}
	
}
