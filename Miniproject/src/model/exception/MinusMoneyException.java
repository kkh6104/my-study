package model.exception;

public class MinusMoneyException extends RuntimeException {

	public MinusMoneyException() {

	}

	public MinusMoneyException(String message) {
		super(message);
	}

}
