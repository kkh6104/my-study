package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지불한 돈 : ");
		int pay = sc.nextInt();
		System.out.print("물건 가격 : ");
		int price = sc.nextInt();
		
		System.out.println("--- 거스름돈 내역 ---");
		System.out.printf("천원 지폐 : %d장\n", ((pay-price)/1000));
		System.out.printf("백원 동전 : %d개\n", (((pay-price)%1000) / 100));

		sc.close();
		
	}
	
}
