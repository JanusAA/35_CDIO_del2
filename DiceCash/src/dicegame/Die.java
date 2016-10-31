package dicegame;

public class Die {
	 int faceValue, sides = 6;
	 
	 	
	    public void roll(){
	        faceValue = (int)(Math.random() * sides + 1);
	    }

	    public int getValue(){
	        return faceValue;   
	    }

	    public String toString(){
	        return Integer.toString(faceValue);
	    }
	}


