package p1079;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			String st = sc.next();
			ch = st.charAt(0);
			System.out.println(ch);
		} while( ch != 'q');
	
		sc.close();
		
	}

}