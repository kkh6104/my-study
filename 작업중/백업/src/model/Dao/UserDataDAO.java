package model.Dao;

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

public class UserDataDAO {

	
	
	public Map<String, User> loadUsers() throws NotFoundFileException, WrongDataException {

		Map<String, User> users = new HashMap<>(); 
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserData.txt"))) {
		Object rawData = ois.readObject();
			if (rawData instanceof Map) {
				users = (Map<String, User>)(rawData);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			throw new WrongDataException("UserData.txt 내용이 이상합니다.");
		}

		return users;

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