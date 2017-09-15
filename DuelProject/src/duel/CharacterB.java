package duel;

public class CharacterB implements Dueler {

	private int hp;
	
	public CharacterB() {

	}
	
	public String getName() {
		return "Mimi";
	}

	public void taunt() {
		System.out.println("I H8 U 2");
	}

	public void setStartingHP(int hp) {
		this.hp = hp;
	}

	public int getHP() {
		return hp;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return false;
	}

	public int getAction(Object caller) {
		return 0;
	}

	public void hit(Object caller) {
		
	}
	
	
}
