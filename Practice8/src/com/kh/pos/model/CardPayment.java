package com.kh.pos.model;

public class CardPayment extends PaymentMethod {

	private boolean hasCashback;
	
	public CardPayment() {}

	public CardPayment(String name, int minAge, int transactionLimit
						, boolean hasCashback) {
		super(name, minAge, transactionLimit);
		this.hasCashback = hasCashback;
	}

	// * Controller 에서 hasCashback 값을 확인하기 위해 메소드 추가
	// 			=> isXXX (필드 타입이 boolean 인 경우만!)
	
	public boolean isHasCashback() {
		return hasCashback;
	}
	
	@Override
	public String toString() {
		return String.format("신용/체크카드 - 카드명: %s | 캐시백 여부: %s"
				, super.toString(), hasCashback ? "캐시백 가능" : "캐시백 없음");
	}

	

	public void setHasCashback(boolean hasCashback) {
		this.hasCashback = hasCashback;
	}
	

}
