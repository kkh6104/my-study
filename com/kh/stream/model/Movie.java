package com.kh.stream.model;

public class Movie extends Content {

	private boolean winning;

	public Movie(String title, int ageRestriction, int price, boolean winning) {
		super(title, ageRestriction, price);
		this.winning = winning;
	}

	public boolean isWinning() {
		return winning;
	}
	
	@Override
	public String toString() {
	    return "[영화] " + super.toString() + ", 이벤트 여부: " + winning;
	}
	
}
