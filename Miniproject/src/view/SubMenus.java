package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Controller;
import model.Content;
import model.exception.AgeLimitException;
import model.exception.LackOfBalanceException;
import view.exception.BlankException;
import view.exception.WrongCharacterException;

public class SubMenus {

	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();

	public void identificationMenu() {

		char yn, ynUser, ynResister;
		String name = "", input = "";
		int age = 0;
		int inputUserID = 0;

		System.out.println("식별 메뉴 시작");
		System.out.println("=".repeat(15));
		
		while (true) {
			System.out.print("회원이십니까?(y/n) : ");
			input = sc.nextLine();
			try {
				ynUser = (checkBlank(input)).charAt(0);
				ynYN(ynUser);
			} catch (BlankException | WrongCharacterException e) {
				continue;
			}

			if (ynUser == 'n' || ynUser == 'N') {
				System.out.print("회원가입하시겠습니까?(y/n) : ");
				input = sc.nextLine();
				try {
					ynResister = (checkBlank(input)).charAt(0);
					ynYN(ynResister);
				} catch (BlankException | WrongCharacterException e) {
					continue;
				}

				if (ynResister == 'n' || ynResister == 'N') {
					System.out.print("종료하시려면 y를 입력해주세요. 다른 입력은 회원 확인 질문으로 돌아갑니다. : ");
					input = sc.nextLine();
					try {
						yn = (checkBlank(input)).charAt(0);
					} catch (BlankException e) {
						continue;
					}

					if (yn == 'y' || yn == 'Y')
						return;

					continue;
				}

				if (ynResister == 'y' || ynResister == 'Y') {
					while (true) {
						System.out.print("이름을 입력해주세요 : ");
						name = sc.nextLine();
						try {
							name = checkBlank(name);
							break;
						} catch (BlankException e) {
							continue;
						}
					}
					while (true) {
						System.out.print("나이를 입력해주세요 : ");
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

					c.register(name, age);

					System.out.println("회원님의 회원 아이디는 " + c.getUserID() + "입니다.");

					System.out.println("등록이 완료되었습니다.");

					break;
				}

			}

			if (ynUser == 'y' || ynUser == 'Y') {
				while (true) {
					System.out.print("회원 아이디를 입력해주세요. : ");
					try {
						inputUserID = sc.nextInt();
						c.identify(inputUserID);
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자로 된 아이디를 입력해주세요.");
						continue;
					} catch (NullPointerException e) {
						System.out.println("없는 회원 아이디 입니다.");
						continue;
					} finally {
						sc.nextLine();
					}

				}
				
				break;
			}

		}
	}
	
	public void printMainMenu() {
		System.out.println("메인 메뉴 시작");
		System.out.println("=".repeat(15));

		System.out.println("1. 모든 컨텐츠 보기");
		System.out.println("2. 예능 보기");
		System.out.println("3. 영화 보기");
		System.out.println("4. 다큐 보기");
		System.out.println("5. 회원 정보 확인 및 수정");
		System.out.println("0. 프로그램 종료");
		System.out.println("=".repeat(15));
	}
 
	public String checkBlank(String str) throws BlankException {

		if (str.equals("")) {
			throw new BlankException("공백은 입력하실 수 없습니다.");
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

	public void entertainmentsMenu() {
		int menu;
		while (true) {
			System.out.println("=== 예능 메뉴 ===");
			System.out.println("1. 예능 프로그램 목록 보기");
			System.out.println("2. 출연 연예인으로 검색 하기");
			System.out.println("3. 시청 하기");
			System.out.println("0. 전 메뉴로 돌아가기");
			System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
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
				streaming();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
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
			System.out.print("검색할 출연자 이름을 입력하세요 : ");
			keyWord = sc.nextLine();
			try {
				checkBlank(keyWord);
				break;
			} catch (BlankException e) {
				continue;
			}
		}
		Content[] searchResult = c.searchByEntertainer(keyWord);
		for (Content i : searchResult) {
			System.out.println(i);
		}
	}

	public void streaming() {
		String inputContetID;
		while (true) {
			System.out.print("보려는 컨텐츠의 번호를 입력해주세요 : ");
			inputContetID = sc.nextLine();
			try {
				checkBlank(inputContetID);
			} catch (BlankException e) {
				continue;
			}

			try {
				System.out.println(c.streaming(inputContetID) + "를 재생합니다.");
				return;
			} catch (LackOfBalanceException | AgeLimitException e) {
				break;
			}

		}
	}

	public void movieMenu() {
		int menu;
		while (true) {
			System.out.println("=== 영화 메뉴 ===");
			System.out.println("1. 영화 목록 보기");
			System.out.println("2. 별점별 목록 정렬 하기");
			System.out.println("3. 시청 하기");
			System.out.println("0. 전 메뉴로 돌아가기");
			System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
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
				streaming();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
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

	public void docuMenu() {
		int menu;
		while (true) {
			System.out.println("=== 다큐멘터리 메뉴 ===");
			System.out.println("1. 다큐멘터리 목록 보기");
			System.out.println("2. 종류별 목록 보기");
			System.out.println("3. 시청 하기");
			System.out.println("0. 전 메뉴로 돌아가기");
			System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
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
				streaming();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
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
			System.out.print("원하는 분류를 입력해주세요. 1. 동물 2. 인류학 3. 과학 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}

			switch (menu) {
			case 1:
				animalDocu();
				break;
			case 2:
				humanitiesDocu();
				break;
			case 3:
				scienceDocu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
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

	public void userMenu() {
		int menu;
		while (true) {
			System.out.println("=== 유저 메뉴 ===");
			System.out.println("1. 나의 정보 조회");
			System.out.println("2. 나의 정보 수정");
			System.out.println("3. 충전 하기");
			System.out.println("0. 전 메뉴로 돌아가기");
			System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
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
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}

	}

	public void editMyInfo() {

		int menu;

		while (true) {
			System.out.print("수정을 원하시는 항목을 선택해주세요. 1. 이름 2. 나이 0. 전 메뉴로 돌아가기 : ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}

			switch (menu) {
			case 0:
				return;
			case 1:
				String name;
				while (true) {
					System.out.print("수정하실 이름을 입력해주세요 : ");
					name = sc.nextLine();
					try {
						name = checkBlank(name);
						break;
					} catch (BlankException e) {
						continue;
					}
				}
				c.reName(name);
				System.out.println("이름이 수정되었습니다.");
				break;
			case 2:
				int age;
				while (true) {
					System.out.print("수정하실 나이를 입력해주세요 : ");
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
				c.reAge(age);
				System.out.println("나이가 수정되었습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

		}
	}
	
	public void topup() {
		int money;
		while (true) {
			System.out.print("충전하실 금액을 입력해주세요 : ");
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
		c.topup(money);
		System.out.println("충전 되었습니다.");
		
	}

}
