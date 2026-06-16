package com.kh;

import java.util.Random;

public class A_For {

	/*
	 * * 반복문 : 특정 코드를 반복적으로 수행하는 문법
	 * 
	 * * for 문
	 *  [표현법]
	 *  		for ( 초기식; 조건식; 증감식) {
	 *					// 반복적으로 실행할 내용  
	 *   		}
	 *   
	 * * for 문 실행 순서
	 * 		초기식 -> 조건식 검사 -> 결과가 true 인 경우 -> 실행할 내용 수행
	 * 		-> 증감식 수행 -> 조건식 검사 -> 결과가 true 인 경우 -> 실행할 내용 수행
	 * 		-> ....
	 * 		-> 증감식 수행 -> 조건식 검사 -> 결과가 false 인 경우 -> 반복문 종료
	 * 
	 *  * 참고 : 초기식, 조건식, 증감식은 생략 가능!
	 *  		=> 생략 시에도 세미콜론 (;)은 반드시 작성해야 함!!
	 *  	- 증감식 생략 => for (초기식;조건식;) { }
	 *  	- 조건식 생략 => for (초기식;;증감식) { }
	 *  	- 초기식 생략 => for (;조건식;증감식) { }
	 *  	- 모두 생략 => for (;;) { }
	 */
	
	public static void main(String[] args) {

		method5();
		
	}
	
	public static void method1() {
		// "Hello" 를 5번 출력
		
		/*
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello"); 
		*/
		
		/*
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(i + " : Hello");
		}
		*/
		
		for (int i = 5; i > 0 ;i--) {
			System.out.println(i + " : Hello");
		}
	}

	public static void method2() {
		// 1부터 10까지 출력
		// 1 2 3 4 5 6 7 8 9 10
		
		// * 반복할 내용 => 출력한다!
		//	 출력하는 내용이 1씩 증가되고 있음!
		//   시작값 : 1, 끝값 : 10
		
		// * 초기식 : int i = 1;
		// * 증감식 : i++;
		// * 조건식 : i < 11 , i <= 10
		
		for (int i = 1 ; i < 11 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 10부터 1까지 출력
		// * 초기식 : int i = 10;
		// * 증감식 : i--;
		// * 조건식 : i > 0 , i >= 1
		
		for (int i = 10 ; i >= 1 ; i--) {
			System.out.print(i + " ");
		}
		
		
		
	}

	public static void method3() {
		// 1부터 10까지의 합
		
		// * 초기식 int i = 1;
		// * 증감식 i++;
		// * 조건식 i <= 10, i < 11
		
		int total = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.printf("%d + %d = %d\n", total, i, total+i);
			total += i; 
			// I = 1) total = 0 + 1; => total = 1
			// I = 2) total = 1 + 2; => total = 3
			// I = 3) total = 3 + 3; => total = 6
		}
		System.out.println("1부터 10까지의 합 : " + total);
		
	}

	public static void method4() {
		// 1부터 랜덤값(1~10)까지의 총 합
		
		/*
		 * [랜덤값 구하는 방법]
		 *  - Math : java.lang.Math
		 *  	Math.random() 을 사용
		 *  		0.0~0.9999999  (0.0 <= 랜덤값 < 1.0 )
		 *  - ex) 1부터 10까지 랜덤값 추출
		 *   	Math.random() * 10 => 0.0 ~ 9.99999
		 *   	Math.random() * 10 + 1 => 1.0 ~ 10.99999
		 *   	(int)(Math.random() * 10 + 1) => 1 ~ 10 
		 */
		
		int max = (int)(Math.random() * 10 + 1);
		int total = 0 ;
		for (int i = 1 ; i <= max ; i++) {
			System.out.printf("%d + %d = %d\n", i , total, total + i);
			total += i;
			}
		System.out.printf("%d까지의 총 합 : %d", max, total);
	}
	
	public static void method5() {
		// 6단 출력
		/*
		    6 x 1 = 6
		    ...
		    6 x 9 = 54
		    
		 */
		
		// * 초기식 : int i = 1;
		// * 증감식 : i++;
		// * 조건식 : i < 10 , i <= 9
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.printf(("6 X %d = %d\n"), i, 6 * i);
		}
		
		// 구구단 : 1단 ~ 9단 모두 출력 프로그램 => 오늘 자정 전까지 이메일 제출!
		
	}
	
	public static void method9() {
		// 1부터 랜덤값(1~10)까지의 총 합
		
		/*
		 * [랜덤값 구하는 방법]
		 *  - Math : java.lang.Math
		 *  	Math.random() 을 사용
		 *  		0.0~0.9999999  (0.0 <= 랜덤값 < 1.0 )
		 *  - ex) 1부터 10까지 랜덤값 추출
		 *   	Math.random() * 10 => 0.0 ~ 9.99999
		 *   	Math.random() * 10 + 1 => 1.0 ~ 10.99999
		 *   	(int)(Math.random() * 10 + 1) => 1 ~ 10 
		 */
		
		Random random = new Random();
		int max = random.nextInt(10) + 1;
		
		int total = 0 ;
		for (int i = 1 ; i <= max ; i++) {
			System.out.printf("%d + %d = %d\n", i , total, total + i);
			total += i;
			}
		System.out.printf("%d까지의 총 합 : %d", max, total);
	}
}
