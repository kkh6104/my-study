package p1099;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[10][10];
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int x = 1;

		Loop1 :
		
		for(int y =1 ; y < 9 ; y++) {
		
				switch(board[y][x]) {
				case 2 : {
					board[y][x] = 9;
					break Loop1 ;
					}
				case 0 : {
					board[y][x] = 9;
					x++;
					y--;
					break;
					}
				case 1 : {
					switch(board[y+1][x-1]) {
						case 2 : {
							board[y+1][x-1] = 9;
							break Loop1;
							}
						case 1 : {
							break Loop1;
							}
						case 0 : {
							board[y+1][x-1] = 9;
							break;
							}
						}
					}
				}
			
			
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				System.out.printf("%d ", board[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}