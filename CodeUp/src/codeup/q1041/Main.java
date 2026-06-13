package codeup.q1041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char ch = st.charAt(0);
		
		System.out.print((char)((int)ch + 1));
		
		sc.close();
		
	}

}
