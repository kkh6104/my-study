package model.exception;

public class NotIdentifiedException extends RuntimeException {

	public NotIdentifiedException() {
	}

	public NotIdentifiedException(String message) {
		super(message);
	}
}
