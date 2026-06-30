package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Controller;

public class ConsoleView {
	
	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();
	

	public void mainMenu() {
		SubMenus sm = new SubMenus();
		sm.identificationMenu();
		
		int menu;

		while (true) {
			sm.printMainMenu();
			System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}

			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1:
				sm.showAllContentsList();
				break;
			case 2:
				sm.entertainmentsMenu();
				break;
			case 3:
				sm.movieMenu();
				break;
			case 4:
				sm.docuMenu();
				break;
			case 5:
				sm.userMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
	}
}
