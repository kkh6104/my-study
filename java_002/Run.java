package classpractice;

public class Run {

	public static void main(String[] args) {
		
		//https://iu-corner.tistory.com/entry/JAVA-자바-클래스-연습-문제-모음-1#google_vignette 참조
		
		
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);

		
		System.out.println("-------Computer 클래스---------");
		
		pc.print();
		apple.print();
		galaxy.print();
		
		System.out.println();
		System.out.println("-------Rectangle 클래스---------");
		
		Rectangle rc = new Rectangle(3.82, 8.65);

		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
		
		
	}

}
