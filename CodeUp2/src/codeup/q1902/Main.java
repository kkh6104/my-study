package codeup.q1902;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(n);
		
		sc.close();
	}

	public static void print(int n) {
		if (n == 0) {
			return;
		}
		
		else {
			System.out.println(n);
			print(n-1);
			return;
		}
	}
}