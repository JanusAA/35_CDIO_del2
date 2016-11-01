package del2;

public class Fields {
	private String name;
	private int val;
	private boolean ekstratur;
	
	public Fields(String name, int val, boolean ekstratur){
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
	
	
	
}


// brug fx. field[4].getval, returnere værdien som er lageret på plads nr. 4 i arrayet. altså en int som vi kan regne videre på.