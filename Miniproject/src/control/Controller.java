package control;

import model.Content;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.exception.MinusMoneyException;
import model.exception.NotFoundContentsException;
import model.exception.NotIdentifiedException;
import service.Service;

public class Controller {

	Service sv = new Service();

	public String register(String id, String name, int age) {
		return sv.register(id, name, age);
	}

	public String deleteUser() {
		return sv.deleteUser();
	}

	public String identify(String UserID) {
		try {
			return sv.identify(UserID);
		} catch (NotIdentifiedException e) {
			return null;
		}
	}

	public String getUserID() {
		return sv.getUserID();
	}

	public Content[] showAllContentsList() {

		return sv.showAllContentsList();
	}

	public Content[] showAllEntertainmentsList() {

		return sv.showAllEntertainmentsList();
	}

	public Content[] searchByEntertainer(String keyWord) {

		return sv.searchByEntertainer(keyWord);
	}

	public String streaming(String ContetID) {
		try {
			return (sv.streaming(ContetID));
		} catch (LackOfBalanceException | AgeLimitException | NotFoundContentsException e) {
			return e.getMessage();
		}
	}

	public Content[] showAllMoviesList() {

		return sv.showAllMoviesList();
	}

	public Content[] sortByRating() {
		return sv.sortByRating();
	}

	public Content[] showAllDocuList() {

		return sv.showAllDocuList();
	}

	public Content[] animalDocu() {

		return sv.animalDocu();
	}

	public Content[] humanitiesDocu() {

		return sv.humanitiesDocu();
	}

	public Content[] scienceDocu() {

		return sv.scienceDocu();
	}

	public String showMyInfo() {
		return sv.showMyInfo();
	}

	public String reName(String name) {
		return sv.reName(name);
	}

	public int reAge(int age) {
		return sv.reAge(age);
	}

	public int getBalance() {
		return sv.getBalance();
	}

	public String topup(int money) {
		try {
			return sv.topup(money);
		} catch (MinusMoneyException e) {
			return null;
		}
	}
}
