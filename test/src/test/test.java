package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		
		if (b>=a) System.out.print(1);
		else System.out.print(0);
		
		sc.close();
	}

}
