package codeup.q1915;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(fibo(n));

		sc.close();
	}
	
	public static int fibo(int n) {
		switch (n) {
		case 1 : return 1;
		case 2 : return 1;
		default : {
				return fibo(n-2) + fibo(n-1);
			}
		}
	}

}