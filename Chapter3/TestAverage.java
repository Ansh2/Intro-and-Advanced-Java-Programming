package Chapter3;

import java.util.Scanner;

public class TestAverage {

	public static void main(String[] args) {

		int amountofnumbers = 3;
		double input = 0; 
		double sumofnumbers = 0;

		Scanner keyboard = new Scanner(System.in);

		for (int i = 1; i <= amountofnumbers; i++) {

			System.out.println("Please enter a test grade between 0 - 100");
			input = keyboard.nextDouble();
			sumofnumbers += input;
			System.out.println("#" + i + " test grade = " + input);
		}
		System.out.println("The test average is " + (sumofnumbers / 3));

	}

}
