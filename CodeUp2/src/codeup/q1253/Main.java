package codeup.q1253;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c; //  정렬용

		if(a > b) {
			c = a;
			a = b;
			b = c;
		}
		
		for (int i = a ; i <= b ; i++) {
			System.out.printf("%d ", i);
		}
		
		sc.close();
		
	}
}