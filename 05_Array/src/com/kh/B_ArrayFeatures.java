package com.kh;

public class B_ArrayFeatures {
	/*
	 * * 변수 종류 *
	 *  - 일반 변수(기본자료형)
	 *  	: 실제 데이터(리터럴)를 메모리에 바로 저장하는 변수
	 *  	: stack 영역에 저장!
	 *  	: 기본 자료형 => char, boolean, byte, shot, int, long, float, double
	 *  
	 *   - 참조 변수(참조 자료형)
	 *   	: 실제 데이터(리터럴)는 heap 영역에 저장하고, 그 곳의 주소값을 stack에 저장하는 변수
	 *   
	 *  * 배열 특징
	 *   - 생성한 후 직접 값을 초기화하지 않아도 기본값으로 초기화됨!
	 *    => heap 이라는 영역은 빈 공간으로 존재할 수 없어서 공간이 만들어질 때
	 *    	 JVM에 의해서 기본값으로 초기화 됨!
	 *    
	 *   - 단점: 한번 생성한 후 배열의 크기를 변경할 수 없음!
	 *   		=> 크기를 변경하고자 할 경우 새로 생성해야 함!
	 *    
	 */
	
	
	public static void main(String[] args) {
		
		// 정수형 배열 iArr 선언하고 크기가 10인 배열 생성(할당)
		int[] iArr = new int[10];
		
		// 실수형 배열 dArr 선언하고 크기가 4인 배열 생성(할당)
		double[] dArr = new double[4];
		
		// => 배열을 생성까지만 한 상태
		
		// * iArr 배열의 값들을 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		
		for(int i : iArr) {
			System.out.println(i + " ");
		}
		
		System.out.println("--------------------");
		
		// * dArr 배열의 값들을 출력
		for(int i = 0; i < dArr.length; i++) {
			System.out.print(dArr[i] + " ");
		}
		
		for(double i : dArr) {
			System.out.print(i + " ");
		}
		
		System.out.println("--------------------");
		
		System.out.println(iArr);
		System.out.println(dArr);
		 // => 배열의 자료형 + @ + 주소값(16진수)
		
		// -------------------------------
		
		int[] arr = null;
		
		/*
		 * System.out.println(arr(0));
		 *  => null[0] -> NullPointerException 오류 발생!
		 *  	실제 데이터가 없는데 첫번째 칸의 데이터로 접근하려고 함!
		 */
		
		arr = new int[5];
		System.out.println(arr[4]);
		/*
		System.out.println(arr[5]);
		// ArrayIndexOutOfBoundsException 오류 발생!
		/// 인덱스 범위를 벗어났기 때문에 오류가 발생! 반복문 사용 시 자주 접함!	
		*/
		System.out.println("재할당 전 : " + arr);
		// --- 재할당 -> 배열을 새로 생성해서 할당
		arr = new int[7];
		System.out.println("재할당 후 : " + arr);
		
		
	}

}
