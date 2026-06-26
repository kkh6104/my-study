package com.kh;

public class C_StringBuilder {
	// * java.lang.StringBuilder : 같은 메모리 공간에서 값을 변경 (가변)
	public static void main(String[] args) {
		// StringBuilder 객체 생성 => String 변수 필요*
		
		String str = "summer";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.toString());
		// toString 재정의 되어있음! (저장된 값을 리턴)
		
		int hash = System.identityHashCode(sb);
		System.out.println(hash);
		
		// * 값을 변경(추가) : append()
		sb.append(" is hot!! ");
		sb.append("@@@@@@@@@@@@");
		
		int hash2 = System.identityHashCode(sb);
		System.out.println(sb);
		System.out.println(hash2);
		
	}

}
