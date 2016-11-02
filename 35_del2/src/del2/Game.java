package del2;

import del2.DiceCup;
import del2.UserLanguage;
import java.util.Scanner;
import del2.Player;
import del2.Account;
import del2.Fields;
import del2.Field;


public class Game {




	public static void main(String[] args) {

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
		Scanner scan = new Scanner(System.in);


		Player p1 = new Player("Spiller 1");
		Player p2 = new Player("spiller 2");
		Account a1 = new Account(1000);
		Account a2 = new Account(1000);
		DiceCup d6 = new DiceCup();


		int r1, r2;
		int wincondition = 3000; 
		String confirm = "";
		String inp;




		do {
			System.out.println("\n " + "Spiller 1 indtats dit navn: ");
			p1.setName(scan.nextLine()); 

			System.out.println("Du har indtastet >>" + p1.getName() + "<< indtast >>Y<< for at bekræfte, eller >>retur<< for at rette navnet");
			confirm = scan.nextLine();
			confirm.toUpperCase();

		}while(!(confirm.equalsIgnoreCase("Y")));

		do {	
			System.out.println("\n " + "Spiller 2 indtats dit navn: ");
			p2.setName(scan.nextLine());

			System.out.println("Du har indtastet >>" + p2.getName() + "<< indtast >>Y<< for at bekræfte, eller >>retur<< for at rette navnet");
			confirm = scan.nextLine();
			confirm.toUpperCase();

		}while(!(confirm.equalsIgnoreCase("Y")));

		do {

			do {
				System.out.println("\n" + p1.getName() + " kast med terningerne");

				//bruger inp som en break for at kaste terningerne. 
				inp = scan.nextLine();

				r1 = d6.rollDiceCup();
				a1.addToCurrentBalance(field[r1].getval());

				System.out.println("Du landede på " + field[r1].getfname() + " det har påvirket din balance med: " + field[r1].getval());
				System.out.println("Din konto er på: " + a1.getBalance());

			}while(field[r1].getekstra() == true);



			do {
				System.out.println("\n" + p2.getName() + " kast med terningerne");

				//bruger inp som en break for at kaste terningerne. 
				inp = scan.nextLine();

				r2 = d6.rollDiceCup();
				a2.addToCurrentBalance(field[r2].getval());

				System.out.println("Du landede på " + field[r2].getfname() + " det har påvirket din balance med: " + field[r2].getval());
				System.out.println("Din konto er på: " + a2.getBalance());

			}while(field[r2].getekstra() == true);



		}while(!(a1.getBalance() >= wincondition || a2.getBalance() >= wincondition));

		if (a1.getBalance() > a2.getBalance())
			System.out.println("Tillykke " + p1.getName() + " - Du har vundet");
		else if (a2.getBalance() > a1.getBalance())
			System.out.println("Tillykke " + p2.getName() + " - Du har vundet");
		else if (a1.getBalance() == a2.getBalance())
			System.out.println("Spillet ender uafgjort - I har begge lige mange point");		

		System.out.println(p1.getName() + " konto: " + a1.getBalance() + "\t"  + p2.getName() + " konto: " + a2.getBalance());
		
	}

}
