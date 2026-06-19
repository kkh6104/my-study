package com.kh.access.run;

import com.kh.access.AccessTest;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
				AccessTest test = new AccessTest();
				
				//public 멤버 => publicField (변수), publicMethod (메소드)
				
				System.out.println(test.publicField);
				
				test.publicMethod();
				// => public 멤버 접근 가능!!

				// protected, default, private 접근 불가!
				// => 패키지 경로가 다르기 때문 !!
				
				
//				System.out.println(test.protectedField);
				
//				test.protectedMethod();
				
//				System.out.println(test.defaultField);
				
//				test.defaultMethod();
				
//				System.out.println(test.privateField);
				
//				test.privateMethod();
				
	}

}
