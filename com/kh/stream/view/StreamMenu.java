package com.kh.stream.view;

import java.util.Scanner;

import com.kh.stream.controller.StreamController;
import com.kh.stream.model.Content;
import com.kh.stream.model.User;

public class StreamMenu {

	Scanner sc = new Scanner(System.in);
	StreamController ctrl = new StreamController(); 
	
	public void mainMenu() {
		System.out.print("이름을 입력: ");
		String name = sc.next();
		System.out.print("나이를 입력: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		ctrl.registerUser(new User(name, age));
		
		while(true) {
			System.out.println("---------");
			System.out.println("1. 마이페이지");
			System.out.println("2. 전체 조회");
			System.out.println("3. 스트리밍 하기");
			System.out.println("9. 시스템 종료");
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
					case 1:
						System.out.println(ctrl.getUserInfo());
						break;
					case 2:
						printAllContents();
						break;
					case 3:
						watch();
						break;
					case 9:
						return;
				}
			
			
			}
		}
		public void printAllContents() {
			for(Content i : ctrl.selectAllContents()) {
				System.out.println(i);
			}
		}
		public void watch() {
			System.out.print("보고 싶은 채널을 고르세요");
			int ch = sc.nextInt();
			int choice = ctrl.playContent(ch);
			switch(choice) {
			case 1:
				System.out.println("재생 거절");
				break;
			case 2:
				System.out.println("포인트 적립");
				break;
			case 0:
				System.out.println("정상 재생");
				break;	
			}
		}
		
		
	
	
}
