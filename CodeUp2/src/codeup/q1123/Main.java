package codeup.q1123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.printf("%.3f", (double)n * 9 / 5 + 32 );

		sc.close();
		
	}
}