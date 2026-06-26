package com.kh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E_Date {
	// * java.util.Date : 날짜, 시간 관련 클래스
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date); // => 현재 날짜, 시간
		
		// * 특정일을 지정하여 객체 생성
		// 	new Date(연도, 월, 일)
		//	- 연도: 지정연도 -1900
		//	- 월: 지정월 -1
		//	- 일: 지정일
		
		// 개강일을 지정하여 생성 (2026년 6월 11일)
		//Date date2 = new Date(2026, 6, 11);
		//System.out.println(date2);
		
		Date date2 = new Date(2026-1900, 6-1, 11);
		System.out.println(date2);
		
		// * 날짜 포맷을 지정하는 클래스 : java.text.simpleDateFormat
		
		//형식 정의
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date2));
	}

}
