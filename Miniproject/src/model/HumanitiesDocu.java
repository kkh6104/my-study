package model;

import model.interfaces.Humanities;

public class HumanitiesDocu extends Documentary implements Humanities{

	public HumanitiesDocu(String title, String contentID, int price, int ageLimit) {
		super(title, contentID, price, ageLimit);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
