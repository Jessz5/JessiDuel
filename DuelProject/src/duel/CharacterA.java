package duel;

public class CharacterA implements Dueler {

	private int hp;
	
	public CharacterA() {

	}

	static int tauntRandom = 0;
	public void taunt() {
		String arrayTaunts[] = {"You can't beat me!","You are going to lose!", "You sure you want to do that next?"};
		System.out.println(arrayTaunts[tauntRandom]);
		
	}

	public String getName() {
		return "Jessi";
	}

	static boolean hasHPBeenSet = false;
	public void setStartingHP(int hp) {
		if(hasHPBeenSet == false)
			hp = 100;
		hasHPBeenSet = true;
	}

	public int getHP() {
		return hp;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(hp <= 100)
			return true;
		return false;
	}

	public int getAction(Object caller) {
		return (int) ((Math.random() * 3));
	}

	public void hit(Object caller) {
		if(obj instanceof Duel)
			hp = hp - 10;
	}
	
}