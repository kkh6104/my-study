package methodoverridingpr;

public class Run {

	public static void main(String[] args) {
		Hero[] party = new Hero[2];
		
		party[0] = new Warrior(100);
		party[1] = new Wizard(50);
		
		for(Hero i : party) {
			i.attack();
		}
		
		
		
	}

}
