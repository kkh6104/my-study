package com.kh;

public class A_Arithmetic {
	/*
	 * 산술 연산자 (이항 연산자) -> + - * / %
	 * 
	 * 우선 순위 : * / % > + -
	 */
	
	public static void main(String[] args) {

		method1();
		
	}

	public static void method1() {
		
		// 10, 3 값을 각각 n1, n2 변수에 저장
		int n1 = 10;
		int n2 = 3;

		// n1, n2의 합, 차, 곱, 몫, 나머지 출력
		System.out.printf("n1 + n2 = %d\n", (n1 + n2));
		System.out.printf("n1 - n2 = %d\n", (n1 - n2));
		System.out.printf("n1 * n2 = %d\n", (n1 * n2));
		System.out.printf("n1 / n2 = %d\n", (n1 / n2));
		System.out.printf("n1 %% n2 = %d\n", (n1 % n2));
		
		}

	public static void method2() {
		
		int a = 5;
		int b = 10;
		
		int c = ++a + b; // c => 16 , a => 6
		int d = c / a; // d => 2
		int e = c % a; // e => 3
		int f = e++; // f => 3 , e => 4
		int g = --b + d--; // g => 11  , b => 9 , d => 1  
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- -d) % (++e + h);
		// i => 9 , a => 7 , c => 15  , g => 10 , e => 5  
		
		
		//7 9 15 1 6 4 10 2 12   <= 정답
	}
}