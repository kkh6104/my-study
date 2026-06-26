package com.kh.ex2;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 배열 생성
		// [ 원, 사각형 ]
		
		// 출력
		/*
		 	 원의 넓이 : 0000
		 	 사각형의 넓이 : 0000
		 */
		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Circle(5.0);
		shapes[1] = new Rectangle(3.0, 2.0);
		
		for(Shape i : shapes) {
			if(i instanceof Circle) {
				System.out.print("원의 넓이 : ");
			} if(i instanceof Rectangle) {
				System.out.print("사각형의 넓이 : ");
			}
			System.out.printf("%.2f\n",  i.calculateArea());
		}
	}
}
