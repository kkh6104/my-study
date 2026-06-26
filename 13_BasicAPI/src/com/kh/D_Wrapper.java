package com.kh;

public class D_Wrapper {
	/*
	 * Wrapper 클래스 : 기본 자료형을 객체화해주는 클래스
	 * 
	 *  boolean   -> Boolean
	 *  char	-> Character
	 *  byte	-> Byte
	 *  short	-> Short
	 *  int		-> Integer
	 *  long	->Long
	 *  float	-> Float
	 *  double	-> Double
	 *  
	 *  * 기본 자료형을 객체화해야 하는 이유?
	 *  	- 다형성을 적용시키고 싶을 때
	 *  		- 매개변수로 기본자료형이 아닌 개체 타입만 요구될 때
	 *  	- 제네릭을 적용시키고 싶을 때 
	 */
	
	public static void main(String[] args) {
		// * 박싱(Boxing) : 기본 자료형 ---> Wrapper 클래스 (객체화)
		int n1 = 100;
		int n2 = 200;
		
		// n1.equals(n2); // => 기본 자료형은 equals 사용 불가!
		
		// * Wrapper 클래스로 변환하여 사용!!
		Integer i1 = Integer.valueOf(n1); // 수동 박싱
		Integer i2 = n2;				// 자동 박싱
		
		System.out.println(i1.toString());
		System.out.println(i2);
		// toString 재정의됨! 값 자체(리터럴) 리턴
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// compareTo : 두 값을 비교하여 앞 쪽의 값(i1)이 크면 1 반환,
		//							뒤 쪽의 값(i2)이 크면 -1 반환,
		//							같으면 0 반환
		
		// 래퍼 클래스는 보통 "문자열"형태에서 래퍼 클래스 형태로 변환하고자 할 때 사용
		Integer i3 = Integer.valueOf("500"); // "500" -> 500
		Integer i4 = Integer.valueOf("777"); // "777" -> 777
		
		Double d1 = Double.valueOf("3.14");// "3.14" -> 3.14
		// * 언박싱(Unboxing) : 기본 자료형 <--- Wrapper 클래스
		int n3 = i3.intValue(); // 수동 언박싱
		double n4 = d1.doubleValue();
		int n5 = i4; // 자동 언박싱
		
		
		
		
	}

}
