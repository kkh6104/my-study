package codeup.q1087;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int num = 1;
		
		while(sum < n) {
			sum += num;
			num++;
		}

		System.out.print(sum);
		
		sc.close();
		
	}
}