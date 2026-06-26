package com.kh.view;

import java.util.Scanner;

import com.kh.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기"); // => fileSave()
			System.out.println("2. 노트 열기"); // => fileOpen()
			System.out.println("3. 노트 열어서 수정하기"); // => fileEdit()
			System.out.println("9. 끝내기");	// => return;
			System.out.print("메뉴 번호 ");
			
			int menu=sc.nextInt();
			sc.nextLine();  // 버퍼 비우기!
			
			switch(menu) {
			case 1: fileSave();break;
			case 2: fileOpen();break;
			case 3: fileEdit();break;
			case 9: System.out.println("프로그램을 종료합니다.");return;
			default: System.out.println("잘못 입력하였습니다."); break;
			}
			System.out.println();
		}
		
		
	}
	
	public void fileSave( ) {
		String contents = "";
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
		
			String value = sc.nextLine();
			
			if (value.equals("ex끝it")) break;
			
			contents += value + "\n";
		}	
		
		while(true) {
			System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt): ");
			String fileName = sc.nextLine();
		
			if(fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) ");
				char yn = sc.nextLine().charAt(0);
			
				if(yn == 'n' || yn =='N') {
					continue;
				}
			}
		
			fc.fileSave(fileName, contents);
			break;
		}
	}
	
	public void fileOpen( ) {
		
		System.out.print("열 파일명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			
			System.out.println(fc.fileOpen(fileName));
		
		} else {
			
			System.out.println("없는 파일입니다.");
			// return;
		}
		
		
		// ...
		/// ....
		///  /// ....
		
	}
	
	public void fileEdit( ) {
		
		System.out.print("수정할 파일 명: ");
		String fileName = sc.nextLine();
		
		if (!fc.checkName(fileName)) {
			System.out.println("없는 파일입니다.");
		} else {
			
			String contents = "";
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
			
				String value = sc.nextLine();
				
				if (value.equals("ex끝it")) break;
				
				contents += value + "\n";
				}	
		
			fc.fileEdit(fileName, contents);
		}
		
		
	}
}
