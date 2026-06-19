package classpractice;

public class Computer {

	public String[] osType = {"원도7", "애플 OS X", "안드로이드"};
	int index;
	int memmory;
	
	public Computer(int index, int memmory) {
		this.index = index;
		this.memmory = memmory;
	}
	
	public void print() {
		System.out.println("운영체제: " + osType[index] + ", 메인 메모리: " + memmory);
	}
	
}
