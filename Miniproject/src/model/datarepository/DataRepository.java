package model.datarepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import model.Content;
import model.Documentary;
import model.Entertainment;
import model.Movie;
import model.User;
import model.Documentary.Animal;
import model.Documentary.Humanities;
import model.Documentary.Science;
import model.exception.WrongDataException;

public class DataRepository {

	private Map<String, User> users;
	private Content[] contents;

	public DataRepository() {
		this.users = loadUsers();
		this.contents = new Content[9];
		this.contents[0] = new Entertainment("알던 형님", "10001", 1500, 15, "유호동, 서수근, 이장훈");
		this.contents[1] = new Entertainment("놀면 뭐혀", "10002", 1000, 12, "강재석, 허우재, 주경환");
		this.contents[2] = new Entertainment("냉장고를 맡겨줘", "10003", 2000, 9, "최성주, 김정환, 안현석");
		this.contents[3] = new Movie("009 Secerit Mission", "20001", 11000, 15, 4.1);
		this.contents[4] = new Movie("Mission Is Passable", "20002", 10000, 18, 4.4);
		this.contents[5] = new Movie("드라큘라와 무한섬", "20003", 12000, 19, 4.8);
		this.contents[6] = new Documentary.AnimalDocu("침팬지의 일생", "30001", 1200, 12);
		this.contents[7] = new Documentary.HumanitiesDocu("벌거벗은 역사", "30002", 3000, 15);
		this.contents[8] = new Documentary.ScienceDocu("우주의 비밀", "30003", 700, 9);
	}

	public void reNewal(String userID, User currentUser) {
		users.put(userID, currentUser);
		uploadUsers(users);
	}

	public void deleteUser(String userID, User currentUser) {
		users.remove(userID);
		uploadUsers(users);
	}

	public User identify(String inputUserID) {

		if (users.containsKey(inputUserID)) {
			return users.get(inputUserID);
		} else {
			return null;
		}
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

	public Map<String, User> loadUsers() {
		File file = new File("UserData.txt");
		if (!file.exists()) {
			Map<String, User> emptyMap = new HashMap<>();
			uploadUsers(emptyMap);
			return emptyMap;

		} else {
			Map<String, User> users = new HashMap<>();

			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserData.txt"))) {
				Object rawData = ois.readObject();
				if (rawData instanceof Map) {
					users = (Map<String, User>) (rawData);
				} else {
					throw new WrongDataException("UserData.txt 내용이 이상합니다.");
				}

			} catch (IOException | ClassNotFoundException e) {
				throw new WrongDataException("UserData.txt 내용이 이상합니다.");
			}

			return users;
		}
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
