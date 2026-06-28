package model;

public class Documentary extends Content {

	@Override
	public String toString() {
		return String.format("제목 : %s, 컨텐츠 번호 : %s, 가격 : %d, 연령제한 : %d", title, contentID, price, ageLimit);
	}

	public Documentary(String title, String contentID, int price, int ageLimit) {
		super(title, contentID, price, ageLimit);
	}

	
	
	
}