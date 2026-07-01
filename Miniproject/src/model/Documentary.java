package model;

public class Documentary extends Content {

	@Override
	public String toString() {
		return String.format("제목 : %s, 컨텐츠 번호 : %s, 가격 : %d, 연령제한 : %d", title, contentID, price, ageLimit);
	}

	public Documentary(String title, String contentID, int price, int ageLimit) {
		super(title, contentID, price, ageLimit);
	}

	public static class AnimalDocu extends Documentary implements Animal {

		public AnimalDocu(String title, String contentID, int price, int ageLimit) {
			super(title, contentID, price, ageLimit);
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}

	public static class HumanitiesDocu extends Documentary implements Humanities {

		public HumanitiesDocu(String title, String contentID, int price, int ageLimit) {
			super(title, contentID, price, ageLimit);
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}

	public static class ScienceDocu extends Documentary implements Science {

		public ScienceDocu(String title, String contentID, int price, int ageLimit) {
			super(title, contentID, price, ageLimit);
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}

	public interface Animal {

	}

	public interface Humanities {

	}

	public interface Science {

	}
}
