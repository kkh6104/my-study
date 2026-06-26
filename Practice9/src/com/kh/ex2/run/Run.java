package com.kh.ex2.run;

import com.kh.ex2.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		
		for (int i = 0;i<2;i++) {
			System.out.println(pc.method()[i]);
			if (i%2==0) System.out.println();
		}
		
	}

}
