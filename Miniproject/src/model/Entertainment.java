package model;

public class Entertainment extends Content {

	private String entertainers;

	public Entertainment(String title, String contentID, int price, int ageLimit, String entertainers) {
		super(title, contentID, price, ageLimit);
		this.entertainers = entertainers;
	}

	public String getEntertainers() {
		return entertainers;
	}

	@Override
	public String toString() {
		return String.format("제목 : %s, 컨텐츠 번호 : %s, 가격 : %d, 연령제한 : %d, 출연자 : %s", title, contentID, price, ageLimit,
				entertainers);

	}

}
