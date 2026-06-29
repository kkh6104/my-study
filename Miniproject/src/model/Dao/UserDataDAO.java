package model.Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.exception.NotIdentifiedException;

public class UserDataDAO {

	public int loadMemberCount() {

		int memberCount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("MemberCount.txt"))) {

			String str = br.readLine();
			memberCount = Integer.parseInt(str);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return memberCount;

	}

	public void increase1MemberCount() {

		int memberCount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("MemberCount.txt"))) {

			String str = br.readLine();
			memberCount = Integer.parseInt(str);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("MemberCount.txt"))) {

			bw.write(String.valueOf(++memberCount));
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void register(int userID, String name, int age, int balance) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("UserData.txt", true))) {

			bw.write(String.format("%d,%s,%d,%d", userID, name, age, balance));
			bw.flush();
			bw.newLine();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String identify(int inputID) throws NotIdentifiedException {

		String[] temp;
		String rawData = "";

		try (BufferedReader br = new BufferedReader(new FileReader("UserData.txt"))) {
			while (true) {

				rawData = br.readLine();
				if (rawData == null) {
					throw new NotIdentifiedException("없는 회원 번호이거나 잘못입력하셨습니다.");
				}
				temp = (rawData).split(",");
				if (Integer.parseInt(temp[0]) == inputID) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rawData;
	}

	public void saveUserData(int userID, String name, int age, int balance) {

		String[] temp;
		int count = 0;
		String rawData = "";

		try (BufferedReader br = new BufferedReader(new FileReader("UserData.txt"))) {
			while (true) {
				rawData = br.readLine();
				if (rawData == null)
					break;
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		temp = new String[count];
		count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("UserData.txt"))) {
			while (true) {
				rawData = br.readLine();
				if (rawData == null)
					break;
				if (rawData.contains(name)) {
					rawData = String.format("%d,%s,%d,%d", userID, name, age, balance);
				}
				temp[count++] = rawData;

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("UserData.txt"));) {

			for (int i = 0; i < temp.length; i++) {
				bw.write(temp[i] + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}