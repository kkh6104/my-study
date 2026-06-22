package methodoverridingpr;

public class Wizard extends Hero{


	
	public Wizard(int Hp) {
		super(Hp);
	}

	@Override
	public void attack() {
		System.out.println("파이어볼!");
	}


}
