package shoppingpr;

public class GeneralProduct extends Product implements Deliverable{

	public GeneralProduct(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepareDelivery() {
		System.out.println("[일반배송] "+ getName() +"을 택배 상자에 포장합니다.");
	}

	@Override
	public int calculateDeliveryFee() {
		if (getPrice() >= 30000) return 0;
		else return 3000;
	}

	
}
