package del2;

import del2.DiceCup;
import del2.UserLanguage;
import java.util.Scanner;
import del2.Player;
import del2.Account;

import del1.Player;

public class Game {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		
		Player p1 = new Player("Spiller 1", 0);
		Player p2 = new Player("spiller 2", 0);
		
		DiceCup d6 = new DiceCup();
		
		int points;
		String confirm = "";
		
		
		do {
			System.out.println(newLine + Play1EnterName);
			p1.setName(scan.nextLine());

			System.out.println(confirm1 + p1.getName() + confirm2);
			confirm = scan.nextLine();
			confirm.toUpperCase();

		}while(!(confirm.equalsIgnoreCase("Y")));

		do {
			System.out.println(newLine + Player2EnterName);
			p2.setName(scan.nextLine());

			System.out.println(confirm1 + p2.getName() + confirm2);
			confirm = scan.nextLine();
			confirm.toUpperCase();

		}while(!(confirm.equalsIgnoreCase("Y")));
		

	}

}
