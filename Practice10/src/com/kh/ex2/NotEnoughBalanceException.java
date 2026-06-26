package com.kh.ex2;

public class NotEnoughBalanceException extends Exception{

	private int balance;
	private int withdrawalAmount;
	
	public NotEnoughBalanceException(String message, int balance, int withdrawalAmount) {
		super(message);
		this.balance = balance;
		this.withdrawalAmount = withdrawalAmount;
	}

	
	
	
	/**
	 * 부족한 금액을 반환하는 메소드
	 * @return -(balance - withdrawalAmount);
	 */
	public int getShortfallAmount() {
		return -(balance - withdrawalAmount);
		// return withdrawalAmount - balance;
	}
	
	
}
