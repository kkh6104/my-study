package com.kh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * * CheckedException : 반드시 예외처리가 필요한 예외들
	 * 	=> 조건 처리로 방어가 어렵고, 예측 불가능한 상황에서 발생되므로
	 * 		 미리 예외 처리 구문을 작성해야 함
	 * 		(외부 매개체와 입출력이 일어날 때 발생 - 파일, 네트워크 통신..)
	 */
	
	public void test1() {
		// * Scanner 와 비슷한 객체
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("입력 : ");
		
		try {
			
		String str = br.readLine();
		System.out.println(str);
		
		} catch(IOException e) {
			
			System.out.print("[Exception] 예외 발생...!!!");
			e.printStackTrace();
			
		}
		
	}
	
	public void test2() throws IOException{
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("입력 : ");
		String str = br.readLine();
		System.out.println(str);
	}
}
