package codeup.q1492;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			data[i] = sc.nextInt();
			
		}
		
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			
			sum += data[i];
			System.out.printf("%d ", sum);
			
		}
		
		sc.close();
	}

}