package p1096;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[19][19];
		int[] point = new int[2];
				
		for (int i = 0 ; i < n ; i++ ) {
			
			point[0] = sc.nextInt();
			point[1] = sc.nextInt();
			
			for (int j = 0 ; j < 20 ; j++) {
				for(int k = 0 ; k < 20 ; k++ ) {
					if( j == point[0] - 1 && k ==  point[1] - 1 ) board[j][k] = 1;
				}
				
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