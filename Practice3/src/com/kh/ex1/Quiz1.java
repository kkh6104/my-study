package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형 한 변의 길이 : ");
		int length = sc.nextInt();
		
		System.out.printf("둘레의 길이 : %d\n", length * 4);
		System.out.printf("넓이 : %d\n", length * length);

		sc.close();
		
	}
	
}
