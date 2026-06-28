package view.exception;

public class WrongCharacterException extends RuntimeException{

	public WrongCharacterException (String message) {
		System.out.println("=".repeat(15));
		System.out.println(message);
		System.out.println("=".repeat(15));
	}
	
	
}
