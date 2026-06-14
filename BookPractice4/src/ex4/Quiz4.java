package ex4;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 층 수를 입력하세요 : ");
		int floor = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0 ; i < floor ; i++ ) {
			
			for(int j = floor - i ; j > 1 ; j--) {
				
				System.out.print(" ");
								
			}
			
			for(int k = 0 ; k < (2 * i + 1) ; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
