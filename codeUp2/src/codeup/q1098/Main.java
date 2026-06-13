package codeup.q1098;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] board = new int[h][w];
		
		int n = sc.nextInt();
		
		int l, d, x, y;
		
		for(int i = 0 ; i < n ; i++) {
			
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			for(int j = 0 ; j < l ; j++) {
			if ( d == 0) board[x-1][y-1+j] = 1;
			else board[x-1+j][y-1] = 1;				
			}
		}
		
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				System.out.printf("%d ", board[i][j]);
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}