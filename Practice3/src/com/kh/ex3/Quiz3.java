package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		String judge = (age >= 12 && height >= 130.0)? "단독 탑승 가능" : "보호자 동반 필수";
		String judge2 = (age < 12 || height < 130.0)? "보호자 동반 필수" : "단독 탑승 가능";
		System.out.print(judge);
		
		sc.close();
		
	}
	
}
