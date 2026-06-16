package com.kh;

import java.util.Random;

public class C_Branch {
	/*
	 * * 분기문
	 * 
	 * * -break : 제어문 내에서 사용 시 강제로 종료시키는 구문
	 * 
	 * * -continue : 반복문 내에서 사용 시 뒤의 문장들을 실행하지 않고(무시하고)
	 * 				for 문의 경우 [증감식],
	 * 				while 문의 경우 [조건식]으로 이동!!
	 */
	
	
	public static void main(String[] args) {
		
		method2();
		
	}
	
	public static void method1() {
		// 1 ~ 100 사이의 랜덤값을 추출하여 출력
		// 단, 해당 값이 짝수일 경우 반복문 종료
		
		int random;
		
		while(true) {
			 random = (int)(Math.random() * 100 + 1);
			 System.out.print("" + random +" ");
			 if ( random % 2 == 0 ) break;
		}
		
	}
	
	public static void method2() {
		// 1부터 100까지의 정수 중 3의 배수이거나 5의 배수를 제외한 총 합 구하기
		
		// * 1부터 100까지의 총 합 구하기
		// - 초기식 : int i =1;
		// - 증감식 : i++;
		// - 조건식 : i <= 100;
		
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			// 3의 배수이거나 5의 배수일 때 더하지 않음! -> 건너뛰기! (continue)
			// 3의 배수 => 3으로 나눈 나머지가 0인 경우 : n % 3 == 0
			if (i % 3 == 0 || i % 5 == 0) continue; 
			sum += i;
		}
		System.out.print(sum);
	}
	
	public static void method9() {
		// 1 ~ 100 사이의 랜덤값을 추출하여 출력
		// 단, 해당 값이 짝수일 경우 반복문 종료
		
		Random random = new Random() ;
		
		int n;
		
		while(true) {
			 n = random.nextInt(100) + 1;
			 System.out.print("" + n +" ");
			 if ( n % 2 == 0 ) break;
		}
		
	}

}
