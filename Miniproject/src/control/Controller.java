package control;

import model.Content;
import model.datarepository.DataRepository;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;

public class Controller {

	
	DataRepository dr = new DataRepository();

	public void register(String name, int age) {
		dr.register(name, age);
	}

	public int getUserID() {

		return dr.getUserID();
	}

	public void identify(int inputUserID) throws NullPointerException {

		dr.identify(inputUserID);

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
	
	public String streaming(String inputContetID) throws LackOfBalanceException, AgeLimitException{
		return dr.streaming(inputContetID);
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
