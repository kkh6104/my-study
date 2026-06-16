package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			n = sc.nextInt();
			
			if(n > 0) {
				for (int i = n ; i >= 1 ; i-- ) {
					System.out.print(i + " ");
				}
					
				
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}while(n <= 0);
		
		sc.close();
		
	}

}
