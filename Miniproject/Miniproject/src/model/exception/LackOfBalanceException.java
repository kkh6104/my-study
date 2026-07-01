package model.exception;

public class LackOfBalanceException extends RuntimeException {

	public LackOfBalanceException() {

	}

	public LackOfBalanceException(String message) {
		super(message);
	}
}
