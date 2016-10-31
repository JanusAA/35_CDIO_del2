package dicegame;

public class Account {
	private int balance;
	
	//Constructor:
	public Account (int balance){
		this.balance = balance;
		}

	public int getBalance() {
		return balance;
	}

	private void setBalance(int balance) {
		this.balance = 3000;
	}
	
	
	/**
	 * addToCurrentBalance adds amount to the total balance and returns the new balance. 
	 * @param amount
	 * @return
	 */
	public int addToCurrentBalance(int amount){
		balance = balance + amount;
		return balance;
	}
	

//Nedenstående kode skal referere til udskrift fra User language klassen
	
//public String toString (){
//	return ( "Spiller: " + name );
//}
	
	
}

