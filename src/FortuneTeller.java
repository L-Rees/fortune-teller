
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("\nThe Great Magisteria Knows All!");
		Thread.sleep(1000);
		System.out.println("\nAnswer some simple questions and have your future foretold!");
		Thread.sleep(1000);
		System.out.println("\nI only need some basic information about you.");
		Thread.sleep(700);
		System.out.println("\nWhat is your first name?"); 
		String entry = input.nextLine();
		if (entry.equalsIgnoreCase("exit")) {
			System.out.println("Nobody likes a quitter . . .");
			System.exit(0);
		}
		String firstName = entry;
		
		System.out.println("\nWhat a lovely name! It suits you.");
		Thread.sleep(700);
		System.out.println("\nAnd what is your last name?");
		entry = input.nextLine();
		if (entry.equalsIgnoreCase("exit")) {
			System.out.println("Nobody likes a quitter . . .");
			System.exit(0);
		}
		String lastName = entry;
		
		System.out.println("\nAnd how old are you, " + firstName + " " + lastName + "?");
		entry = input.nextLine();
		if (entry.equalsIgnoreCase("exit")) {
			System.out.println("Nobody likes a quitter . . .");
			System.exit(0);
		}
		int age = Integer.parseInt(entry);
		
		
		String ageFlattery;
		if (age > 29) {
			ageFlattery = "You don't look a day over " + (age - 7);
		}else if (age <= 29 && age > 18) {
			ageFlattery = "You are wise beyond your years";
		}else {
			ageFlattery = age + " is a great age";
		}
		
		System.out.println("\nMy goodness! " + ageFlattery + "!");
		Thread.sleep(700);
		System.out.println("\nNow, tell me, my dear " + firstName + ", what month were you born in? As a number, please.");
		entry = input.nextLine();
		if (entry.equalsIgnoreCase("exit")) {
			System.out.println("Nobody likes a quitter . . .");
			System.exit(0);
		}
		int month = Integer.parseInt(entry);
		
		System.out.println("\nThe Great Magisteria is almost ready to tell your future!");
		Thread.sleep(1200);
		System.out.println("\nWhat is your favorite color?");
		System.out.println("Enter a ROYGBIV color, or \"help\" if you'd like to see a list of colors.");
		entry = input.nextLine();
		if (entry.equalsIgnoreCase("exit")) {
			System.out.println("Nobody likes a quitter . . .");
			System.exit(0);
		}
		String choice = entry;
		while (choice.toLowerCase().equals("help")) {
			System.out.println("ROYGBIG stands for Red Orange Yellow Green Blue Indigo Violet\nWhich is your favorite?");
			choice = input.nextLine();
			if (choice.equalsIgnoreCase("exit")){
				System.out.println("Nobody likes a quitter . . .");
				System.exit(0);
			}
		}
		choice = choice.toLowerCase();
		
		System.out.println("One last question, darling!");
		Thread.sleep(1200);
		System.out.println("The Great Magisteria must know--");
		Thread.sleep(700);
		System.out.print("how many siblings do you have?");
		entry = input.nextLine();
		if (entry.equalsIgnoreCase("exit")) {
			System.out.println("Nobody likes a quitter . . .");
			System.exit(0);
		}
		int siblings = Integer.parseInt(entry);
		
		// color to transport
		
		String transport;
		switch (choice) {
		case "red":
			transport = "shuttlecraft";
			break;
		case "orange":
			transport = "submarine";
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
		
		// age to retirement years
		
		int retirementYears;
		if (age % 2 == 0) {
			//retirementYears = (age - 10) / 2;
			retirementYears = (int) (age - (Math.random()* age ) + 5);
		} else {
			retirementYears = (age - 20) / 3;
		}
		
		// siblings to vacation home
		
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
			vacationHome = "Asgard, of the Nine Realms";
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
		
		// birth month to bank balance
		
		double balance;
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		if (month > 0 && month < 4) {
			balance = month * 10000000;
		}else if (month >= 4 && month < 8) {
			balance = month * 12000;
		}else if (month >= 8 && month <=12) {
			balance = month * 75;
		}else {
			balance = 0;
		}
		System.out.println("I will now consult the crystal ball.");
		Thread.sleep(1000);
		System.out.println("Huh.");
		Thread.sleep(1000);
		System.out.println("Oh, my isn't that interesting!");
		Thread.sleep(1000);
		System.out.println("\n\nThe Great Magisteria will now reveal your fortune! Behold!\n");
		Thread.sleep(1500);
		System.out.println("\n" + firstName + " " + lastName + " will retire in " + retirementYears + " years, with "
				+ currency.format(balance) + " in the bank. My goodness!\n\n" + firstName
				+ " will have a lovely vacation home in " + vacationHome + ", and travel exclusively by " + transport
				+ ".");
		Thread.sleep(1200);
		System.out.println("\nIsn't that lovely? The Great Magisteria Knows All!");

		input.close();
	}

}
