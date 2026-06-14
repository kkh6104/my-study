package codeup.q1496;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for( int i = 0 ; i < n ; i++  ) {
			data[i] = sc.nextInt();
		}
		
		for( int i = 0 ; i < n / 2 ; i++ ) {
			
			if ( data[2 * i] <= data[2 * i + 1] ) System.out.printf("%d ", data[ 2 * i ]);
			else System.out.printf("%d ", data[ 2 * i + 1 ]);
		}
		
		sc.close();
	}

}