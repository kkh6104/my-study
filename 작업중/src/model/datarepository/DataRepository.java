package model.datarepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import model.AnimalDocu;
import model.Content;
import model.Documentary;
import model.Entertainment;
import model.HumanitiesDocu;
import model.Movie;
import model.ScienceDocu;
import model.User;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import model.exception.NotFoundContentsException;
import model.exception.NotFoundFileException;
import model.exception.NotIdentifiedException;
import model.exception.WrongDataException;
import model.interfaces.Animal;
import model.interfaces.Humanities;
import model.interfaces.Science;

public class DataRepository {

	private Map<String, User> users;
	private Content[] contents;

	public DataRepository() throws NotFoundFileException, WrongDataException {
		this.users = loadUsers();
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


	public Content[] showAllContentsList() {

		return contents;
	}

	

	public void reName(String name) {
		currentUser.setName(name);
		users.put(this.userID, currentUser);
		uploadUsers(users);
	}

	public void reAge(int age) {
		currentUser.setAge(age);
		users.put(this.userID, currentUser);
		uploadUsers(users);
	}

	public void topup(int money) {
		currentUser.setBalance(currentUser.getBalance() + money);
		users.put(this.userID, currentUser);
		uploadUsers(users);
	}

	public void register(String id, String name, int age, int balance) {
		this.userID = id;
		this.currentUser = new User(name, age, balance);
		users.put(id, currentUser);
		uploadUsers(users);
	}

	public User identify(String inputUserID) {

		if (users.containsKey(inputUserID)) {
			currentUser = users.get(inputUserID);
			return currentUser;
		} else {
			return null;
		}
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

	public Map<String, User> loadUsers() throws NotFoundFileException, WrongDataException {

		Map<String, User> users = new HashMap<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserData.txt"))) {
			Object rawData = ois.readObject();
			if (rawData instanceof Map) {
				users = (Map<String, User>) (rawData);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			throw new WrongDataException("UserData.txt 내용이 이상합니다.");
		}

		return users;

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

	public void uploadUsers(Map<String, User> users) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserData.txt"))) {

			oos.writeObject(users);
			oos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
