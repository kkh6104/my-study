package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// * 5명의 학생 점수를 저장할 배열 선언 및 생성
		int[] sArr = new int[5];
		int total = 0;
		
		for (int i = 0 ; i < 5; i++) {
		System.out.printf("%d번 학생 점수 입력 : " ,i+1);
		sArr[i] = sc.nextInt();
		total += sArr[i];
		}
		
		
		// 총합과 평균 계산
		// * 학생들의 점수 -> 배열에 저장되어 있음
		
		
		System.out.println();
		System.out.printf("총합 : %d점\n", total);
		System.out.printf("평균 : %.1f점" ,(double)total/sArr.length);
		
		sc.close();
	}

}
