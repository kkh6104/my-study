package com.kh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class B_IOStream {
	
	public static void main(String[] args) {
		// 키보드 입력 ---> 프로그램 ----> 콘솔창 출력
		
		// 입력용 스트림
		InputStream in = System.in;  // 표준 입력 스트림
		
		// 출력용 스트림
		OutputStream out = System.out;  // 표준 출력 스트림
		
		byte[] buf = new byte[1024];
		// => 입출력 시 버퍼의 데이터를 저장하기 위한 배열(변수)
		int len = 0;  // 데이터 길이를 저장할 변수
		
		try {
		
		// 입력 받기
		len = in.read(buf);
		
		// 출력 하기
		out.write(buf, 0, len);
		out.flush();
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
			in.close();
			out.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
