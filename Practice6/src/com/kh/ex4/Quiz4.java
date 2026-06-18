package com.kh.ex4;

import java.util.Arrays;
import java.util.Random;

public class Quiz4 {

	public static void main(String[] args) {
	
	 method2();	
	 
	}

	public static void method1() {
	
		int[] arr = new int[10]; 
		
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;			
		}
		
		System.out.println("생성된 배열 : " + Arrays.toString(arr));

		int countEven = 0;
		
		for(int i : arr) {
			if ((i % 2) != 0) {
				countEven++;
			}
		}
		System.out.printf("짝수의 개수 : %d\n", countEven);
		System.out.printf("홀수의 개수 : %d\n", arr.length - countEven);
	}
	
	public static void method2() {
		
		Random random = new Random();
		
		int[] arr = new int[10]; 
		
		
		for(int i = 0; i < 10; i++) {
			arr[i] = random.nextInt(100) + 1;			
		}
		
		System.out.println("생성된 배열 : " + Arrays.toString(arr));

		int countEven = 0;
		
		for(int i : arr) {
			if ((i % 2) != 0) {
				countEven++;
			}
		}
		System.out.printf("짝수의 개수 : %d\n", countEven);
		System.out.printf("홀수의 개수 : %d\n", arr.length - countEven);
	}
	
}
