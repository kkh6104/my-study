package p1093;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] randomN = new int[n]; 
		int count = 0;
				
		for (int i = 0 ; i < n ; i++ ) {
		
			randomN[(i)] = sc.nextInt();
						
		}
		
		for (int i = 1 ; i < 24 ; i++ ) {
			
			for (int j = 0 ; j < n ; j++ ) {
				if( i == randomN[j]) count++;
				}
						
			
			System.out.printf("%d ", count);
			count = 0;
		}
		
		
		sc.close();
		
	}

}