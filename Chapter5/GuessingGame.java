package Chapter5;

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner console = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10");
		System.out.print("Your guess: ");
		int yourguess = console.nextInt();
		int computerguess = r.nextInt(10) + 1;
		int numberofguesses = 1; 
		
		while (!(yourguess == computerguess)) {
			
			if (yourguess < computerguess) {
				System.out.println("Its lower");
			} else if (yourguess > computerguess) {
				System.out.println("Its higher");
			}
			System.out.print("Your guess: ");
			yourguess = console.nextInt(); 
			computerguess = r.nextInt(10) + 1; 
			numberofguesses++; 
		}
		System.out.println("You got it right in " + numberofguesses + " guesses");

	}

}
