package Chapter4;

import java.util.Scanner;

public class CumulativeSumAverage {

	public static void main(String[] args) {
		sum();
	}

	public static void sum() {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers would you like in your number series? ");
		int x = console.nextInt();
		System.out.print("Enter a series of decimals: ");
		int numberofnegatives = 0;
		int sumofnumbers = 0;
		for (int i = 1; i <= x; i++) {
			double y = console.nextDouble();
			if (y > 0 || y < 0) {
				sumofnumbers += y;
				if (y < 0) {
					numberofnegatives++;
				}
			} else if (x == 0) {
				System.out.println("Zero is not the correct output. Please type in another number.");
			}
			System.out.println("The average is " + (sumofnumbers / 3));
			System.out.println("The number of negatives is " + numberofnegatives);

		}

	}
}
