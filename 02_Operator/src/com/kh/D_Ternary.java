package com.kh;

import java.util.Scanner;

public class D_Ternary {

	/*
	 * 삼항연산자 (항이 3개인 연산자)
	 * 
	 * ___? ___ : ____
	 * 
	 * (조건식) ? (조건식의 결과가 true인 경우 사용할 값) : (조건식의 결과가 false인 경우 사용할 값)
	 *  
	 */
	
	public static void main(String[] args) {

		method3();
		
	}

	public static void method1() {
		// 입력한 값이 x인 경우 "종료합니다" 출력
		//            그렇지 않으며 "계속 진행합니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무거나 입력 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		
		String result = (ch == 'x' || ch == 'X')? "종료합니다." : "계속 진행합니다";
		System.out.println(result);
		
		sc.close();
	}
	
	public static void method2() {
		/*
		 * 사용자에게 두 개의 정수와 + 또는 - 를 입력받아 연산 결과를 출력
		 * 단, + 또는 - 외의 문자가 입력되었을 경우 "입력이 잘못되었습니다." 출력
		 * 
		 * 입력 예시) 10 20 +
		 * 출력 예시) 10 + 20 = 30
		 * 
		 * 입력 예시) 5 10 /
		 * 출력 예시) 5 / 10 = 입력이 잘못되었습니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
	
		int n1 = sc.nextInt();   // 버퍼 10 20 +\n , n1 = 10
		int n2 = sc.nextInt();   // 버퍼 20 +\n , n2 = 20 
		String str = sc.next();  // 버퍼 +\n , str = +
		char ch = str.charAt(0); // "+" -> '+'
		
		String result ="";
		result = (ch == '+')? "" + (n1 + n2) : result ;
		result = (ch == '-')? "" + (n1 - n2) : result ;
		result = (ch != '+' && ch != '-')? "입력이 잘못되었습니다." : result ;
		
		System.out.printf("%d %s %d = %s", n1, str, n2, result);
		
		sc.close();
	}
	
	public static void method3() {
		/*
		 * 사용자에게 두 개의 정수와 + 또는 - 를 입력받아 연산 결과를 출력
		 * 단, + 또는 - 외의 문자가 입력되었을 경우 "입력이 잘못되었습니다." 출력
		 * 
		 * 입력 예시) 10 20 +
		 * 출력 예시) 10 + 20 = 30
		 * 
		 * 입력 예시) 5 10 /
		 * 출력 예시) 5 / 10 = 입력이 잘못되었습니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
	
		int n1 = sc.nextInt();   // 버퍼 10 20 +\n , n1 = 10
		int n2 = sc.nextInt();   // 버퍼 20 +\n , n2 = 20 
		String str = sc.next();  // 버퍼 +\n , str = +
		char ch = str.charAt(0); // "+" -> '+'
		
		String result ="";
		result = ""+ ((ch == '+')? n1 + n2 : 
		      (ch == '-')? n1 - n2 : "입력이 잘못되었습니다.");
				
		System.out.printf("%d %s %d = %s", n1, str, n2, result);
		
		sc.close();
	}
	
	
}
