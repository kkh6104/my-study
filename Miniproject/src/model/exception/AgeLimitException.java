package model.exception;

public class AgeLimitException extends RuntimeException{

	public AgeLimitException (String message) {
		System.out.println("=".repeat(15));
		System.out.println(message);
		System.out.println("=".repeat(15));
	}
	
}
