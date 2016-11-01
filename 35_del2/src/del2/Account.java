package del2;

public class Account {
	private int balance;
	
	//Constructor:
	public Account (int balance){
		this.balance = balance;
		}

	public int getBalance() {
		return balance;
	}

	private void setBalance() {
		this.balance = 1000;
	}
	
	
	/**
	 * addToCurrentBalance adds amount to the total balance and returns the new balance. 
	 * @param amount
	 * @return
	 */
	public int addToCurrentBalance(int amount){
		balance = balance + amount;
			if(balance < 0){
				balance = 0;
			}return balance;
	}


//Nedenstående kode skal referere til udskrift fra User language klassen
	
//public String toString (){
//	return ( "Spiller: " + name );
//}
	
	
}

