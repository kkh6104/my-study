package test;

public class Game369 {

	public static void main(String[] args) {

		int a;
		int b;
		
		for(int i =1 ; i <= 50; i++) {
			a = i / 10;
			b = i % 10;
			if((a==3||a==6||a==9) && (b==3||b==6||b==9) ) {
				System.out.println("짝짝");
			} else if((a==3||a==6||a==9)||(b==3||b==6||b==9)){
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
				
		}
	}
}