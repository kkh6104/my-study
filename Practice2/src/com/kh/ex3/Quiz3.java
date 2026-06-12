package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 입력: ");
		String st = sc.next();
		
		char ch = st.charAt(0);
		
		System.out.println();
		
		System.out.println("소문자: " + ch);
		System.out.println("대문자: " + (char)(ch-32));
		
		sc.close();
	}
	
	
}
