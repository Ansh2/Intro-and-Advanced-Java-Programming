package Chapter4;

import java.util.Scanner;

public class CeaserCipherClass {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to Ceaser Cipher!");
		System.out.print("Your secret message: ");

		String secretmessage = console.nextLine();
		System.out.print("Enter your key: ");
		int key = console.nextInt();

		String first = encode(secretmessage, key);
		System.out.println("The encoded message is " + first);

		System.out.print("Your encoded message: ");
		console.nextLine();
		String secretmessage2 = console.nextLine();

		String second = decode(secretmessage2, key);
		System.out.println("The decoded message is: " + second);

	}

	public static String encode(String message, int encodekey) {
		int ch = 0;
		encodekey = encodekey % 26;
		if (encodekey <= 0)
			return message;

		String encodedmessage = "";
		int charconversion = 0;
		for (int i = 0; i <= message.length() - 1; i++) {
			ch = (int) (message.charAt(i));
			if (ch >= 97 && ch <= 122) {
				charconversion = ch + encodekey;
				if (charconversion > 122) {
					charconversion = charconversion + 96 - 122;
				}
			} else if (ch >= 65 && ch <= 90) {
				charconversion = ch + encodekey;
				if (charconversion > 90) {
					charconversion = charconversion + 64 - 90;
				}
			} else {
				charconversion = ch;
			}
			encodedmessage += (char) charconversion;
		}
		return encodedmessage;
	}

	public static String decode(String message, int decodekey) {
		int ch = 0;
		decodekey = decodekey % 26;
		if (decodekey <= 0)
			return message;

		String decodedmessage = "";
		int charconversion = 0;
		for (int i = 0; i <= message.length() - 1; i++) {
			ch = (int) (message.charAt(i));
			if (ch >= 97 && ch <= 122) {
				charconversion = ch - decodekey;
				if (charconversion < 97) {
					charconversion = charconversion + 122 - 96;
				}
			} else if (ch >= 65 && ch <= 90) {
				charconversion = ch - decodekey;
				if (charconversion < 65) {
					charconversion = charconversion + 90 - 64;
				}

			} else {
				charconversion = ch;
			}
			decodedmessage += (char) charconversion;
		}
		return decodedmessage;

	}
}
