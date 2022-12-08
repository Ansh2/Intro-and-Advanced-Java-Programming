package Chapter5;

import java.util.Scanner;

import java.util.Random;

//Homework 

//Write a game that plays many rounds of Rock Paper Scissors. The user and computer will each choose 
//between three items: rock (defeats scissors, but loses to paper), paper (defeats rock, but loses to scissors), 
//and scissors (defeats paper, but loses to rock). If the player and computer choose the same item, the game is a tie.
//The program will prompt for user input, compare input to a computer counter-move, then output a verdict (user loses, 
//wins, or ties), prompt for another round or exit. If the use wants to play again, they can play another round. 

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcome to the Rock Paper Scissors Game!");
		realgame(console, r);

	}

	public static void realgame(Scanner console, Random r) {
		System.out.println("Please enter the item you would want to compete with the computer!");
		String userobject = console.next();
		int computerchoice = r.nextInt(3);
		String x = "";
		String computerobject = "";

		if (computerchoice == 1)
			computerobject = "Rock";
		else if (computerchoice == 2)
			computerobject = "Paper";
		else if (computerchoice == 3)
			computerobject = "Scissors";

		if (computerobject.equalsIgnoreCase("Rock") && userobject.equalsIgnoreCase("Paper")) {
			x = "Rock";
			System.out.println("Computer choice is " + x);
			System.out.println("You have won!!!");
		} else if (computerobject.equalsIgnoreCase("Rock") && userobject.equalsIgnoreCase("Scissors")) {
			x = "Rock";
			System.out.println("Computer choice is " + x);
			System.out.println("Computer has won :(:(:(");

		} else if (computerobject.equalsIgnoreCase("Paper") && userobject.equalsIgnoreCase("Scissors")) {
			x = "Paper";
			System.out.println("Computer choice is " + x);
			System.out.println("You have won!!!");
		} else if (computerobject.equalsIgnoreCase("Paper") && userobject.equalsIgnoreCase("Rock")) {
			x = "Paper";
			System.out.println("Computer choice is " + x);
			System.out.println("Computer has won :(:(:(");
		} else if (computerobject.equalsIgnoreCase("Scissors") && userobject.equalsIgnoreCase("Paper")) {
			x = "Scissors";
			System.out.println("Computer choice is " + x);
			System.out.println("Computer has won :(:(:(");

		} else if (computerobject.equalsIgnoreCase("Scissors") && userobject.equalsIgnoreCase("Rock")) {
			x = "Scissors";
			System.out.println("Computer choice is " + x);
			System.out.println("You have won!!!");
		} else if (computerobject.equalsIgnoreCase(userobject)) {
			System.out.println("Tie");
		} else {
			System.out.println("Please input a correct object.");
			realgame(console, r);

		}
		end(console, r);

	}

	public static void end(Scanner console, Random r) {
		System.out.println("Do you want to play again?");
		String answer = console.next();

		if (answer.equalsIgnoreCase("Yes")) {
			realgame(console, r);
		} else if (answer.equalsIgnoreCase("No")) {
			System.out.println("Thank you for playing Rock Paper Scissors!");

		} else {
			System.out.println("Please enter a correct response (yes or no).");
		}
	}

	public static void end2(Scanner console, Random r) {
		end(console, r);

	}

}
