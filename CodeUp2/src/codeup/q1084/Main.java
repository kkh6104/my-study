package codeup.q1084;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int red = sc.nextInt();
		int green = sc.nextInt();
		int blue = sc.nextInt();
		int count = 0;
		
		for (int i = 0 ; i < red ; i++ ) {
			for (int j = 0 ; j < green ; j++) {
				for (int k = 0 ; k < blue ; k++) {
					bw.write("" + i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}
		bw.write("" + count + "\n");
		bw.close();
		sc.close();
	}
}