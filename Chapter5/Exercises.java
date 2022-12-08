package Chapter5;

import java.util.*;

public class Exercises {

	public static void main(String[] args) {
		Random r = new Random(); 
		//showTwo(68);
		//System.out.println("\n" + toBinary(44)); 
		//randomX(r); 
		makeGuesses(r); 
		
	}

	// Exercise #1
	public static void showTwo(int num) {
		System.out.print(num + " =");
		while (num % 2 == 0) {
			System.out.print(" 2 *");
			num /= 2;
		}
		System.out.print(" " + num);

	}

	// Exercise #2
	public static void gcd(int num1, int num2) {
		int loopcount = 1;
		int holdlargestfactor = 1;
		int minimum = Math.min(num1, num2);
		while (loopcount <= minimum) {
			if (num1 % loopcount == 0 && num2 % loopcount == 0) {
				holdlargestfactor = loopcount;

			}
			loopcount++;
		}
		System.out.println(holdlargestfactor);

	}

	// Exercise #3
	public static String toBinary(int num) {
		String binary = ""; 
		while (num > 0) {
			if (num % 2 == 0) {
				binary = "0" + binary; 
			} else if (!(num % 2 == 0)) {
				binary = "1" + binary;
			}
			num = num / 2; 
		}
		return binary;

	}
	// Exercise #4
	public static void randomX(Random r) {
		
		int looptimes = r.nextInt(16) + 5; 
		while (!(looptimes == 16)) {
			for (int i = 1; i<=looptimes; i++) {
				System.out.print("x");
			}
			System.out.println();
			looptimes = r.nextInt(16) + 5; 
		}
		for (int i = 1; i<=looptimes; i++) {
			System.out.print("x");

		}
		System.out.println();
	}
	//Exercise #6
	public static void makeGuesses(Random r) {
		int num = r.nextInt(50) + 1; 
		int count = 1; 
		while (num < 48) {
			System.out.println("guess = " + num);
			num = r.nextInt(50) + 1; 
			count++; 
		}
		System.out.println("guess = " + num);
		System.out.println("total guesses = " + count);
	}
	//Exercise # 5 Prints betweeen 5 and 10 random strings of letters( between a and az ) one per line and each
	//string should have random lengths of up to 80 characterse
}
