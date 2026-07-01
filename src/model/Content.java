package model;

public abstract class Content {

	protected String title;
	protected String contentID;
	protected int price;
	protected int ageLimit;

	public Content() {

	}

	public Content(String title, String contentID, int price, int ageLimit) {
		this.title = title;
		this.contentID = contentID;
		this.price = price;
		this.ageLimit = ageLimit;
	}

	public String getTitle() {
		return title;
	}

	public String getContentID() {
		return contentID;
	}

	public int getPrice() {
		return price;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	@Override
	public abstract String toString();

}
