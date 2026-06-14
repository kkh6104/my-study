package ex5;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 층 수(홀수)를 입력하세요 : ");
		int floor = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0 ; i < floor ; i++ ) {
			
			if(i < ((floor + 1)/ 2)) {
				for(int j = 0 ; j < ((floor / 2 ) - i ) ; j++) {
					
					System.out.print(" ");
									
				}
				
				for(int k = 0 ; k < (2 * i + 1) ; k++) {
					
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j = 0 ; j <= i - ((floor + 1) / 2) ; j++) {

					System.out.print(" ");

				}
				
				for(int k = 0 ; k < ((2 * (floor - i - 1)) + 1 ) ; k++) {
					
					System.out.print("*");
					
				}
				System.out.println();
			}
				
		}
			
			
		
		sc.close();
	}

}
