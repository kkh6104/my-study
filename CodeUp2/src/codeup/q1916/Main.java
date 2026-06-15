package codeup.q1916;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.print(fibo(N));
		
		sc.close();
	}

	static int[] fData = new int[500];
	
	public static int fibo(int n) {
		if(fData[n] > 0) return fData[n];
		if(n <= 2) return fData[n] = 1;
		else {
			return fData[n]=(fibo(n-1)+fibo(n-2))%10009;
		}

	}
}