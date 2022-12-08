package Chapter3;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a integer from 2 to 10: ");
		int x = keyboard.nextInt();

		for (int i = x; i <= 100; i += x) {
			System.out.print(i + " ");
			
		}

	}
}
