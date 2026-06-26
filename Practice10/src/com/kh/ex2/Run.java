package com.kh.ex2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount account = new BankAccount(10000);
		
		System.out.println("=== 신한은행 출금 시스템 ===");
		
		System.out.println("현재 잔액 : " + account.getBalance());
		
		System.out.print("출금 시도 금액: ");
		
		int withdrowAmount = sc.nextInt();
		
    	try{
    		account.withdraw(withdrowAmount);
      	} catch(NotEnoughBalanceException e) {
      			System.out.println("부족한 금액: " + e.getShortfallAmount());
      	}
		
		System.out.println("=== 거래가 종료되었습니다 ===");
		
		sc.close();
		
	}
	
}
