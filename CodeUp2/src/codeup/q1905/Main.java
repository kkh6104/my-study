package codeup.q1905;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(sum(n));

		sc.close();
	}
	
	public static int sum(int n) {
		if (n == 0) return 0;
		else return n + sum(n-1);
	}

}