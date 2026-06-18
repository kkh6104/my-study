package com.kh;

public class D_MatrixArray {
	/*
	 * * 2차원 배열 : 배열 안에 배열.
	 * 		"같은" 자료형으로 구성된 "1차원 배열의 묶음"
	 * 
	 * * 2차원 배열은 할당된 공간마다 인덱스 번호를 "두 개" 부여
	 * 	: 앞의 인덱스는 행의 인덱스 (몇 번째 1차원 배열인지)
	 * 	  뒤의 인덱스는 열의 인덱스 (1차원 배열에서 몇 번째 위치의 데이터인지)
	 * 
	 * * 선언
	 * 		자료형[][] 변수명; // *권장*
	 * 		자료형 변수명[][];
	 * 		자료형[] 변수명[];
	 * 
	 * * 할당
	 * 		변수명 = new 자료형[행크기][열크기];
	 * 			=> 행크기 : 1차원 배열의 개수
	 * 			=> 열크기 : 1차원 배열의 크기 (생략 가능 => 가변 길이의 1차원 배열 할당)
	 * 
	 * * 선언 및 할당
	 * 		자료형[][] 변수명 = new 자료형[행크기][열크기];
	 * 
	 * * 값 대입
	 * 		변수명[행인덱스][열인덱스] = 값;
	 * 		=> 행인덱스 : 몇 번째 1차원 배열인지
	 * 		=> 열인덱스 : 1차원 배열에서 몇 번째 위치인지
	 * * 초기화
	 * 		자료형[][] 변수명 = {1차원_배열, 1차원_배열, ... };
	 * 
	 * 		자료형[][] 변수명 = { {값, 값, 값}, {값, 값, 값}, ...};
	 * 
	 * 		자료형[][] 변수명 = { new 자료형[크기], new 자료형[크기], ...);
	 */
	
	
	
	public static void main(String[] args) {

		method2();
	}

	public static void method1() {
		// 정수형 2차원 배열 선언
		int[][] arr;
		
		// 크기가 4인 1차원 배열 3묶음으로 할당 (3행 4열)
		// arr = new int[3][4];
		arr = new int[3][];
		
		// 크기가 4인 1차원 배열 생성
		//  => new int[4];
		/*
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		*/
		
		// * 2차원 배열의 행 크기 : 배열명.length
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = new int[4];
		}
		
		// arr[0].length => 4. 열의 크기. 해당 인덱스 위치의 1차원 배열 크기
		
		// * 2차원 배열의 값 출력
		
		// 반복문을 사용하여 출력
		for(int i = 0 ; i < arr.length ; i++) {
			// i: 행인덱스, 0 ~ 행크기-1
			for(int j = 0; j < arr[i].length ; j++) {
				// j: 열인덱스, 0 ~ 열크기-1
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
		// * 값 대입
		//   초기화 => {} (arr2 배열)
		int[][] arr2 = {
							{1, 2, 3, 4},
							{5, 6, 7, 8},
							{9, 10, 11, 12}
							};
		// * arr2 배열에서 7을 출력
		
		System.out.println("arr2[1][2] : " + arr2[1][2]);
		
	}
	
	
	public static void method2() {
		/*
		 * 아래 문자열 데이터를 저장할 2차원 배열을 선언 및 생성하고
		 * 각 위치에 값을 대입해보자.
		 * 
		 * "(0행 0열)""(0행 1열)" "(0행 2열)" 
		 * "(1행 0열)""(1행 1열)" "(1행 2열)"
		 * "(2행 0열)""(2행 1열)" "(2행 2열)"
		 *
		 * !! 체크 사항 !!
		 * 1) 데이터가 어떤 타입인가? (자료형)
		 * 2) 몇 개의 행이 필요한가? (패턴 분석)
		 * 3) 한 행에 몇 개의 데이터를 저장할 것인가?
		 */
		
		String[][] arr = new String[3][3];
		
		/* arr 배열의 현재 상태
		 * 		null null null
		 * 		null null null
		 * 		null null null
		 */
		
		// * 값 대입
		// [1] 직접 인덱스를 지정하여 대입
		arr[0][0] = "(0행 0열)";
		arr[0][1] = "(0행 1열)";
		arr[0][2] = "(0행 2열)";
		
		/* arr 배열의 현재 상태
		 * 		"0행 0열" "0행1열" "0행1열"
		 * 		null	 null 	 null
		 * 		null 	 null 	 null
		 */
		
		/*
		for(int i = 0; i < arr[0].length ; i++) {
			arr[0][i] = "(0행 " + i + "열)";
		}
		
		for(int i = 1; i < arr[1].length ; i++) {
			arr[1][i] = "(1행 " + i + "열)";
		}
		
		for(int i = 2; i < arr[2].length ; i++) {
			arr[2][i] = "(2행 " + i + "열)";
		}
			*/
		
		for(int row = 0; row < arr.length ; row++) {
			for(int i = 0; i < arr[row].length ; i++) {
				arr[row][i] = "("+ row +"행 " + i + "열)";
			}
		}
		
		// * 값 출력
		
		System.out.println();
		
		for(int row = 0; row < arr.length ; row++) {
			for(int i = 0; i < arr[row].length ; i++) {
				System.out.print(arr[row][i] + " ");
			}
			System.out.println();
		}
	}
	
}
