package dicegame;

public class Die {
	 int faceValue, sides; 
	 	 	
	    public void roll(){
	        faceValue = (int)(Math.random() * sides + 1);
	        this.sides = 6;
	   }

	    public int getValue(){
	        return faceValue;   
	    }

	    public String toString(){
	        return Integer.toString(faceValue);
	    }
	}


