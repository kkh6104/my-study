package shoppingpr;

public class FreshFood extends Product implements Deliverable{

	public FreshFood(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepareDelivery() {
		System.out.println("[새벽배송] "+getName()+"을 아이스박스에 신선 포장합니다.");
		
	}

	@Override
	public int calculateDeliveryFee() {
		return 5000;
	}



}
