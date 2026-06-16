package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n > 0) {
			for (int i = n ; i >= 1 ; i-- ) {
				System.out.print(i + " ");
			}
				
			
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
		
		sc.close();
		
	}

}
