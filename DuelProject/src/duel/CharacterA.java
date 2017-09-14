package duel;

public class CharacterA implements Dueler {

	private int hp;
	
	public CharacterA() {

	}
	
	public String getName() {
		return "Mimi";
	}

	public void taunt() {
		System.out.println("I H8 U");
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
	
	
}
