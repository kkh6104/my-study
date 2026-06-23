package com.kh.stream.model;

public class Content {

	protected String title;
	protected	int ageRestriction;
	protected int price;
		
		public Content() {
	}

	public Content(String title, int ageRestriction, int price) {
		this.title = title;
		this.ageRestriction = ageRestriction;
		this.price = price;
	}

	public int getAgeRestriction() {
		return ageRestriction;
	}
	
	@Override
	public String toString() {
	    return "제목: " + title + ", 제한연령: " + ageRestriction + "세, 가격: " + price + "원";
	}
	
	
}
