package com.kh;

import java.io.File;
import java.io.IOException;

public class A_File {
	/*
	 *  File : 파일을 다루는 객체 (java.util)
	 */
	public static void main(String[] args) {
		// method1();
		method2();
		
		
		
		
		
	}
	
	/**
	 * sample 폴더를 생성하고, myDiary.txt 파일 생성하기!
	 * => sample/myDiary.txt 생성하기
	 */
	
	
	public static void method2() {
		
		File sampleFolder = new File("sample\\");
		File myDiaryFile = new File("sample\\myDiary.txt");
		
		try {
			if(!sampleFolder.exists()) sampleFolder.mkdir();
			if(!myDiaryFile.exists()) myDiaryFile.createNewFile();
			
			// * File 객체를 통해 파일 정보 조회
			System.out.println("* 파일명 : " +  myDiaryFile.getName());
			System.out.println("* 파일경로 : " +  myDiaryFile.getAbsolutePath());
			System.out.println("* 파일용량 : " +  myDiaryFile.length());
			System.out.println("* 파일상위폴더 : " +  myDiaryFile.getParent());
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	
	}
	public static void method1(){
	
		// File 객체 생성
		File f1 = new File("test1.txt");
		// => 존재하지 않는 파일 이름만 가지고 생성
		File f2 = new File("D:\\test2.txt");
		// => 존재하는 파일의 경로포함 이름 가지고 객체 생성
		File f3 = new File("D:\\test3.txt");
		// => 특정 경로의 존재하지 않는 파일 이름만 가지고 객체 생성
		// File f4 = new File("D:\\temp\\test4.txt");
		// => 존재하지 않는 경로의 파일 이름으로 객체 생성
		
		File f4_folder = new File("D:\\temp"); 
		File f4 = new File("D:\\temp\\test4.txt");
		
		File f5 = new File("test5.txt");
		
		try{
			
			f1.createNewFile();
			//=> 프로젝트 최상위 경로에 해당 파일 생성
			f2.createNewFile();
			//=> 존재하는 파일의 경우 따로 처리하는 내용이 없음!
			f3.createNewFile();
			// => 특정 경로(지정한 경로)에 파일 생성
			// f4.createNewFile();
			// => 존재하지 않는 경로에 파일을 생성하려고 하는 경우 예외 발생!!
			//    ---> 폴더를 먼저 생성하고, 그 다음에 파일을 생성..
			
			// * 폴더 생성: mkdir / mkdirs
			f4_folder.mkdir();
			f4.createNewFile();
			
			// * 파일이 존재하는 지 확인 : exists():boolean
			System.out.println("test1.txt 가 존재하는가? " + f1.exists());
			System.out.println("test5.txt 가 존재하는가? " + f5.exists());
			
			// * 파일인지 확인 : isFile():boolean
			System.out.println("f4는 파일인가? " + f4.isFile());
			System.out.println("f4_folder는 파일인가? " + f4_folder.isFile());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
