package Chapter4;

import java.util.Scanner;

public class CeaserCipherSemiFinal {
	public static void main(String[] args) {
	
		//The best so far
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to Ceaser Cipher!");
		System.out.print("Your secret message (no symbols please): ");
		String secretmessage = console.nextLine();
		
		String first = encode(console, secretmessage);

		System.out.println("The encoded message is " + first);

		System.out.print("Your encoded message: ");
		console.nextLine();
		String secretmessage2 = console.nextLine();
		String second = decode(console, secretmessage2);

		System.out.println("The decoded message is: " + second);

	}

	public static String encode(Scanner console, String secretmessage) {
		System.out.print("Enter your key: ");
		int key = console.nextInt();
		int ch = 0;
		char charconversion = 'x';
		String product = "";
		for (int i = 0; i <= secretmessage.length() - 1; i++) {
			int count = 0;
			ch = (int) (secretmessage.charAt(i));
			if (ch == 32) {
				
				charconversion = (char) (ch);
				product += charconversion;

			} else if (ch + key > 122 && (ch >= 97 && ch <=122)) {

				for (int j = ch; j <= 122; j++) {
					count++;
				}

				for (int k = 97; k <= 97 + (key - count); k++) {
					ch = (int) (k);
					charconversion = (char) (ch);
				}
				product += charconversion;
				

			} else if ((ch >= 65 && ch <= 90) && (ch + key >= 90)) {
				for (int j = ch; j <= 90; j++) {
					count++;
				}

				for (int k = 65; k <= 65 + (key - count); k++) {
					ch = (int) (k);
					charconversion = (char) (ch);
				}
				product += charconversion;

			} else {
				charconversion = (char) (ch + key);
				product += charconversion;
	
			}

		}
		return product;

	}

	public static String decode(Scanner console, String secretmessage2) {
		System.out.print("Enter your key: ");
		int key = console.nextInt();
		int ch = 0;
		char charconversion = 'x';
		String product = "";
		for (int i = 0; i <= secretmessage2.length() - 1; i++) {
			int count = 0;
			ch = (int) (secretmessage2.charAt(i));

			if (ch == 32) {
				
				charconversion = (char) (ch);
				product += charconversion;

			} else if (ch - key < 97 && (ch >= 97 && ch <=122)) {

				for (int j = ch; j <= 97; j--) {
					count++;
				}

				for (int k = 122; k >= 122 - (key - count) + 2; k--) {
					ch = (int) (k);
					charconversion = (char) (ch);
				}
				product += charconversion;
				

			} else if ((ch - key < 65) && (ch >= 65 && ch <= 90)) {

				for (int j = ch; j <= 65; j--) {
					count++;
				}

				for (int k = 90; k >= 90 - (key - count) + 2; k--) {
					ch = (int) (k);
					charconversion = (char) (ch);
				}
				product += charconversion;

			} else {
				charconversion = (char) (ch - key);
				product += charconversion;
			}

		}
		return product;

	}

}
