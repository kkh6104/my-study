package com.kh.pos.view;

import java.util.Scanner;

import com.kh.pos.controller.PosController;
import com.kh.pos.model.Customer;
import com.kh.pos.model.PaymentMethod;

public class PosMenu extends PosController{

	private PosController pc = new PosController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
	/*
	 * ==== 스마트 POS 단말기 메뉴 ====
		1. 마이페이지 (멤버십 정보)
		2. 전체 사용 가능 결제수단 조회
		3. 결제수단 검색
		4. 결제(구매)하기
		9. 시스템 종료
		메뉴 번호: 2	
	 */
	
		System.out.println("--- 자가 쇼핑 POS 등록 ---");
		System.out.print("고객 이름 입력: ");
		String name = sc.next();
		System.out.print("고객 나이 입력: ");
		int age = sc.nextInt();
		System.out.println("-------------------------");
		
		// sc.nextLine();  // 버퍼 비우기
		
		// => 입력 받은 정보를 Controller의 suctomer 필드에 저장
		pc.insertCustomer(new Customer(name, age));
		
		while(true) {
		System.out.println("==== 스마트 POS 단말기 메뉴 ====");
		System.out.println("1. 마이페이지 (멤버십 정보)");
		System.out.println("2. 전체 사용 가능 결제수단 조회");
		System.out.println("3. 결제수단 검색");
		System.out.println("4. 결제(구매)하기");
		System.out.println("9. 시스템 종료");
		System.out.print("메뉴 번호: ");
		
		int menu = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		
		switch(menu) {
		case 1: 
			// 마이페이지 -> 고객 정보 출력
			//   * 고객 정보는 Controller 의 getCustomerInfo() 통해 반환
			Customer customer = pc.getCustomerInfo();
			
//			System.out.println(customer.toString());
			System.out.println(customer/*.toString() */);
			break;
			
		case 2:
			// 전체 결제 수단 조회
			// * 결제 수단 정보는 Controller 에서 관리중임!
			printAllMethods();
			
			break;
			
		case 3:
			// 결제수단 검색
			searchMethods();
			break;
			
		case 4:
			// 결제하기
			checkout();
			break;
			
		case 9: 
			// 시스템 종료
			System.out.println("시스템을 종료하겠습니다.");
			return;   // 메소드 종료!  -> 호출된 위치로 돌아간다!
			
		default:
			System.out.print("존재하지 않는 메뉴입니다.");
			break;
		}
	}
	}
	
	public void printAllMethods() {
		PaymentMethod[] methods = pc.selectAllMethods();
		
		for(int i=0 ; i < methods.length; i++) {
			System.out.println("[" + i + "번] " + methods[i]);
		}
	}
	
	
	public void searchMethods() {
	
		System.out.print("검색할 결제 수단명 입력: ");
		String keyWord = sc.nextLine();
		
		PaymentMethod[] result = pc.searchMethod(keyWord);
		
		// 배열 탐색 전 : [ null, null, null, null ]
		// 검색 시 포함된 항목이 있으면 (1개) : [ 결제수단, null, null, null ]
		
		for(PaymentMethod method : result) {
			if(method != null) System.out.println(method);
		}
		
	}
	
	public void checkout() {
		while (true) {
		System.out.print("이용할 결제 수단 번호 선택: ");
		int index = sc.nextInt();
		
		if(!(index >=0 && index < pc.getPaymentListInfo().length)) {
			System.out.println("없는 수단입니다.");
			System.out.print("이용할 결제 수단 번호 선택: ");
			index = sc.nextInt();
		}
		
		int result = pc.processPayment(index);
		// result => 0 || 1 || 2
/*		if(result == 0) {
			System.out.println("[결과] 결제 성공!");
		} else if(result == 1) {
			System.out.println("[결과] 제한 연령 미달이거나, 모바일 페이 추가 보안 가이드(제한나이 +3세) 기준 미달로 승인이 거절되었습니다.");
		} else if(result == 2){
			System.out.println("[결과] 결제 성공! 캐시백 제휴 카드로 확인되어 멤버십 포인트 500점이 특별 적립되었습니다.");
		} else {
			System.out.println("[시스템 오류] 관리자에게 문의하세요.");
		} */
		
		switch(result) {
		case 0:
			System.out.println("[결과] 결제 성공!");
			return;
		case 1:
			System.out.println("[결과] 제한 연령 미달이거나, 모바일 페이 추가 보안 가이드(제한나이 +3세) 기준 미달로 승인이 거절되었습니다.");
			return;
		case 2:
			System.out.println("[결과] 결제 성공! 캐시백 제휴 카드로 확인되어 멤버십 포인트 500점이 특별 적립되었습니다.");
			return;
		default:
			System.out.println("[시스템 오류] 관리자에게 문의하세요.");
			return;
		}
	}
	}
	
}
