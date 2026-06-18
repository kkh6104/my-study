package com.kh.ex3;

import java.util.Arrays;

public class Quiz3 {

	public static void main(String[] args) {
	
		method2();
	}
	
	public static void method1() {
		int[] arr = new int[10]; 
		
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;			
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		int temp;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

	public static void method2() {
		int[] arr = new int[10]; 
		
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;			
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}
	
}
