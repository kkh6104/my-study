package com.kh.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.model.Student;
// 단축키 Ctrl + Shift + o

public class Run {
	/*
	 * * 객체 배열 : 여러 개의 객체를 저장하여 관리하는 구조
	 *  !! 주의 !!
	 *  : 배열을 생성(new 클래스명[크기])한다고 해서 실제 객체를 생성하는 것이 아니라
	 *    객체의 주소를 담을 수 있는 참조 변수만 만들어짐!(기본값 : null)
	 *    
	 *     - 선언 : 클래스명[] 변수명;
	 *     - 할당(생성) : 변수명 = new 클래스명[배열크기];
	 *     
	 *     - 값 대입(객체 생성)
	 *     	 변수명[인덱스] = new 생성자; // 생성자 -> 클래스명();
	 *     - 초기화
	 *     	 변수명 = { new 생성자,new 생성자, ... }; 
	 */
	
	
	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		
		int[] arr = new int[3];  // [ 0, 0, 0 ] 
		
		// [ 1, 2, 3 ]
		// arr[0] = 1; arr[1] = 2; arr[2] = 3;
		for(int i =0 ; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------------");
		// * 학생 정보를 담을 객체 배열 선언 및 할당
		//  - 학생 클래스 (Student)
		//   - name:String
		//   - age:int
		//   - score:double
		
		// * 학생 객체 생성
		Student s1 = new Student(); // s1 -> | name(null) | age(0) | score(0.0)
		
		// * 학생 배열 생성
		Student[] sArr = new Student[3]; // sArr -> [ null, null, null ]
		
		// * 배열의 각 위치에 학생 정보를 저장(대입)
		sArr[0] = new Student("권경환", 39, 80.5); // sArr -> [ 권경환학생의정보, null, null ]
		sArr[1] = new Student("정우찬", 20, 95.2); // sArr -> [ 권경환학생의정보, 정우찬학생의정보, null ]
		sArr[2] = new Student("조빌립", 20, 100); // sArr -> [ 권경환학생의 정보, 정우찬학생의정보, 조빌립학생의 정보 ]
		
		// * 기본 생성자로만 생성할 경우 => 반복문 사용!
//		for(int i=0; i<sArr.length;i++) {
//			sArr[i] = new Student();	
//		}
		
		// *두번째 학생 정보 출력
		//  1) 배열에서 몇번째 위치의 값으로 접근할 것인지 => 1번 인덱스 상ㅇ
		//  2) 학생 정보 출력 기능(메소드)가 있는지? 없으면 getter 메소드 활용! => printInfo()
		sArr[1].printInfo();
		
		// sArr.printInfo(); // => 오류 발생! 배열(sArr)은 printInfo 라는 기능을 가지고 있지 않음!
		
		//* 세번째 학생 정보 삭제
		sArr[2] = null; // sArr -> [ 권경환학생의정보, 정우찬학생의정보, null ]
		
		// sArr[2].printInfo(); // => 객체가 제거되었는 데 기능을 호출하려고 함!
		//							   NullPointException 발생!!
		
		System.out.println("--------------------------------");
		// * 값을 입력받아 학생 정보 저장
		Scanner sc = new Scanner(System.in);
		
		Student[] sArr2 = new Student[2];
		
		// * 반복문을 사용하여 입력 받은 값을 배열에 저장
		for(int i = 0; i < sArr2.length; i++) {
			System.out.print("* 이름 : ");
			String name = sc.next();
			
			System.out.print("* 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("* 점수 : ");
			double score = sc.nextDouble();
			
			
		// * 1번째 위치에 입력받은 학생 정보로 객체를 생성
			sArr2[i] = new Student(name, age, score);
		}
		
		// * 출력
		System.out.println("=== 학생 정보 ===");
		// for (자료형 변수명:배열명) {}
		for(Student s : sArr2) {      // s-> sArr2[i]
			s.printInfo();
		}
	}
	
}
