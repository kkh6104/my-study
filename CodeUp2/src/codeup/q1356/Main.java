package codeup.q1356;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		if (side == 2) {
			System.out.println("**");
			System.out.println("**");
		}
		else {
			for (int i = 0; i < side; i++) {
				for (int j = 0; j < side; j++) {
					if (i >= 1 && i <= side - 2 && j >= 1 && j <= side - 2) {
						System.out.print(" ");
						continue;
					}
					System.out.print("*");

				}
				System.out.println();
			}
		}
		sc.close();
	}
}