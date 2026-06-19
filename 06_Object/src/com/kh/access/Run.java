package com.kh.access;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성 및 할당
		AccessTest test = new AccessTest();
		
		//public 멤버 => publicField (변수), publicMethod (메소드)
		String pf = test.publicField;
		System.out.println("public 변수 : " + pf);
		
		test.publicMethod();
		
		// protected 멤버 => protectedField (변수), protectedMethod (메소드)
		String ptf = test.protectedField;
		System.out.println("protectedField 변수 : " + ptf);
		
		test.protectedMethod();
		
		// default 멤버 => defaultField (변수), defaultMethod (메소드)
				String df = test.defaultField;
				System.out.println("default 변수 : " + df);
				
				test.defaultMethod();
				
		// private 멤버 => privateField (변수), privateMethod (메소드)
//		System.out.println( test.privatefield);
		
//		test.privateMethod();
		// => 접근 불가!!
	}

}
