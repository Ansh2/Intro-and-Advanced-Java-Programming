package Chapter3;

import java.util.Scanner;

// Programming Project #1

public class ChristmasTrees {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What would you like the segment and the height of your tree to be?");
		int selectedsegment = keyboard.nextInt();
		int selectedheight = keyboard.nextInt();
		System.out.println("Your tree is:");
		tree(selectedsegment, selectedheight);
	}

	public static void tree(int segments, int height) {
		int a = 0;
		int b = 0;
		for (int q = 1; q <= segments; q++) {
			int i = 6;
			for (int line = 1 + a; line <= height * 2 + a; line += 2) {

				for (int j = 1 + a; j <= (line * -1) + i + a + b; j++) {
					System.out.print(" ");
				}
				for (int x = 1; x <= line; x++) {
					System.out.print("*");
				}

				for (int j = 1 + a; j <= (line * -1) + i + a + b; j++) {
					System.out.print(" ");
				}
				i++;
				System.out.println();

			}
			a = a + 2;
			b++;

		}

		for (int space = 1; space <= 2; space++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int space = 1; space <= 2; space++) {
			System.out.print(" ");
		}
		System.out.println("*******");

	}
}
