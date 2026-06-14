package codeup.q1358;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int l = (n+1) / 2 ;
		
		for (int i = 0 ; i < l ; i++) {
			
			for (int j = 0 ; j < l - 1 - i ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0 ; j < 2 * i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}