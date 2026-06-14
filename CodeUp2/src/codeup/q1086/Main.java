package codeup.q1086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%.2f MB", (double)(w*h*b)/ 8 / 1024 / 1024 );

		sc.close();
		
	}
}