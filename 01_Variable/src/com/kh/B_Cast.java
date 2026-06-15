package com.kh;

public class B_Cast {

	public static void main(String[] args) {

		//		autoCasting();
		forceCasting();
		
	}

	
	public static void forceCasting() {
		/*
		 * 강제 형변환
		 * : 자동 형변환이 되지 않는 경우, 직접 형변환을 해주는 것
		 * 
		 * (변환할자료형)변환할대상
		 */
		
		// 실수형 변수 d1에 4.0 이라는 값을 저장
		double d1 = 4.0;
		
		// 정수형 변수 i1에 50 이라는 값을 저장
		int i1 = 50;
		
		// d1의 값과 i1 의 값을 더해서 정수형 변수 result 에 저장
		int result = (int)d1 + i1 ;
		// (int)d1 -> (double)-->(int)
		// (int)d1 + i1 -> (int) + (int) ==> (int)
		result = (int)(d1 + i1) ;
		// d1 +i1 -> (double) + (int)
		//			 (double) + (double)
		
		// * 주의 *
		// 강제 형변환 시 데이터 손실이 발생될 수 있음!
		int i2 = 290;
		byte i3 = (byte)i2;
		
		// byte 값의 범위 -> -128 ~ 127
		
		System.out.println("i3 : " + i3);
	}
	
	
	
	
	public static void autoCasting() {
		
		/*
		 * 자동 형변환
		 * : 값의 범위가 좁은(작은) 자료형에서 넓은(큰) 자료형으로 자동 형변환
		 */
		
		// 정수형 변수 i1에 12라는 값을 저장
		int i1 = 12;
		
		// 실수형 변수 d1에 i1의 값을 저장
		double d1 = i1; // (double) = int) --> (double) = (double)
		
		System.out.println("d1 : " + d1); // 결과는?
		
	}
	
	
}
