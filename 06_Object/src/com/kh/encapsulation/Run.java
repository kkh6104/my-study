package com.kh.encapsulation;

/*
 * * 캡슐화
 * 	: 객체의 속성(데이터)과 기능(메소드)을 하나로 묶어
 * 	  내부에서 스스로 관리하게 하는 것.
 * 
 * 	  대표적인 원칙으로는 "정보 은닉"이 사용됨.
 * 
 * * 정보 은닉
 *   [1] 접근 제한자를 사용해 외부의 무분별한 데이터 접근을 차단
 *   [2] 외부에 공개된 제한된 메소드만을 허용
 *   
 * * 장점
 * 	 - 데이터 보호 : 외부로부터 내부 데이터 직접 접근 방지
 * 	 - 무결성 유지 : 객체가 자신의 데이터를 스스로 검증하고 관리하여 데이터 오염을 막음
 * 	 - 유지보수성 향상 : 내부 구현이 바뀌어도 외부에 미치는 영향을 최소화
 * 
 * * 구현 방법
 * 	[1] 필드(변수)는 'private' 접근 제한자를 사용하여 직접 접근 차단
 * 	[2] 필요에 따라 'public' 메소드를 통해서만 간접 접근 허용 (getter, setter, 또는 그 외 메소드)
 * 
 */

public class Run {

	public static void main(String[] args) {
		// Monster 생성
		
		Monster m = new Monster();
		
		// int hp = m.hp;
		int hp = m.getHP();
		System.out.println("* 현재 몬스터 체력 : " + hp);
		
		// m.hp = -999;
		m.attack(10);
		System.out.println("* 현재 몬스터 체력 : " + m.getHP());
		
	}

}
