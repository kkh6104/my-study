package codeup.q1166;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ( year % 400 == 0 ) {
			System.out.print("Leap");
		}
		else if ( year % 4 == 0 && year % 100 != 0 ) {
			System.out.print("Leap");
		}
		else System.out.print("Normal"); 

		sc.close();
		
	}
}