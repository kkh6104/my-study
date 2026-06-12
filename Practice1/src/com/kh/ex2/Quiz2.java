package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");  // 출력
		String name = sc.nextLine();   //이름 입력 받기
		System.out.print("나이를 입력하세요: ");   // 출력
		int age = sc.nextInt();  // 나이 입력 받기
		System.out.println();  // 한칸 띄어서 입력과 출력 구분
		System.out.printf("%s님(%d세)의 자바 학습을 환영합니다!", name, age);
		sc.close();

	}
}
