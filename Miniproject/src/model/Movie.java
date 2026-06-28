package model;

public class Movie extends Content {

	private double rating;

	
	
	
	public Movie(String title, String contentID, int price, int ageLimit, double rating) {
		super(title, contentID, price, ageLimit);
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return String.format("제목 : %s, 컨텐츠 번호 : %s, 가격 : %d, 연령제한 : %d, 별점 : %f", title, contentID, price, ageLimit, rating);

	}


	
	
	
}
