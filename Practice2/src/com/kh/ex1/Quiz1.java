package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("==========================");
		System.out.printf("%-3s : %s\n", "이름", name);
		System.out.printf("%-3s : %d세\n", "나이", age);
		System.out.printf("%-3s : %.1fcm\n", "키", height);
		System.out.println("==========================");
		
		sc.close();
		
	}

		
}
