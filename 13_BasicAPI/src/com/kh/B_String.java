package com.kh;

public class B_String {

	public static void main(String[] args) {

	//	test1();
		test2();
		
	}

	public static void test1() {
		String str1 = "Friday";
		String str2 = "Friday";
		
		System.out.println(str1 == str2);
		// 결과가 true인 이유?
		//  문자열 값 자체(리터럴)를 대입하게 되면 "상수풀"이라는 공간에 저장되어
		//  같은 곳을 가리키게 됨! (주소값이 동일)
		
		
		System.out.println(str1 == "Friday");
		// str1이 가리키고 있는 주소(상수풀)와 "Friday"라는 값 자체가 저장된 주소를 비교했는데
		// -> 둘다 같은 곳을 가리키게 됨! (상수풀에 있음)
		
		System.out.println("==================");
		
		String str3 = new String("Friday");
		String str4 = new String("Friday");
		
		System.out.println(str3 == str4);
		// 결과: false
		//  문자열 객체를 생성해서 값을 대입하게 되면
		//  메모리에 새로운 영역에 할당하므로 각각 다른 위치에 값이 저장됨
		
		System.out.println(str3 == "Friday");
		// 결과: false
		// str3는 힙 메모리 / Friday는 상수풀에 존재
		// str3는 새로운 공간을 참조하고 있고,
		//  "Friday"라는 값 자체는 상수풀에 저장되어 있어 주소값이 다름!!
		
		// * 문자열의 값을 비교하고자 할 때 : equals()
		System.out.println(str3.equals("Friday"));
		
		System.out.println("==================");
		
		String str5 = "Good";
		String str6 = "Luck";
		
		System.out.println(str5.toString());
		// Object의 toString() => 클래스명@해시값
		
		//* 주소값(해시값)을 반환 : System.identityHashCode(참조변수)
		int hash = System.identityHashCode(str5);
		System.out.println(hash);
		
		// * 문자열 합쳐주는 메소드: concat()
		str5 = str5.concat(str6); // "GoodLuck"
		System.out.println(str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println(hash2);
	}
	
	public static void test2() {
		
		String str1 = "Hello";
		
		// * toUpperCase : 문자열의 알파벳을 모두 대문자로 변환하여 리턴
		// * toLowerCase : 문자열의 알파벳을 모두 소문자로 변환하여 리턴
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// * contains : 문자열 내에 특정 문자열이 포함되어 있는 지 여부를 리턴(boolean)
		System.out.println(str1.contains("el"));
		System.out.println(str1.contains("kk"));
		
		// * indexOf : 문자열 내에 특정 문자열이 포함되어 있는 시작 위치를 리턴(int)
		System.out.println(str1.indexOf("el")); // => 1
		System.out.println(str1.indexOf("kk")); // => -1 (포함되지 않은 경우)
		
		// * substring : 문자열.substring(시작인덱스) => 문자열에서 시작인덱스부터 마지막 위치까지 문자열을 부분을 추출하여 리턴
		// 				 문자열.substring(시작인덱스, 끝인덱스) => 문자열에서 시작인덱스부터 끝인덱스 직전까지 부분을 추출하여 리턴
		System.out.println(str1.substring(2));  // => llo
		System.out.println(str1.substring(2,4)); //=> ll
	
		// repeat : 문자열을 지정한 개수만큼 반복하여 리턴
		System.out.println(str1.repeat(5));
		System.out.println("=".repeat(10));
		
		// split : 문자열을 특정 구분자를 기준으로 분리하여 문자열 배열 형태로 리턴
		String str2 = "JAVA#SQL#HTML#CSS";
		String[] arr = str2.split("#");
		
		for (String s:arr) {
			System.out.println(s);
		}
	}
}
