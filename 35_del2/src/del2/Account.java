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
	
}

