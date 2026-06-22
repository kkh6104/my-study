
public class Run {

	public static void main(String[] args) {
		// * CreditCardPay 클래스 객체 생성
		CreditCardPay card = new CreditCardPay("카드 결제",10000,"123-123-123", 0);
		// => 정적 바인딩 : 참조 타입과 인스턴스(객체) 타입이 일치함 (둘다 CreditCardPay)
		//	물려 받은 멤버(부모 클래스의 정의된 멤버), 내가 정의한 멤버(자식 클래스의 멤버) 모두 접근 가능
		
		card.processPay();		// 자식 클래스(CreditCardPay)에 정의된 멤버
		card.getPayAmount();   // 부모 클래스(PaymentMethod)에 정의된 멤버 
		card.getCardNumber();  // 자식 클래스에만 정의된 멤버
		
		// * 부모 타입 참조변수에 자식 객체를 대입
		// - 부모타입 : PaymentMethod
		// - 자식타입 : CreditCardPay, PointPay
		
		PaymentMethod pm1 = new CreditCardPay();
		PaymentMethod pm2 = new PointPay(); 
	
		// => 업캐스팅 : 클래스 간 형변환. 자식 객체가 부모 타입으로 클래스형 변환!
		// 가능한 이유? 상속 관계이기 때문에
		// [1] 자바에서 상속 관계는 'IS-A 관계'를 성립시킨다.
		// [2] 자식 인스턴스(객체)는 힙 메모리에 생성 시 부모의 멤버 공간을 항상 내포하고 있다.
		// [3] 따라서, 컴파일러는 부모 타입의 참조변수로 자식 인스턴스를 가리키는 것을 '타입 안전'하다고 판단한다.
		// [4] 이 변환은 형변환 연산자를 생략할 수 있는 '자동 형변환'으로 처리된다.
		
		pm1.processPay();   // 컴파일러는 해당 메소드가 PaymentMethod 클래스에 존재하기 때문에 문제가 없는 것으로 판단함!
		// => 동적 바인딩
		//   : 컴파일 단계에서는 참조 타입의 메소드와 연결(정적 바인딩)되지만,
		// 		실행 단계에서는 실제 힙 영역에 있는 인스턴스의 오버라이딩 규격을 확인하고,
		//		부모의 메소드가 아닌 자식의 오버라이딩된 메소드가 최종 호출되는 것.
		
		((CreditCardPay)pm1).getCardNumber(); // => 컴파일 오류 발생! 실제 힙 메모리에는 생성되지만, 참조변수(pm1)는 알 수 없으므로 오류 발생!!
		// TODO : 위 오류 해결하여 이메일 제출! 6/22 23:59 까지!
		
		//----------------------------------------
		// * 부모 타입의 객체 배열 선언. 자식 객체들로 구성.
		
		// - 배열 생성 : PaymentMethod 크기가 3인 배열
		
		PaymentMethod[] arr = new PaymentMethod[3];
		// [ null, null, null ]
		
		// -> [카드 결제 방식, 포인트 결제 방식, 카드 결제 방식 ]
		
		arr[0] = new CreditCardPay();
		// PaymentMethod p1 = new CreditCardPay();
		arr[1] = new PointPay();
		arr[2] = new CreditCardPay();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].processPay();
			// => arr[i] : PaymentMethod 타입의 참조변수
			// .processPay() : 각 자식 타입에서 재정의된 메소드 냉ㅇ이 실행 (동적 바인딩)
		}
		
		// * 다운캐스팅 : 업캐스팅으로 인해 제한된 자식 고유의 기능을 사용하기 위해, 자식 타입으로 강제로 형변환하는 것.
		// => 자식 타입으로의 변환은 힙 메모리에 해당 영역이 존재하는 지 컴파일러가 확신할 수 없으므로,
		//    반드시 명시적 형변환(강제 형변환)을 통해 처리해야한다. -> 형변환 연산자: (자식클래스명)참조변수
		
		// !! 주의 !! 잘못된 타입으로 강제 변환 시 ClassCastException 오류가 발생하므로 
		//			instanceof 연산자로 실제 객체 타입을 검증한 후 안전하게 다운 캐스트 할 수 있다.
		
		// 카드 결제 방식 => 카드 번호 출력
		// 포인트 결제 방식 => 포인트 점수 출력
		for(int i =0; i<arr.length;i++) {
			
			// 참조변수 instanceof 확인할타입(자식클래스명) : boolean
			// => true: 생성된 객체가 해당 타입으로 생성되어 있음!
			//    false: 생성된 객체가 해당 타입이 아니다!
			if (arr[i] instanceof CreditCardPay) {
				String cardNumber = ((CreditCardPay)arr[i]).getCardNumber();
				System.out.println("카드 번호는 ... " + cardNumber);
			} else if (arr[i] instanceof PointPay) {
				int point = ((PointPay)arr[i]).getMyPoint();
				System.out.println("포인트 점수는 ... " + point);
				
			}
		}
	}

}
