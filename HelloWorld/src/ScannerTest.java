// scanner 등록(위치 지정)
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// scanner 사용 준비
		Scanner sc = new Scanner(System.in);
		
		// 화면에 안내 메시지 표시
		System.out.print("아무거나 입력 : ");
		
		// 키보드로 입력받기
		String data = sc.nextLine();
		
		// 입력 받은 값 출력
		System.out.print(data);
		
		// scanner 사용 완료 선언
		sc.close();
		
	}
	
}
