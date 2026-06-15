package codeup.q1901;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(n,1);
		
		sc.close();
	}

	public static void print(int n, int count) {
		if (n == count) {
			System.out.println(n);
			return;
		}
		
		else {
			System.out.println(count);
			count++;
			print(n, count);
			return;
		}
		
	}
}