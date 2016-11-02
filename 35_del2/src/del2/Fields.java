package del2;

public class Fields {
	private String name;
	private int val;
	private boolean ekstratur;
	
	public Fields(String fname, int val, boolean ekstratur){
		this.name = fname; 
		this.val = val;
		this.ekstratur = ekstratur;
	}
		
	
	public int getVal(){
		return val;
	}

	public boolean getEkstra(){
		return ekstratur;
	}
	
	public String getFName(){
		return name;
	}
}