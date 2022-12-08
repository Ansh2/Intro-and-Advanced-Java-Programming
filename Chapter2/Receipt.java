package Chapter2;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter how many people are at the dinner: ");
		int people = input.nextInt();
		double subtotal = calcSubtotal(people, input);
		printTotal(subtotal);

	}

	public static double calcSubtotal(int people, Scanner input) {

		double subtotal = 0;

		double cost = 0;
		for (int i = 1; i <= people; i++) {
			System.out.print("Person #" + i + ": Please enter the cost of your dinner: ");
			cost = input.nextDouble();
			subtotal += cost;

		}

		return subtotal;

	}

	public static void printTotal(double subtotal) {

		double tax = subtotal * .08;
		double tip = subtotal * .15;

		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Tax: $" + tax);
		System.out.println("Tip: $" + tip);
		System.out.println("Total: $" + (subtotal + tax + tip));

	}

}
