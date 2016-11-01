package del2;

import del2.Die;


public class DiceCup {
	
	
	Die d1 = new Die();
	Die d2 = new Die();
		
	public int rollDiceCup(){
		int v1 = d1.roll();
		int v2 = d2.roll();
		return v1+v2;
		
	}
	
}
