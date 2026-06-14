package codeup.q1503;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[][] data = new int[n][n];
		int input = 1;
		
		for (int i = 0 ; i < n ; i++) {
			if (i % 2 == 0) {
				for (int j = 0 ; j < n ; j++, input++) {
					data[i][j] = input;
					}
				}
			else {
				for (int j = n - 1 ; j >= 0 ; j--, input++) {
					data[i][j] = input;
					}
				}
			}
		for (int i = 0 ; i < n ; i++ ) {
			for (int j = 0 ; j < n ; j++) {
				System.out.printf("%d ", data[i][j]);
			}
			System.out.println();
			}
		

		sc.close();
	}

}