package Chapter4;

import java.util.Scanner;

// Self Check Problem #13
public class SelfCheck13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What color do you want? ");
		String colorletterchoice = keyboard.nextLine();
		if (colorletterchoice.equalsIgnoreCase("b")) {
			System.out.println("You have chosen Blue.");
		} else if (colorletterchoice.equalsIgnoreCase("g")) {
			System.out.println("You have chosen Green.");
		} else if (colorletterchoice.equalsIgnoreCase("r")) {
			System.out.println("You have chosen Red.");
		} else
			System.out.println("Unknown color: " + colorletterchoice);

	}

}
