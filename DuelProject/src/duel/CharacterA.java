package duel;

public class CharacterA implements Dueler {

	private int hp;
	
	public CharacterA() {
		setStartingHP(100);
	}

	static int tauntRandom = 0;
	public void taunt() {
		String arrayTaunts[] = {"You can't beat me!","You are going to lose!", "You sure you want to do that next?"};
		System.out.println(arrayTaunts[tauntRandom]);
		tauntRandom++;
		if(tauntRandom > 2)
			tauntRandom = 0;
		
	}

	public String getName() {
		return "Jessi";
	}

	static boolean hasHPBeenSet = false;
	public void setStartingHP(int hp) {
		if(hasHPBeenSet == false)
			this.hp = hp;
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

	static boolean Loaded = false;
	public int getAction(Object caller) {
		if(!(caller instanceof Duel) ) {
			return 3;
		}else{
			if(!Loaded)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
	
	public void hit(Object caller) {
		if(caller instanceof Duel)
			hp = hp - 10;
	}
	
}