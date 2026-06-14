package codeup.q1502;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[][] data = new int[n][n];
		int input = 1;
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n ; j++, input++) {
				data[j][i] = input;
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