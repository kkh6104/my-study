package com.kh;

public class A_Variable {

	public static void main(String[] args) {
	
		//method1();
		method2();
		
	}
	
	public static void method2() {
		
		System.out.println("method2() start ....");
		
		// 1. 논리형 (boolean) : true 또는 false 을 저장하는 자료형
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println("isTrue의 값 : " + isTrue);
		
		isFalse = -10 > 2 + 3; // -10 > 5
		
		System.out.println("-10 > 2 + 3 의 결과 : " + isFalse);
		
		// ------------------------
		// 2. 숫자 (정수형, 실수형)
		// 2-1) 정수형 : 딱 떨어지는 수. 소숫점을 포함하지 않음!
		// byte(1B) / short(2B) / int(4B) / long(8B)

		// byte 자료형 변수 bNum을 선언하고 저장할 수 있는 범위 내의 최소값 대입(저장)
		byte bNum = -128;
		// bNum = 1000; ->byte 범위를 벗어나기 때문에 오류 발생!
		
		long inum = 1000; // 1000 -> (int) -> (long)
		long iNum = 1000l; // 1000l -> (long) -> (long)
		
		// 2-2)  실수형 : 소숫점이 포함된 숫자
		//		 float(4B) / double(8B, 8byte)
		
		// float 자료형 변수 fNum에 0.0을 저장
		float fNum = 0.0f; // 0.0 -> (double) -> (float) X
						   // 0.0f -> (float) -> (float)	
		
		// double 자료형 변수 dNum에 0.0을 저장
		double dNum;
		
		dNum = 0.0;
		
		//-----------------
		// 3. 문자형 (char, String)
		// 3-1) 문자 : char (2B)
		
		// 'a' 라는 값을 저장하는 변수 ch 선언
		char ch = 'a';
		
		//'김' 이라는 값을 변수에 저장
		char kim = '김';
		
		// 3-2) 문자열 : String (참조자료형)
		
		// 문자열 변수 str 선언 -> 자료형 변수명;
		String str;
		
		// str 변수에 "안녕하세요 ~" 저장 (대입, 할당)
		str = "안녕하세요 ~";
		
		// * str 데이터의 길이 : 변수명.length()
		System.out.println("str 데이터 길이 : " + str.length());
		
		
		//-------------------------
		
		// 상수 : 고정된 값, 변하지 않는 값을 저장하는 공간(변수)
		// * final 자료형 변수명;
		
		// 최대 이용자 수를 저장하기 위한 상수 선언 : max users
		final int MAX_USERS ;
		MAX_USERS = 24;
		// ....
		// MAX_USERS = 26; // 재할당 불가, 저장 후 다시 저장할 수 없음!
		
	}
	
	
	
	public static void method1() {

		// 월급 = 시급 x 근무시간 x 근무일수
		// * 출력 형식 : xxx : 0000원
		// * 2026년 최저시급 : 10320원 
		
		// 시급 +200원
		
		System.out.println("홍길동 : " + 10520*8*5 + "원");
		System.out.println("아이유 : " + 10520*6*5 + "원");
		System.out.println("나루토 : " + 10520*10*5 + "원");
		System.out.println("짱구 : " + 10520*4*7 + "원");
		System.out.println("루피 : " + 10520*6*10 + "원");
		
		System.out.println(); // 구분용
		
		// 변수를 사용하여 시급에 대한 값을 관리해보자
		// 변수 선언 => 자료형 변수명;
		
		int minWage = 10320;
		
		// 시급 +500원
		
		minWage = minWage + 500;
		
		System.out.println("홍길동 : " + minWage*8*5 + "원");
		System.out.println("아이유 : " + minWage*6*5 + "원");
		System.out.println("나루토 : " + minWage*10*5 + "원");
		System.out.println("짱구 : " + minWage*4*7 + "원");
		System.out.println("루피 : " + minWage*6*10 + "원");
		
			
	}

}
