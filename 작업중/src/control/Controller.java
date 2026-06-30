package control;

import model.Content;
import model.datarepository.DataRepository;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.exception.NotFoundContentsException;
import model.exception.NotIdentifiedException;
import service.Service;

public class Controller {

	
	Service sv = new Service();

	public void register(String id, String name, int age) {
		sv.register(id, name, age);
	}

	public String identify(String inputUserID) {
		try {
			return "어서오세요 " + sv.identify(inputUserID) + "고객님 환영합니다.";	
		} catch (NotIdentifiedException e) {
			return e.getMessage();
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
	
	public String streaming(String inputContetID) {
		try {
			   return (sv.streaming(inputContetID));
		} catch (LackOfBalanceException e) {
			return e.getMessage();
		}catch(AgeLimitException e) {
			return e.getMessage();
		}catch(NotFoundContentsException e) {
			return e.getMessage();
		}
	}
	
	public Content[] showAllMoviesList() {

		return sv.showAllMoviesList();
	}
	
	public Content[] sortByRating(){
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
	
	public void reName(String name) {
		sv.reName(name);
	}
	
	public void reAge(int age) {
		sv.reAge(age);
	}
	
	public void topup(int money) {
		sv.topup(money);
	}
}
