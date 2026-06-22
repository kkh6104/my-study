

// 공통되는 결제 정보를 관리하기 위한 클래스
// - 결제명(payName), 결제금액(payAmount), 결제 정보 출력 (processPay())

public class PaymentMethod {

	private String payName;  	
	private int payAmount;
	
	public PaymentMethod() {
		super();
	}
	
	
	public PaymentMethod(String payName, int payAmount) {
		super();
		this.payName = payName;
		this.payAmount = payAmount;
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



	public void processPay() {
		System.out.println("=== 결제 정보 ===");
		System.out.println("- 결제명: " +payName);
		System.out.println("- 결제금액: " +payAmount);
	}
}
