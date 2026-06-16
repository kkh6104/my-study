package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		method2();

	}

	public static void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println();
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

		if (menu == 1)
			System.out.print("입력 메뉴입니다.");
		else if (menu == 2)
			System.out.print("수정 메뉴입니다.");
		else if (menu == 3)
			System.out.print("조회 메뉴입니다.");
		else if (menu == 4)
			System.out.print("삭제 메뉴입니다.");
		else if (menu == 7)
			System.out.print("프로그램이 종료됩니다.");
		else
			System.out.print("없는 메뉴입니다.");

		sc.close();
	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println();
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.print("입력 메뉴입니다.");
			break;
		case 2:
			System.out.print("수정 메뉴입니다.");
			break;
		case 3:
			System.out.print("조회 메뉴입니다.");
			break;
		case 4:
			System.out.print("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.print("프로그램이 종료됩니다.");
			break;
		default:
			System.out.print("없는 메뉴입니다.");
			break;
		}

		sc.close();
	}

}
