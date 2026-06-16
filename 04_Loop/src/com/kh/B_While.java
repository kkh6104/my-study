package com.kh;

public class B_While {
	/*
	 * * while 문
	 * [표현법]
	 * 		초기식;
	 * 		while(조건식) {
	 * 			// 반복적으로 실행할 내용
	 * 
	 * 			증감식;
	 * 		}
	 * 
	 *  => 조건식 검사를 먼저 수행한 후 반복할 내용을 실행!
	 *  	만약, 처음부터 조건식의 결과가 false 라면 ... 실행 하지 않음!!
	 *  
	 *  
	 *  * do ~ while 문
	 *   [표현법]
	 *   		초기식;
	 *   		do {
	 *   			
	 *   			// 반복적으로 실행할 내용
	 *   			
	 *   			증감식;
	 *   		} while(조건식);
	 *   => 무조건 한번 실행한 후, 조건에 따라 반복적으로 수행
	 *   	처음 조건식의 결과가 false 라면 최초 1회는 실행 후 반복문 종료!!
	 *   
	 */
	
	
	public static void main(String[] args) {

		method1();
	}

	public static void method1() {
		
		// --- 조건을 만족하는 경우 (조건식의 결과가 true인 경우)-----
		// * 3 2 1 출력
		
		int n = 3;
		
		while(n >= 1) {
			System.out.print(n-- + " ");
		}
		
		System.out.println("---");
		
		int m = 3;
		
		do { System.out.print(m-- + " ");
		} while(m > 0);
		
		System.out.println("---");
		
		// 조건을 만족하지 않는 경우 (조건식의 결과가 false 인 경우)
		
		
		int n1 = 10;
		while(n1 < 5) {
			System.out.println("while문 동작!");
		}
		System.out.println("---while문 끝---");
		
		int n2 = 10;
		do {
			System.out.println("do ~ while문 동작!");
		}while(n2 <5);
		System.out.println("---do while문 끝---");
	}
	
}
