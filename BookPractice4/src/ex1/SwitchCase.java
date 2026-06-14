package ex1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1을 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.print("기호를 입력해주세요 : ");
		String st = sc.next();
		char ch = st.charAt(0);
		double result = 0.0; // 나누기 때문에 실수형으로
		
		switch (ch) {
		case '+' : result = num1 + num2 ; break;
		case '-' : result = num1 - num2 ; break;
		case '*' : result = num1 * num2 ; break;
		case '/' : result = num1 / num2 ; break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(); // 입력과 출력의 분리
		
		System.out.printf("%d %s %d = %.1f" , num1, st, num2, result);
		
		sc.close();
		
	}

}
