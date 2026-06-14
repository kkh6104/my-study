package codeup.q1351;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int start = sc.nextInt();		
		int end = sc.nextInt();
		
		for (int i = start ; i <= end ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i * j);
			}
		}
		sc.close();
	}
}