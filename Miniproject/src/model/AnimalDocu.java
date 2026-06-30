package model;

import model.interfaces.Animal;

public class AnimalDocu extends Documentary implements Animal{

	public AnimalDocu(String title, String contentID, int price, int ageLimit) {
		super(title, contentID, price, ageLimit);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
