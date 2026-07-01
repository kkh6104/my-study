package service;

import model.Content;
import model.Documentary.Animal;
import model.Documentary.Humanities;
import model.Documentary.Science;
import model.Entertainment;
import model.Movie;
import model.User;
import model.datarepository.DataRepository;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.exception.MinusMoneyException;
import model.exception.NotFoundContentsException;
import model.exception.NotIdentifiedException;

public class Service {

	DataRepository dr = new DataRepository();
	User currentUser;

	public String register(String userID, String name, int age) {
		this.currentUser = new User(userID, name, age, 0);
		dr.reNewal(userID, currentUser);
		return userID;
	}

	public String deleteUser() {

		dr.deleteUser(currentUser.getUserID(), currentUser);
		return currentUser.getName();

	}

	public String getUserID() {
		return currentUser.getUserID();
	}

	public int getBalance() {
		return currentUser.getBalance();
	}

	public String reName(String name) {
		this.currentUser.setName(name);
		dr.reNewal(currentUser.getUserID(), currentUser);
		return currentUser.getName();
	}

	public int reAge(int age) {
		this.currentUser.setAge(age);
		dr.reNewal(currentUser.getUserID(), currentUser);
		return currentUser.getAge();
	}

	public String topup(int money) throws MinusMoneyException {
		if (money <= 0) {
			throw new MinusMoneyException("0원 이하는 충전하실 수 없습니다.");
		}
		this.currentUser.setBalance(currentUser.getBalance() + money);
		dr.reNewal(currentUser.getUserID(), currentUser);
		return "" + currentUser.getBalance();
	}

	public String identify(String userID) throws NotIdentifiedException {

		this.currentUser = dr.identify(userID);
		if (currentUser == null) {
			throw new NotIdentifiedException("등록하지 않은 아이디 입니다.");
		} else {
			return currentUser.getName();
		}

	}

	public Content[] showAllContentsList() {

		return dr.showAllContentsList();
	}

	public Content[] showAllEntertainmentsList() {

		return dr.showAllEntertainmentsList();
	}

	public Content[] showAllMoviesList() {

		return dr.showAllMoviesList();
	}

	public Content[] showAllDocuList() {

		return dr.showAllDocuList();
	}

	public Content[] searchByEntertainer(String keyWord) {

		Content[] entertainmentContents = dr.showAllEntertainmentsList();
		int count = 0;
		for (Content i : entertainmentContents) {
			if (i instanceof Entertainment && (((Entertainment) i).getEntertainers()).contains(keyWord))
				count++;
		}

		Content[] searchResult = new Content[count];
		count = 0;
		for (Content i : entertainmentContents) {
			if (i instanceof Entertainment && (((Entertainment) i).getEntertainers()).contains(keyWord)) {
				searchResult[count++] = i;
			}
		}
		return searchResult;
	}

	public String streaming(String ContetID)
			throws LackOfBalanceException, AgeLimitException, NotFoundContentsException {

		Content selectedOne = null;
		for (Content i : dr.showAllContentsList()) {
			if ((i.getContentID()).equals(ContetID))
				selectedOne = i;

		}
		if (selectedOne == null)
			throw new NotFoundContentsException("컨텐츠 번호를 잘못 입력하셨습니다.");

		if (selectedOne.getPrice() > currentUser.getBalance()) {
			throw new LackOfBalanceException("잔액이 부족합니다.");
		}

		if (selectedOne.getAgeLimit() > currentUser.getAge()) {
			throw new AgeLimitException("연령 제한보다 어립니다.");
		}

		currentUser.setBalance(currentUser.getBalance() - selectedOne.getPrice());
		dr.reNewal(currentUser.getUserID(), currentUser);
		return selectedOne.getTitle() + "을(를) 재생하겠습니다.";

	}

	public Content[] sortByRating() {
		Content[] movieContents = dr.showAllMoviesList();
		Content[] copy = new Content[movieContents.length];
		System.arraycopy(movieContents, 0, copy, 0, movieContents.length);
		Content temp;

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy.length - 1; j++) {
				if (((Movie) copy[j]).getRating() < ((Movie) copy[j + 1]).getRating()) {
					temp = copy[j + 1];
					copy[j + 1] = copy[j];
					copy[j] = temp;
				}
			}
		}

		return copy;

	}

	public Content[] animalDocu() {

		int count = 0;

		Content[] docuContents = dr.showAllDocuList();
		for (Content i : docuContents) {
			if (i instanceof Animal)
				count++;
		}

		Content[] animaldocus = new Content[count];
		count = 0;
		for (Content i : docuContents) {
			if (i instanceof Animal) {
				animaldocus[count++] = i;
			}
		}
		return animaldocus;
	}

	public Content[] humanitiesDocu() {

		int count = 0;

		Content[] docuContents = dr.showAllDocuList();
		for (Content i : docuContents) {
			if (i instanceof Humanities)
				count++;
		}

		Content[] humanitiesdocus = new Content[count];
		count = 0;
		for (Content i : docuContents) {
			if (i instanceof Humanities) {
				humanitiesdocus[count++] = i;
			}
		}
		return humanitiesdocus;
	}

	public Content[] scienceDocu() {

		int count = 0;

		Content[] docuContents = dr.showAllDocuList();
		for (Content i : docuContents) {
			if (i instanceof Science)
				count++;
		}

		Content[] sciencedocus = new Content[count];
		count = 0;
		for (Content i : docuContents) {
			if (i instanceof Science) {
				sciencedocus[count++] = i;
			}
		}
		return sciencedocus;
	}

	public String showMyInfo() {
		return currentUser.toString();
	}

}
