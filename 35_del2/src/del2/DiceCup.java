package del2;

import del2.Die;

public class DiceCup {
	Die d1 = new Die();
	Die d2 = new Die();
	
	
	private int rollDiceCup(){
		return d1.roll() + d2.roll();
		
	}
	
}
