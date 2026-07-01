package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Controller;
import model.Content;
import view.exception.BlankException;
import view.exception.WrongCharacterException;

public class ConsoleView {

	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();

	public void mainMenu() {

		identificationMenu();

		int menu;

		while (true) {
			System.out.println();
			System.out.println("======= 땡 플 릭 스 ======");
			System.out.println("=".repeat(20));

			System.out.println("1. 컨텐츠 목록 보기");
			System.out.println("2. 예능 보기");
			System.out.println("3. 영화 보기");
			System.out.println("4. 다큐 보기");
			System.out.println("5. 회원 정보 확인 및 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("=".repeat(20));
			System.out.print("원하시는 메뉴의 번호를 입력하세요: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}

			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료합니다");
				return;
			case 1:
				showAllContentsList();
				break;
			case 2:
				entertainmentsMenu();
				break;
			case 3:
				movieMenu();
				break;
			case 4:
				docuMenu();
				break;
			case 5:
				userMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}

		}
	}

	public void identificationMenu() {

		char yn, ynUser, ynResister;
		String input = "";

		System.out.println("  *** 로그인 메뉴 ***  ");
		System.out.println("=".repeat(20));

		while (true) {
			System.out.print("회원이십니까?(y/n) : ");
			input = sc.nextLine();
			try {
				ynUser = (checkBlank(input)).charAt(0);
				ynYN(ynUser);
			} catch (BlankException | WrongCharacterException e) {
				System.out.println(e.getMessage());
				continue;
			}

			if (ynUser == 'n' || ynUser == 'N') {
				System.out.print("회원가입하시겠습니까? (y/n) : ");
				input = sc.nextLine();
				try {
					ynResister = (checkBlank(input)).charAt(0);
					ynYN(ynResister);
				} catch (BlankException | WrongCharacterException e) {
					System.out.println(e.getMessage());
					continue;
				}

				if (ynResister == 'n' || ynResister == 'N') {
					System.out.print("종료하시려면 y를 입력해주세요. 다른 입력은 회원 확인 질문으로 돌아갑니다. : ");
					input = sc.nextLine();
					try {
						yn = (checkBlank(input)).charAt(0);
					} catch (BlankException e) {
						System.out.println(e.getMessage());
						continue;
					}

					if (yn == 'y' || yn == 'Y') {
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					}
					continue;
				}

				if (ynResister == 'y' || ynResister == 'Y') {
					register();
					break;
				}

			}

			if (ynUser == 'y' || ynUser == 'Y') {

				System.out.println(logIn());
				return;
			}

		}
	}

	public void entertainmentsMenu() {
		int menu;
		while (true) {
			System.out.println();
			System.out.println("=== 예능 메뉴 ===");
			System.out.println("1. 예능 프로그램 목록 보기");
			System.out.println("2. 출연 연예인으로 검색 하기");
			System.out.println("3. 시청 하기");
			System.out.println("0. 돌아가기");
			System.out.println("============");
			System.out.print("원하시는 메뉴의 번호를 입력하세요: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}
			switch (menu) {
			case 0:
				return;
			case 1:
				showAllEntertainmentsList();
				break;
			case 2:
				searchByEntertainer();
				break;
			case 3:
				streaming(10000,20000,"예능");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}
	}

	public void movieMenu() {
		int menu;
		while (true) {
			System.out.println();
			System.out.println("=== 영화 메뉴 ===");
			System.out.println("1. 영화 목록 보기");
			System.out.println("2. 별점별 목록 정렬 하기");
			System.out.println("3. 시청 하기");
			System.out.println("0. 돌아가기");
			System.out.println("============");
			System.out.print("원하시는 메뉴의 번호를 입력하세요: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}

			switch (menu) {
			case 0:
				return;
			case 1:
				showAllMoviesList();
				break;
			case 2:
				sortByRating();
				break;
			case 3:
				streaming(20000,30000,"영화");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
		}

	}

	public void docuMenu() {
		int menu;
		while (true) {
			System.out.println();
			System.out.println("=== 다큐멘터리 메뉴 ===");
			System.out.println("1. 다큐멘터리 목록 보기");
			System.out.println("2. 종류별 목록 보기");
			System.out.println("3. 시청 하기");
			System.out.println("0. 돌아가기");
			System.out.println("============");
			System.out.print("원하시는 메뉴의 번호를 입력하세요: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}

			switch (menu) {
			case 0:
				return;
			case 1:
				showAllDocuList();
				break;
			case 2:
				sortByType();
				break;
			case 3:
				streaming(30000,40000,"다큐");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
		}

	}

	public void userMenu() {
		int menu;
		while (true) {
			System.out.println();
			System.out.println("=== 유저 메뉴 ===");
			System.out.println("1. 나의 정보 조회");
			System.out.println("2. 나의 정보 수정");
			System.out.println("3. 충전 하기");
			System.out.println("4. 탈퇴하기");
			System.out.println("0. 돌아가기");
			System.out.println("============");
			System.out.print("원하시는 메뉴의 번호를 입력하세요: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}

			switch (menu) {
			case 0:
				return;
			case 1:
				System.out.println(c.showMyInfo());
				break;
			case 2:
				editMyInfo();
				break;
			case 3:
				topup();
				break;
			case 4:
				deleteUser();
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
		}

	}

	public String logIn() {
		while (true) {
			System.out.print("회원 아이디를 입력해주세요: ");

			String UserID = sc.nextLine();
			String result = c.identify(UserID);
			if (result == null) {
				System.out.println("등록 되지 않은 아이디 입니다");
				continue;
			} else {
				return "환영합니다. " + result + "고객님";
			}
		}

	}

	public void register() {
		String userID, name;
		int age;
		while (true) {
			System.out.print("아이디를 입력해주세요: ");
			userID = sc.nextLine();
			try {
				userID = checkBlank(userID);
				if (c.identify(userID) != null) {
					System.out.println("이미 존재하는 아이디입니다.");
					continue;
				}
				break;
			} catch (BlankException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		while (true) {
			System.out.print("이름을 입력해주세요: ");
			name = sc.nextLine();
			try {
				name = checkBlank(name);
				break;
			} catch (BlankException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		while (true) {
			System.out.print("나이를 입력해주세요: ");
			try {
				age = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				continue;
			} finally {
				sc.nextLine();
			}
		}

		System.out.println(c.register(userID, name, age));

		System.out.println("등록이 완료되었습니다");

	}

	public void deleteUser() {
		while (true) {
			System.out.print("회원 정보가 사라집니다. 계속 진행하시겠습니까? (y/n)");
			String input = sc.nextLine();
			try {
				char yn = (checkBlank(input)).charAt(0);
				ynYN(yn);
				if (yn == 'y' || yn == 'Y') {
					break;
				} else {
					return;
				}
			} catch (BlankException | WrongCharacterException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		System.out.println(c.deleteUser() + " 님의 탈퇴 신청이 처리되었습니다.");
	}

	public String checkBlank(String str) throws BlankException {

		if (str.equals("")) {
			throw new BlankException("공백은 입력하실 수 없습니다");
		} else {
			return str;
		}

	}

	public void ynYN(char ch) throws WrongCharacterException {

		if (!(ch == 'y' || ch == 'n' || ch == 'Y' || ch == 'N')) {
			throw new WrongCharacterException("y나 n을 눌러주세요");
		}

	}

	public void showAllContentsList() {
		Content[] allContents = c.showAllContentsList();
		for (Content i : allContents) {
			System.out.println(i);
		}
	}

	public void showAllEntertainmentsList() {
		Content[] allEntertainments = c.showAllEntertainmentsList();
		for (Content i : allEntertainments) {
			System.out.println(i);
		}
	}

	public void searchByEntertainer() {
		String keyWord;
		while (true) {
			System.out.print("검색할 출연자 이름을 입력하세요: ");
			keyWord = sc.nextLine();
			try {
				checkBlank(keyWord);
				break;
			} catch (BlankException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		Content[] searchResult = c.searchByEntertainer(keyWord);
		for (Content i : searchResult) {
			System.out.println(i);
		}
	}

	public void streaming(int min, int max, String type) {
		String contentID;
		while (true) {
			System.out.println("====================");
			System.out.print("보려는 컨텐츠의 번호를 입력해주세요: ");
			System.out.println("====================");
			contentID = sc.nextLine();
			try {
				checkBlank(contentID);
			} catch (BlankException e) {
				System.out.println(e.getMessage());
				return;
			}
			try {
			if(!(min <= Integer.parseInt(contentID) && max > Integer.parseInt(contentID) )) {
				System.out.printf("%s 컨텐츠 번호는 %d이상 %d미만입니다.\n",type,min,max);
				return;
			}
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				return;
			}
			System.out.println(c.streaming(contentID));
			break;

		}
	}

	public void showAllMoviesList() {
		Content[] allMovies = c.showAllMoviesList();
		for (Content i : allMovies) {
			System.out.println(i);
		}
	}

	public void sortByRating() {
		for (Content i : c.sortByRating()) {
			System.out.println(i);
		}
	}

	public int takeMenu() {
		try {
			int menu = sc.nextInt();
			return menu;
		} catch (InputMismatchException e) {

			return -1;
		} finally {
			sc.nextLine();
		}
	}

	public void showAllDocuList() {
		Content[] allDocus = c.showAllDocuList();
		for (Content i : allDocus) {
			System.out.println(i);
		}
	}

	public void sortByType() {
		int menu;
		while (true) {
			System.out.print("원하는 분류를 입력해주세요. 1. 동물 2. 인류학 3. 과학 0.돌아가기: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}

			switch (menu) {
			case 1:
				animalDocu();
				return;
			case 2:
				humanitiesDocu();
				return;
			case 3:
				scienceDocu();
				return;
			case 0:
				return;
			default:
				System.out.println("잘못 입력하셨습니다");
				continue;

			}
		}

	}

	public void animalDocu() {
		Content[] animalDocus = c.animalDocu();
		for (Content i : animalDocus) {
			System.out.println(i);
		}

	}

	public void humanitiesDocu() {
		Content[] humanitiesDocus = c.humanitiesDocu();
		for (Content i : humanitiesDocus) {
			System.out.println(i);
		}

	}

	public void scienceDocu() {
		Content[] scienceDocus = c.scienceDocu();
		for (Content i : scienceDocus) {
			System.out.println(i);
		}

	}

	public void editMyInfo() {

		int menu;

		while (true) {
			System.out.print("수정을 원하시는 항목을 선택해주세요. 1. 이름 2. 나이 0. 돌아가기: ");

			menu = takeMenu();
			if (menu == -1) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}

			switch (menu) {
			case 0:
				return;
			case 1:
				String name;
				while (true) {
					System.out.print("수정하실 이름을 입력해주세요: ");
					name = sc.nextLine();
					try {
						name = checkBlank(name);
						break;
					} catch (BlankException e) {
						System.out.println(e.getMessage());
						continue;
					}
				}

				System.out.println("회원님의 이름이 " + c.reName(name) + "로 수정되었습니다.");
				break;
			case 2:
				int age;
				while (true) {
					System.out.print("수정하실 나이를 입력해주세요: ");
					try {
						age = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력해주세요.");
						continue;
					} finally {
						sc.nextLine();
					}
				}

				System.out.println("회원님의 나이가 " + c.reAge(age) + "로 수정되었습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

		}
	}

	public void topup() {
		int money;
		System.out.println("현재 잔액은 " + c.getBalance() + "원 입니다.");
		while (true) {
			System.out.print("충전하실 금액을 입력해주세요: ");
			try {
				money = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}

		}

		String result = c.topup(money);
		if (result == null) {
			System.out.println("0원 이하는 충전하실 수 없습니다.");
		} else {
			System.out.println(money + "원 충전되었습니다. 현재 잔액은 " + result + "원 입니다.");
		}

	}

}
