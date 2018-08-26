
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nThe Great Magisteria Knows All!");
		System.out.println("\nAnswer some simple questions and have your future foretold!");
		System.out.println("\nI only need some basic information about you.\nWhat is your first name?");
		String firstName = input.nextLine();
		System.out.println("\nWhat a lovely name! It suits you.\nAnd what is your last name?");
		String lastName = input.nextLine();
		System.out.println("\nAnd how old are you, " + firstName + " " + lastName + "?");
		int age = input.nextInt();
		if (age > 29) {
			
		}
		
		
		System.out.println("\nMy goodness! You don't look a day over " + (age - 7) + "!");
		System.out.println("\nNow, tell me, my dear " + firstName + ", what month were you born in? As a number, please.");
		int month = input.nextInt();
		input.nextLine();
		System.out.println("\nThe Great Magisteria is almost ready to tell your future!\nWhat is your favorite color?");
		System.out.println("Enter a ROYGBIV color, or \"help\" if you'd like to see a list of colors.");
		String choice = input.nextLine();
		while (choice.toLowerCase().equals("help")) {
			System.out.println("ROYGBIG stands for Red Orange Yellow Green Blue Indigo Violet\nWhich is your favorite?");
			choice = input.nextLine();
		}
		choice = choice.toLowerCase();
		String transport;
		switch (choice) {
		case "red":
			transport = "shuttlecraft";
			break;
		case "orange":
			transport = "teleporter";
			break;
		case "yellow":
			transport = "unicorn";
			break;
		case "green":
			transport = "eagle";
			break;
		case "blue":
			transport = "sedan chair";
			break;
		case "indigo":
			transport = "yacht";
			break;
		case "violet":
			transport = "stilts";
			break;
		default:
			transport = "Ford Pinto";
		}

		System.out.println("One last question, darling! The Great Magisteria must know--how many siblings do you have?");
		int siblings = input.nextInt();
		int retirementYears;
		if (age % 2 == 0) {
			retirementYears = (80 - age) / 2;
		} else {
			retirementYears = (80 - age) / 3;
		}
		String vacationHome;
		if (siblings >= 8) {
			siblings = 8;
		}
		switch (siblings) {
		case 0:
			vacationHome = "Deep Space Nine, Alpha Quadrant";
			break;
		case 1:
			vacationHome = "Del Boca Vista, Florida";
			break;
		case 2:
			vacationHome = "Rivendell, Middle Earth";
			break;
		case 3:
			vacationHome = "Asgard, Nine Realms";
			break;
		case 4:
			vacationHome = "Arrakeen, Arrakis";
			break;
		case 5:
			vacationHome = "Godric's Hollow, England";
			break;
		case 6:
			vacationHome = "Hawkins, Indiana";
			break;
		case 7:
			vacationHome = "Arcadia, Gallifrey";
			break;
		case 8:
			vacationHome = "Sunnydale, California";
			break;
		default:
			vacationHome = "Serenity Valley, Hera";
		}
		float balance;
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

		switch (month) {
		case 1:
		case 2:
			balance = 700050;
			break;
		case 3:
		case 4:
			balance = 3000000;
			break;
		case 5:
		case 6:
			balance = 489539;
			break;
		case 7:
		case 8:
			balance = 4000;
			break;
		case 9:
		case 10:
			balance = 239900;
			break;
		case 11:
		case 12:
			balance = 343;
			break;
		default:
			balance = 0;
		}
		System.out.println("\n\nThe Great Magisteria will now reveal your fortune! Behold!\n");
		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years, with "
				+ currency.format(balance) + " in the bank. My goodness!\n" + firstName
				+ " will have a lovely vacation home in " + vacationHome + ", and travel exclusively by " + transport
				+ ".");
		System.out.println("Isn't that lovely? The Great Magisteria Knows All!");

		input.close();
	}

}
