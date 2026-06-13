package codeup.q1097;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[19][19];
		for ( int i = 0 ; i < 19 ; i++ ) {
			for ( int j = 0 ; j < 19 ; j++ ) {
				board[i][j] = sc.nextInt();
			}
		}
				
		int n = sc.nextInt();
		
		int[] point = new int[2];
				
		for (int i = 0 ; i < n ; i++ ) {
			
			point[0] = sc.nextInt();
			point[1] = sc.nextInt();
			
			for (int j = 0 ; j < 19 ; j++) {
				if ( board[point[0]-1][j] == 0) board[point[0]-1][j] = 1;
				else board[point[0]-1][j] = 0;

				if ( board[j][point[1]-1] == 0) board[j][point[1]-1] = 1;
				else board[j][point[1]-1] = 0;
				}
				
			}
		
		for (int i = 0 ; i < 19 ; i++ ) {
			for (int j = 0 ; j <19 ; j++ ) {
				System.out.printf("%d ",board[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}