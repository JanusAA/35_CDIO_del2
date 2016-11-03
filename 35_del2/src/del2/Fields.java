package del2;

public class Fields {
	private String name;
	private int val;
	private boolean ekstratur;
	
	// Constructor used to create fields: 
	public Fields(String fname, int val, boolean ekstratur){
		this.name = fname; 
		this.val = val;
		this.ekstratur = ekstratur;
	}
		
	/**
	 * The getVal method returns the integer value of the field.
	 * @return
	 */
	public int getVal(){
		return val;
	}

	/**
	 * The getEkstra method returns the boolean value of the field. 
	 * @return
	 */
	public boolean getEkstra(){
		return ekstratur;
	}
	
	/**
	 * The getFName method returns the String name of the field. 
	 * @return
	 */
	public String getFName(){
		return name;
	}
}