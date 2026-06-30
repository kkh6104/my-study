package service;

import model.Content;
import model.Documentary;
import model.Entertainment;
import model.Movie;
import model.User;
import model.datarepository.DataRepository;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.exception.NotFoundContentsException;
import model.exception.NotIdentifiedException;
import model.interfaces.Animal;
import model.interfaces.Humanities;
import model.interfaces.Science;

public class Service {
	
	DataRepository dr = new DataRepository();

	public void register(String id, String name, int age) {
		dr.register(id, name, age, 0);
		
	}
	
	public String identify(String inputUserID)  throws NotIdentifiedException {
		User currentUser = dr.identify(inputUserID);
		
		if(currentUser == null) {
			throw new NotIdentifiedException("등록하지 않은 아이디 입니다.");
		} else {
			return currentUser.getName();
		}
		
		
	}
	

	public Content[] searchByEntertainer(String keyWord) {

		Content[] entertainmentContents = showAllEntertainmentsList();
		int count = 0;
		for (Content i : entertainmentContents) {
			if ((((Entertainment) i).getEntertainers()).contains(keyWord))
				count++;
		}

		Content[] searchResult = new Content[count];
		count = 0;
		for (Content i : entertainmentContents) {
			if ((((Entertainment) i).getEntertainers()).contains(keyWord)) {
				searchResult[count++] = i;
			}
		}
		return searchResult;
	}

	public String streaming(String inputContetID) throws LackOfBalanceException, AgeLimitException, NotFoundContentsException {

		Content selectedOne = null;
		for (Content i : contents) {
			if ((i.getContentID()).equals(inputContetID)) selectedOne = i;
			
			}
		if (selectedOne == null) throw new NotFoundContentsException("컨텐츠 번호를 잘못 입력하셨습니다."); 
		

		if (selectedOne.getPrice() > currentUser.getBalance()) {
			throw new LackOfBalanceException("잔액이 부족합니다.");
		}

		if (selectedOne.getAgeLimit() > currentUser.getAge()) {
			throw new AgeLimitException("연령 제한보다 어립니다.");
		}

		return selectedOne.getTitle() + "를 재생하겠습니다.";

	}

	

	public Content[] sortByRating() {
		Content[] movieContents = showAllMoviesList();
		Content temp;

		for (int i = 0; i < movieContents.length; i++) {
			for (int j = 0; j < movieContents.length - 1; j++) {
				if (((Movie) movieContents[j]).getRating() < ((Movie) movieContents[j + 1]).getRating()) {
					temp = movieContents[j + 1];
					movieContents[j + 1] = movieContents[j];
					movieContents[j] = temp;
				}
			}
		}

		return movieContents;

	}



	public Content[] animalDocu() {

		int count = 0;

		Content[] docuContents = showAllDocuList();
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

		Content[] docuContents = showAllDocuList();
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

		Content[] docuContents = showAllDocuList();
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
	
	
}
