package com.kh.ex2;

public class BankAccount {

	private int balance;
	
	public BankAccount(int initialBalance) {
		
		this.balance = initialBalance;
	}
	
	/*
	 * 현재 잔액 반환 // 이거 안쓰려면 생성자 이용시 바로 출력시키는 방법.
	 */
	public int getBalance() {
		return balance;
	}
	
	/**
	 * 출금 기능, 현재 잔액에서 전달받은 금액(amount) 차감
	 * @param amount 출금 금액
	 */
	public void withdraw(int amount) throws NotEnoughBalanceException{
				
			if(this.balance < amount) {
				// 예외 발생 시키기!!!
				throw new NotEnoughBalanceException("[출금 오류 발생] 잔액이 부족합니다.", this.balance , amount);
				
			} else {
				this.balance -= amount;
				System.out.println("출금 완료! 남은 잔액: "+this.balance+"원");
			
			}
		
		
		
	}
}
