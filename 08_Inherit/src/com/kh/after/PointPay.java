package com.kh.after;

// 포인트 결제 방식
// [1] 공통 부분제거
// [2] 상속 관계 적용
// [3] getter, setter, 생성자 등을 활용해서 원래 기능이 동작되도록 처리
public class PointPay extends PaymentMethod{
	
	// 포인트 결제 방식에만 사용되는 데이터 
	private int myPoint;	// 포인트 점수
	
	public PointPay(String payName, int payAmount, int myPoint) {
		super(payName, payAmount);
		this.myPoint = myPoint;
	}

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	// + processPay():void
	// 결제 정보 출력
	@Override			// 오버라이딩 된 메소드를 명시적으로 표시, 컴파일 단계에서 잘못 작성했을 경우 오류로 알려줌! 
	public void processPay() {
		System.out.println(" === 포인트 결제 방식 === ");
		//System.out.println("- 결제 금액 : " + payAmount);
		System.out.println("- 결제 금액 : " + getPayAmount());
		System.out.println("- 내 포인트 잔액 : " + myPoint);
		
		// 결제 금액 < 포인트잔액 => "결제 성공"
		//			그렇지 않으면 => "결제 실패(잔액 부족)"
		System.out.println(
				(getPayAmount() < myPoint) ? "결제 성공!" : "결제 실패(잔액 부족)"
				);
	}
	
	
}
