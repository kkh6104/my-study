package model.datarepository;

import model.AnimalDocu;
import model.Content;
import model.Documentary;
import model.Entertainment;
import model.HumanitiesDocu;
import model.Movie;
import model.ScienceDocu;
import model.User;
import model.Dao.UserDataDAO;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.interfaces.Animal;
import model.interfaces.Humanities;
import model.interfaces.Science;

public class DataRepository {

	User currentUser = new User();
	UserDataDAO udd = new UserDataDAO();
	
	private Content[] contents;
	private int memberCount;

	public DataRepository() {
		this.contents = new Content[9];
		this.contents[0] = new Entertainment("알던 형님", "10001", 1500, 15, "유호동, 서수근, 이장훈");
		this.contents[1] = new Entertainment("놀면 뭐혀", "10002", 1000, 12, "강재석, 허우재, 주경환");
		this.contents[2] = new Entertainment("냉장고를 맡겨줘", "10003", 2000, 9, "최성주, 김정환, 안현석");
		this.contents[3] = new Movie("009 Secerit Mission", "20001", 11000, 15, 4.1);
		this.contents[4] = new Movie("Mission Is Passable", "20002", 10000, 18, 4.4);
		this.contents[5] = new Movie("드라큘라와 무한섬", "20003", 12000, 19, 4.8);
		this.contents[6] = new AnimalDocu("침팬지의 일생", "30001", 1200, 12);
		this.contents[7] = new HumanitiesDocu("벌거벗은 역사", "30002", 3000, 15);
		this.contents[8] = new ScienceDocu("우주의 비밀", "30003", 700, 9);
	}

	public void register(String name, int age) {
		memberCount = udd.loadMemberCount();
		currentUser.setUserID(memberCount + 1);
		udd.increase1MemberCount();
		
		currentUser.setName(name);
		currentUser.setAge(age);
		currentUser.setBalance(0);
		udd.register(currentUser.getUserID(), currentUser.getName(), currentUser.getAge(), currentUser.getBalance());
		
	}
	
	public User identify(int inputUserID)  throws NullPointerException {
		
		String rawData = udd.identify(inputUserID);
		String[] temp = rawData.split(",");
					
		currentUser.setUserID(Integer.parseInt(temp[0]));
		currentUser.setName(temp[1]) ;
		currentUser.setAge(Integer.parseInt(temp[2]));
		currentUser.setBalance(Integer.parseInt(temp[3]));
		
		return currentUser;
		
	}
	

	public int getUserID() {

		return currentUser.getUserID();
	}
	
	public String getName() {
		return currentUser.getName();
	}
	
	public int getAge() {
		return currentUser.getAge();
	}
	
	public int getBalance() {
		return currentUser.getBalance();
	}

	public Content[] showAllContentsList() {

		return contents;
	}

	public Content[] showAllEntertainmentsList() {

		int count = 0;

		for (Content i : contents) {
			if (i instanceof Entertainment)
				count++;
		}

		Content[] entertainmentContents = new Content[count];

		count = 0;
		for (Content i : contents) {
			if (i instanceof Entertainment) {
				entertainmentContents[count++] = i;
			}
		}

		return entertainmentContents;
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

	public String streaming(String inputContetID) throws LackOfBalanceException, AgeLimitException {

		Content selectedOne = null;
		for (Content i : contents) {
			if ((i.getContentID()).equals(inputContetID))
				selectedOne = i;
		}

		if (selectedOne.getPrice() > currentUser.getBalance()) {
			throw new LackOfBalanceException("잔액이 부족합니다.");
		}

		if (selectedOne.getAgeLimit() > currentUser.getAge()) {
			throw new AgeLimitException("연령 제한보다 어립니다.");
		}

		return selectedOne.getTitle();

	}

	public Content[] showAllMoviesList() {

		int count = 0;

		for (Content i : contents) {
			if (i instanceof Movie)
				count++;
		}

		Content[] movieContents = new Content[count];

		count = 0;
		for (Content i : contents) {
			if (i instanceof Movie) {
				movieContents[count++] = i;
			}
		}

		return movieContents;
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

	public Content[] showAllDocuList() {

		int count = 0;

		for (Content i : contents) {
			if (i instanceof Documentary)
				count++;
		}

		Content[] docuContents = new Content[count];

		count = 0;
		for (Content i : contents) {
			if (i instanceof Documentary) {
				docuContents[count++] = i;
			}
		}

		return docuContents;
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
	
	public String showMyInfo() {
		return String.format("회원ID : %s, 이름 : %s, 나이 : %d, 잔액 : %d"
						,currentUser.getUserID(),  currentUser.getName()
						,currentUser.getAge(), currentUser.getBalance());
		
	}
	
	public void saveUserData() {
		udd.saveUserData(currentUser.getUserID(),currentUser.getName(),currentUser.getAge(),currentUser.getBalance());
	}
	
	public void reName(String name) {
		currentUser.setName(name);
		saveUserData();
	}
	
	public void reAge(int age) {
		currentUser.setAge(age);
		saveUserData();
	}
	
	public void topup(int money) {
		currentUser.setBalance(currentUser.getBalance() + money);
		saveUserData();
	}
	
	

}
