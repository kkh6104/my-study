package model.exception;

public class NotFoundContentsException extends RuntimeException{

	public NotFoundContentsException() {
		
	}

	public NotFoundContentsException(String message) {
		super(message);
	}
	
}
