package duel;

public class CharacterB implements Dueler {

	private int hp;
	
	public CharacterB() {
		setStartingHP(100);
	}
	
	public String getName() {
		return "Mimi";
	}

	static int generateRandomTaunt = 0;
	public void taunt() {
		String arrayTaunts[] = {"I H8 U LOL","Here I come!", "Show me your moves!"};
		System.out.println(arrayTaunts[generateRandomTaunt]);
		generateRandomTaunt++;
		if(generateRandomTaunt > 2)
			generateRandomTaunt = 0;
	}

	public void setStartingHP(int hp) {
		this.hp = hp;
	}

	public int getHP() {
		return hp;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(hp <= 100)
			return true;
		else
			return false;
	}

	static boolean Loaded = false;
	public int getAction(Object caller) {
		if(!(caller instanceof Duel) )
			return 3;
		else{
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
		if(caller instanceof Duel) {
			hp -= 10;
		}
	}
	
}
