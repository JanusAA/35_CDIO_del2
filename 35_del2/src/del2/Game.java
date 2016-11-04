package del2;

import del2.DiceCup;
import del2.ULang;
import java.util.Scanner;
import del2.Player;
import del2.Account;
import del2.Fields;



public class Game {




	public static void main(String[] args) {

		/**
		 * Creating array containing Fields class information, name of the field, value of the field
		 * and a boolean statement which determines if the field provides a extra roll.
		 */
		Fields[] field = new Fields[13];{

			field[2] = new Fields("Tower", 250, false);
			field[3] = new Fields("Crater", -100, false);
			field[4] = new Fields("Palace gates", 100, false);
			field[5] = new Fields("Cold desert", -20, false);
			field[6] = new Fields("Walled city", 180, false);
			field[7] = new Fields("Monastery", 0, false);
			field[8] = new Fields("Black cave", -70, false);
			field[9] = new Fields("Huts in the mountain", 60, false);
			field[10] = new Fields("The Werewall", -80, true);
			field[11] = new Fields("The pit", -50, false);
			field[12] = new Fields("Goldmine", 650, false);
		}
		
		// Adding new scanner to retrieve player input.
		Scanner scan = new Scanner(System.in);

		//Creating objects/instances of; player class, account class, and a dicecup.
		Player p1 = new Player("Spiller 1");
		Player p2 = new Player("spiller 2");
		Account a1 = new Account(1000);
		Account a2 = new Account(1000);
		DiceCup d6 = new DiceCup();

		
		int r1, r2;
		int wincondition = 3000; 
		String confirm = "";
		String inp;



		// The two first do/while loops are used to retrieve the players names.
		// Before the code continues, and the game is started the players have to confirm their entered name by entering "Y" in the TUI.
		do {
			System.out.println("\n" + ULang.enterNameP1Text());
			p1.setName(scan.nextLine()); 

			System.out.println(ULang.nameEnteredText() + p1.getName() + ULang.confirmText());
			confirm = scan.nextLine();
			confirm.toUpperCase();

		}while(!(confirm.equalsIgnoreCase("Y")));

		do {	
			System.out.println("\n" + ULang.enterNameP2Text());
			p2.setName(scan.nextLine());

			System.out.println(ULang.nameEnteredText() + p2.getName() + ULang.confirmText());
			confirm = scan.nextLine();
			confirm.toUpperCase();

		}while(!(confirm.equalsIgnoreCase("Y")));

		
		//The ULang class contains strings which are used in syso's in the main class. 
		//Hence if the language needs to be changed, one can change the text in the ULang class.
		//Printing the rules and the brief introduction to the game from the ULang class. 
		System.out.println(ULang.gameRulesText());
		
		// The do-while loop continues until the win condition is true; either of the player balances is  > 3000.
		do {

			do {
				System.out.println("\n" + p1.getName() + ULang.throwDiceText());

				//Using the scan and the String inp to enable the player to "roll" the diceCup by stopping the code while waiting for player input. 
				inp = scan.nextLine();

				r1 = d6.rollDiceCup();
				a1.addToCurrentBalance(field[r1].getVal());
				
				System.out.println(ULang.DiceSumText() + r1);

				System.out.println(ULang.landOnText() + field[r1].getFName() + ULang.balanceAffectedText() + field[r1].getVal());
				System.out.println(ULang.currentBalanceText() + a1.getBalance());

			}while(field[r1].getEkstra() == true);



			do {
				System.out.println("\n" + p2.getName() + ULang.throwDiceText());

				//bruger inp som en break for at kaste terningerne. 
				inp = scan.nextLine();

				r2 = d6.rollDiceCup();
				a2.addToCurrentBalance(field[r2].getVal());

				System.out.println(ULang.landOnText() + field[r2].getFName() + ULang.balanceAffectedText() + field[r2].getVal());
				System.out.println(ULang.currentBalanceText() + a2.getBalance());

			}while(field[r2].getEkstra() == true);



		}while(!(a1.getBalance() >= wincondition || a2.getBalance() >= wincondition));

		// Determines the winner based on the account balances: 
		if (a1.getBalance() > a2.getBalance())
			System.out.println(ULang.congratsText() + p1.getName() + ULang.winnerText());
		else if (a2.getBalance() > a1.getBalance()) 
			System.out.println(ULang.congratsText() + p2.getName() + ULang.winnerText());
		else if (a1.getBalance() == a2.getBalance())
			System.out.println(ULang.stalemateText());		

		System.out.println(p1.getName() + ULang.accountText() + a1.getBalance() + "\t"  + p2.getName() + ULang.accountText() + a2.getBalance());
		
	}

}
