package codeup.q1037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ascII = sc.nextInt();
		
		if(0 <= ascII && ascII <= 255) {
			System.out.print((char)ascII);
		}
		else System.out.print("Input Error");
		
		sc.close();
	}

}
