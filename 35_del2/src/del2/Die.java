package del2;

public class Die {
	 int faceValue, sides; 
	 	 	
	    public void roll(){
	        // Vi giver udvikler letter mulighed for at ændre antallet af sider på terningen
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


