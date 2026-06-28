package model.exception;

public class LackOfBalanceException extends RuntimeException{

	public LackOfBalanceException (String message) {
		System.out.println("=".repeat(15));
		System.out.println(message);
		System.out.println("=".repeat(15));
	}
	
	
}
