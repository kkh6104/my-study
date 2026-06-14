package codeup.q1500;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();		// 데이터 수
		int k = sc.nextInt();		// 원하는 수
		int[] data = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			data[i] = sc.nextInt();
		}
		
		int result = n + 1 ;
		
		for(int i = 0 ; i < n ; i ++) {
			if ( data[i] >= k ) {
				result = i + 1;
				break;
			}
		}
		
		System.out.print(result);
		
		sc.close();
	}

}