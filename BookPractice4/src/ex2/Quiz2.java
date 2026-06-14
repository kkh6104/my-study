package ex2;

public class Quiz2 {

	public static void main(String[] args) {

		for(int i = 2 ; i < 10 ; i++) {
			if (i % 2 != 0) continue;
			System.out.printf("%d단\n", i);
			for (int j = 1 ; j <10 ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
	}

}
