package Chapter3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		/*
		 * String h = "Exploring Java String Class"; System.out.println(h.charAt(7));
		 * System.out.println(h.toUpperCase()); System.out.println(h.indexOf("Java"));
		 * System.out.println(h.substring(0, 28));
		 * 
		 */

		Scanner keyboard = new Scanner(System.in);
		//System.out.print("How old are you????");
	//	int age = keyboard.nextInt();
//		System.out.println("Your age is " + age);

		// Example of use of token scanner worksheet question 4 Next() White space is not counted in tokens. 
		//The enter key is also white space
/*		for (int i = 5; i < 5; i++) {
			String s = keyboard.next(); 
			System.out.println("Your input is" + s);

		}*/

		String quote = "hello";
		for (int i = 0; i< quote.length(); i++) {
			System.out.println(quote.charAt(i));
		} 
		//Above code produces a vertical line. 

		System.out.println(Math.pow(2, 2));

	}

}
