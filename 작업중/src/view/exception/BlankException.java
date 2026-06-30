package view.exception;

public class BlankException extends RuntimeException{

	public BlankException (String message) {
		System.out.println("=".repeat(15));
		System.out.println(message);
		System.out.println("=".repeat(15));
	}
	
	
}
