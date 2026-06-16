package codeup.q1082;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int hex = Integer.parseInt(str, 16);
		
		for (int i = 1 ; i < 16 ; i++) {
			System.out.printf("%X*%X=%X\n", hex, i, hex*i);
		}
		
		
		
		sc.close();
	}
}