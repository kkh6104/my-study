package com.kh.ex4;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			for(int j =0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
		
	}

}
