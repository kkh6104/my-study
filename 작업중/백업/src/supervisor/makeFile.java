package supervisor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import model.User;
import model.exception.NotFoundFileException;
import model.exception.WrongDataException;

public class makeFile {

	public static void main(String[] args) {

		Map<String, User> users = new HashMap<>();
		User currentUser = new User("권경환",39,5000);
		users.put("aaa", currentUser);
		currentUser = new User("홍길동",25,3000);
		users.put("bbb", currentUser);
		currentUser = new User("어린이",8,600);
		users.put("ccc", currentUser);
		currentUser = new User("중학생",14,3000);
		users.put("ddd", currentUser);
		
		uploadUsers(users);
		System.out.println("파일 작성이 완료되었습니다.");
		
		users = null;
		
		users = loadUsers();
		System.out.println(users.get("ddd").getName());
		
	}

	public static Map<String, User> loadUsers()  {

		Map<String, User> users = new HashMap<>(); 
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserData.txt"))) {
		Object rawData = ois.readObject();
			if (rawData instanceof Map) {
				users = (Map<String, User>)(rawData);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return users;

	}

	

	public static void uploadUsers(Map<String, User> users) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserData.txt"))) {

			oos.writeObject(users);
			oos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
