package codeup.q1070;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 12 : case 1 : case 2 : System.out.print("winter"); break;
		case 3 : case 4 : case 5 : System.out.print("spring"); break;
		case 6 : case 7 : case 8 : System.out.print("summer"); break;
		case 9 : case 10 : case 11 : System.out.print("fall"); break;
		default : System.out.print("Input Error");
		}
		
		sc.close();
		
	}

}