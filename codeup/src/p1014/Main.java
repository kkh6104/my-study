package p1014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		char xCh = x.charAt(0);
		
		String y = sc.next();
		char yCh = y.charAt(0);
		
		System.out.printf("%s %s", yCh, xCh);
		
		sc.close();
		
	}

}
