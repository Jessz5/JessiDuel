package duel;

import java.util.*;

public class CharacterB implements Dueler {

	private int hp;
	
	public CharacterB() {
		setStartingHP(100);
	}
	
	public String getName() {
		return "Mimi";
	}

	public void taunt() {
		String arrayTaunts[] = {"I H8 U LOL","Here I come!", "Show me your moves!"};
		System.out.println(arrayTaunts[tauntRandom]);
		tauntRandom++;
		if(tauntRandom > 2)
			tauntRandom = 0;
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

	public int getAction(Object caller) {
		Random rand = new Random();
		//random num:Max=3 , min =0
		return rand.nextInt(3);
			
	}

	public void hit(Object caller) {
		if(caller instanceof Duel) {
			hp -= 10;
		}
	}
	
	
}
