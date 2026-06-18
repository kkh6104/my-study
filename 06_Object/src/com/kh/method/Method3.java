package com.kh.method;

public class Method3 {
	/*
	 * * 메소드에서 return의 의미
	 * (1) 결과값을 반환함 => return 값;
	 * (2) 메소드 종료 => return;
 	 */
	public static void main(String[] args) {

		divide(50, 7);
		divide(45, 0);
	}

	
	/**
	 * 두 정수를 전달받아 아래 연산 결과를 출력
	 * @return n1 / n2
	 */
	
	public static void divide(int n1, int n2) {

		if(n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; 
		}
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		
	}
	
	
}
