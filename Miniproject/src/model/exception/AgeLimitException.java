package model.exception;

public class AgeLimitException extends RuntimeException{

	public AgeLimitException() {
		
	}

	public AgeLimitException(String message) {
		super(message);
	}
	
}
