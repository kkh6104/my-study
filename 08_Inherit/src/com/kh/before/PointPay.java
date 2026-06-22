package com.kh.before;

// 포인트 결제 방식
public class PointPay {
	
	private String payName;	//결제명
	private int payAmount;	// 결제 금액
	private int myPoint;	// 포인트 점수
	
	public PointPay(String payName, int payAmount, int myPoint) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.myPoint = myPoint;
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	// 결제 정보 출력
	public void processPay() {
		System.out.println( "=== 포인트 결제 방식 ===");
		System.out.println( "- 결제 금액 : " + payAmount);
		System.out.println( "- 내 포인트 잔액 : " + myPoint);
		
		// 결제 금액 < 포인트 잔액 => "결제 성공"
		//			그렇지 않으면 => 결제 실패(잔액 부족)"
		
		System.out.println((myPoint >= payAmount)? "결제 성공!": "결제 실패(잔액 부족)");
		
		
	}
	
	
	
}
