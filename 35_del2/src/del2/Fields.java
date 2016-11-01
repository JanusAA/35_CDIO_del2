package del2;

public class Fields {
	private String name;
	private int val;
	private boolean ekstratur;
	
	public Fields(String fname, int val, boolean ekstratur){
		this.name = name; 
		this.val = val;
		this.ekstratur = ekstratur;
	}
		
	
	public int getval(){
		return val;
	}

	public boolean getekstra(){
		return ekstratur;
	}
	
	public String getfname(){
		return name;
	}
	
	//Tester nogle ting:
//static Fields[] field = new Fields[13];{
//		
//		field[2] = new Fields("Tower", 250, false);
//		field[3] = new Fields("Crater", -100, false);
//		field[4] = new Fields("Palace gates", 100, false);
//		field[5] = new Fields("Cold desert", -20, false);
//		field[6] = new Fields("Walled city", 180, false);
//		field[7] = new Fields("Monastery", 0, false);
//		field[8] = new Fields("Black cave", -70, false);
//		field[9] = new Fields("Huts in the mountain", 60, false);
//		field[10] = new Fields("The Werewall", -80, true);
//		field[11] = new Fields("The pit", -50, false);
//		field[12] = new Fields("Goldmine", 650, false);
//		}
}


// brug fx. field[4].getval, returnere værdien som er lageret på plads nr. 4 i arrayet. altså en int som vi kan regne videre på.