package Chapter5;

import java.util.Scanner;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Welcome to the rock paper scissor game!");
		System.out.println("Do you want to play the game? (Best of three rounds)");
		String answer = console.next();
		if (answer.equalsIgnoreCase("Yes"))
			realgame(console, rand, answer);

	}

	public static void realgame(Scanner console, Random rand, String answer) {
		int computerpoints = 0;
		int userpoints = 0;
		while (answer.equalsIgnoreCase("Yes") && ((computerpoints < 2) || (userpoints < 2))) {
			System.out.println("Enter an item you would want to compete with the computer!");
			String userobject = console.next();
			int computerchoice = rand.nextInt(3) + 1;
			String computerobject = "";

			if (computerchoice == 1) {
				computerobject = "rock";
			} else if (computerchoice == 2) {
				computerobject = "paper";
			} else if (computerchoice == 3) {
				computerobject = "scissors";
			}

			if ((computerobject.equalsIgnoreCase("Rock") && userobject.equalsIgnoreCase("Paper"))
					|| (computerobject.equalsIgnoreCase("Paper") && userobject.equalsIgnoreCase("Scissors"))
					|| (computerobject.equalsIgnoreCase("Scissors") && userobject.equalsIgnoreCase("Rock"))) {
				System.out.println("Computer choice is " + computerobject);
				System.out.println("You have won!!!");
				userpoints++;
			} else if ((computerobject.equalsIgnoreCase("Rock") && userobject.equalsIgnoreCase("Scissors"))
					|| (computerobject.equalsIgnoreCase("Paper") && userobject.equalsIgnoreCase("Rock"))
					|| (computerobject.equalsIgnoreCase("Scissors") && userobject.equalsIgnoreCase("Paper"))) {
				System.out.println("Computer choice is " + computerobject);
				System.out.println("Computer has won :(:(:(");
				computerpoints++;

			} else if (computerobject.equalsIgnoreCase(userobject)) {
				System.out.println("Tie");
			} else {
				System.out.println("Please input a correct object.");
				realgame(console, rand, answer);
			}

		}
		System.out.println("You got " + userpoints + " points.");
		System.out.println("The computer got " + computerpoints + " points.");
		if (userpoints > computerpoints)
			System.out.println("You won the game!!! Congratulations");
		else if (userpoints < computerpoints)
			System.out.println("You have lost (:(:(:");

		end(console, rand);

	}

	public static void end(Scanner console, Random rand) {
		System.out.println("Do you want to play again? (Yes or No)");
		String answer2 = console.next();

		if (answer2.equalsIgnoreCase("Yes")) {
			realgame(console, rand, answer2);
		} else if (answer2.equalsIgnoreCase("No")) {
			System.out.println("Thank you for playing Rock Paper Scissors!");

		} else {
			System.out.println("Please enter a correct response.");
			end(console, rand);
		}
	}
}


