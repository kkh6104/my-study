package model;

import model.interfaces.Science;

public class ScienceDocu extends Documentary implements Science{

	public ScienceDocu(String title, String contentID, int price, int ageLimit) {
		super(title, contentID, price, ageLimit);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
