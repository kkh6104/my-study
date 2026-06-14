package codeup.q1904;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		oddtest(a, b);	
	}
	
	public static int oddtest(int a, int b) {
		if ( a == b) {
			if (b % 2 != 0) System.out.printf("%d ", b);
			return 0;
		}
		else {
			if (a % 2 != 0) System.out.printf("%d ", a);
			return oddtest(a + 1, b);
		}
		
	}
	
}