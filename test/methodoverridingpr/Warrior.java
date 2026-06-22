package methodoverridingpr;

public class Warrior extends Hero{


	
	public Warrior(int Hp) {
		super(Hp);
	}

	@Override
	public void attack() {
		System.out.println("베기 공격!");
	}


}
