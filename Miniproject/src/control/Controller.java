package control;

import model.Content;
import model.datarepository.DataRepository;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.exception.NotIdentifiedException;

public class Controller {

	
	DataRepository dr = new DataRepository();

	public void register(String name, int age) {
		dr.register(name, age);
	}

	public int getUserID() {

		return dr.getUserID();
	}

	public String identify(int inputUserID) {
		try {
			return "어서오세요 " + dr.identify(inputUserID) + "고객님 환영합니다.";	
		} catch (NotIdentifiedException e) {
			return e.getMessage();
		}
	}

	public Content[] showAllContentsList() {

		return dr.showAllContentsList();
	}

	public Content[] showAllEntertainmentsList() {

		return dr.showAllEntertainmentsList();
	}

	public Content[] searchByEntertainer(String keyWord) {

		return dr.searchByEntertainer(keyWord);
	}
	
	public String streaming(String inputContetID) {
		try {
			   return (dr.streaming(inputContetID));
		} catch (LackOfBalanceException e) {
			return e.getMessage();
		}catch(AgeLimitException e) {
			return e.getMessage();
		}
	}
	
	public Content[] showAllMoviesList() {

		return dr.showAllMoviesList();
	}
	
	public Content[] sortByRating(){
		return dr.sortByRating();
	}
	
	public Content[] showAllDocuList() {

		return dr.showAllDocuList();
	}
	
	public Content[] animalDocu() {

		return dr.animalDocu();
	}
	
	public Content[] humanitiesDocu() {

		return dr.humanitiesDocu();
	}
	
	public Content[] scienceDocu() {

		return dr.scienceDocu();
	}
	
	public String showMyInfo() {
		return dr.showMyInfo();
	}
	
	public void reName(String name) {
		dr.reName(name);
	}
	
	public void reAge(int age) {
		dr.reAge(age);
	}
	
	public void topup(int money) {
		dr.topup(money);
	}
}
