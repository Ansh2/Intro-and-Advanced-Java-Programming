package Chapter4;

import java.util.Scanner;

public class ExerciseMethods2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// # 8
		smallestLargest(console);
		System.out.println();
		// # 9
		evenSumMax(console);
		System.out.println();
		// # 10
		printGPA(console);
		System.out.println();
		// # 11
		longestName(console, 4);
		System.out.println();

	}

	// Exercise # 8
	public static void smallestLargest(Scanner console) {
		System.out.print("How many numbers do you want to enter? ");
		int amount = console.nextInt();
		System.out.print("Enter the first number: "); // You should always get your first number beffor ethe loop
		int firstnum = console.nextInt();
		int largest = firstnum;
		int smallest = firstnum;
		int num = 0;
		for (int i = 2; i <= amount; i++) {
			System.out.print("Number " + i + ": ");
			num = console.nextInt();
			if (num < smallest) {
				smallest = num;
			} else if (num > largest) {
				largest = num;
			}

		}
		System.out.println("Smallest = " + smallest);
		System.out.println("Largest = " + largest);

	}

	// Exercise # 9
	public static void evenSumMax(Scanner console) {
		System.out.print("How many integers? ");
		int amount = console.nextInt();
		int sum = 0;
		System.out.println("Enter the first integer: ");
		int firstnum = console.nextInt();
		int max = firstnum;
		int num = 0;
		for (int i = 2; i <= amount; i++) {
			System.out.print("Integer # " + (i + 1) + "? ");
			num = console.nextInt();
			if (num % 2 == 0) {
				sum += num;
			}
			if (num > max) {
				max = num;
			}

			System.out.println("Even sum = " + sum + ", Even max = " + max);
		}
	}

	// Exercise # 10
	public static void printGPA(Scanner console) {
		System.out.print("Enter a students record: ");
		String name = console.next();
		int amount = console.nextInt();
		double num = 0;
		double sum = 0;
		double average = 0;
		for (int i = 1; i <= amount; i++) {
			num = console.nextInt();
			sum += num;

		}
		average = (sum / amount);
		System.out.println(name + "'s grade is " + average);

	}

	// Exercise # 11
	public static void longestName(Scanner console, int amount) {
		String longest = "";
		int length = 0;
		int length2 = 0;
		for (int i = 1; i <= amount; i++) {
			System.out.print("Name # " + i + "? ");
			String name = console.next();
			if (name.length() > longest.length()) {
				longest = name;
			}

		}
		String last = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();
		System.out.println(last + "'s name is longest");
	}

}
