package ex3;

public class Quiz3 {

	public static void main(String[] args) {

		for(int i = 2 ; i < 10 ; i++) {
			System.out.printf("%d단\n", i);
			for (int j = 1 ; j <10 ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				if ( i <= j ) break;
			}
			System.out.println();
		
		}

	}
}