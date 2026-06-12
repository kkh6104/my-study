package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int qty = sc.nextInt();
		System.out.print("단가를 입력하세요 : ");
		double price = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("--- 장바구니 영수증 ---");
		System.out.printf("%-7s: %s\n","상품명", name);
		System.out.printf("%-7s: %d\n","수량", qty);
		System.out.printf("%-7s: %.2f\n","단가", price);
		System.out.println("--------------------");
		System.out.printf("%-7s: %.2f","총 금액", qty*price);
		
		sc.close();
		
	}
	
}
