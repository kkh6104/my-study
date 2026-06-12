package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("==========================");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.println("==========================");
		
		sc.close();
		
	}

		
}
