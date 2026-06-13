package p1095;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int call;
		int minN = 23;
		
		for (int i = 0 ; i < n ; i++ ) {
			call = sc.nextInt();
			if (call < minN) minN = call;
						
		}
		
		System.out.print(minN);
		
		sc.close();
		
	}

}