package p1094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] randomN = new int[n]; 
		
		for (int i = 0 ; i < n ; i++ ) {
			randomN[(n - 1 - i)] = sc.nextInt();
						
		}
		
		for (int i = 0 ; i < n ; i++ ) {
			System.out.printf("%d ", randomN[i]);
		}
		
		
		sc.close();
		
	}

}