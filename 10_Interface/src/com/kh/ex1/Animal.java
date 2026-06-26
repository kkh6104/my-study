package com.kh.ex1;

// [접근제한자] interface 인터페이스명{}
public interface Animal {
	// 상수 필드와 추상 메소드로 구성됨!
	
	// 움직인다
	public abstract void move();
	
	// 먹는다
	public /* abstract */ void eat();
	
	// 소리를 낸다
	/* public abstract */ void makeSound();
	
	// => 추상메소드 : 몸체(구현)가 없는 메소드.
}
