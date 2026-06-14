package codeup.q1499;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();		// 데이터 수
		int g = sc.nextInt();		// 묶을 단위
		int[] data = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			data[i] = sc.nextInt();
		}
		
		int max;
		
		for(int i = 0 ; i < n ; i += g ) {
			max = data[i];
			for(int j = i ; j < i + g && j < n ; j++) {
				if(data[j] > max) max=data[j];
			}
			System.out.printf("%d ", max);
		}
	
		sc.close();
	}

}