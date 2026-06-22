package methodoverridingpr;

public class Hero {
	private int Hp;
	
	public Hero(int Hp) {
		this.Hp = Hp;
	}
	
	public void attack() {
		System.out.print("기본 공격!");
	}
}
