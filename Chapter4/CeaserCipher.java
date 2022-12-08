package Chapter4;

import java.util.Scanner;

//Programming Project
public class CeaserCipher {

	public static final String alphabets = "abcdefghijklmnopqrstuvwkyz";

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to Ceaser Cipher!");
		System.out.println("The encoded message is " + encode(console));
		System.out.println("The decoded message is " + decode(console));
		System.out.println(encode(console));

	}

	public static String encode(Scanner console) {
		System.out.print("Please enter your secret message you would like to encode: ");
		String secretmessage = console.next();
		secretmessage = secretmessage.toLowerCase();
		System.out.print("Enter your key: ");
		int key = console.nextInt();
		int ch = 0;
		char charconversion = 'x';
		String product = "";
		for (int i = 0; i <= secretmessage.length() - 1; i++) {
			int count = 0;
			ch = (int) (secretmessage.charAt(i));

			if (ch + key > 122) {

				for (int j = ch; j <= 122; j++) {
					count++;
				}

				for (int k = 0; k <= (key - count); k++) {
					ch = (int) (alphabets.charAt(k));
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

	public static String decode(Scanner console) {
		System.out.print("Enter your secret message you would like to decode: ");
		String secretmessage = console.next();
		secretmessage = secretmessage.toLowerCase();
		System.out.print("Enter your key: ");
		int key = console.nextInt();
		int ch = 0;
		char charconversion = 'x';
		String product = "";
		for (int i = 0; i <= secretmessage.length() - 1; i++) {
			int count = 0;
			ch = (int) (secretmessage.charAt(i));

			if (ch - key < 97) {

				for (int j = ch; j <= 97; j--) {
					count++;
				}

				for (int k = 25; k >= 25 - (key - count) + 2; k--) {
					ch = (int) (alphabets.charAt(k));
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
