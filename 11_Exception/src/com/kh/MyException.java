package com.kh;

/*
 * * 나만의 예외 클래스 만들기 *
 * [1] 예외 클래스로부터 상속받기(Exception, RuntimeException, ...)
 * [2] 생성자 정의 
 * 		- 기본 생성자
 * 		- 문자열을 매개변수로 가지는 생성자 => "자세한 메시지"
 */
public class MyException extends Exception {
	
	public MyException() {}
	
	public MyException(String message) {
		super(message);
		// 전달된 메시지를 부모 생성자를 통해 초기화
	}

}
