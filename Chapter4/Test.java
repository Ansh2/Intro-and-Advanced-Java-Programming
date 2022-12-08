package Chapter4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	/*	Scanner console = new Scanner(System.in);
		System.out.println("What percent did you earn?");
		int percent = console.nextInt();
		if (percent >= 90) {
			System.out.println("You got an A!!!");
		} else if (percent >= 80) {
			System.out.println("You got a B!");
		} else if (percent >= 70) {
			System.out.println("You got a C:(");
		} else if (percent >= 60) {
			System.out.println("You got a D:(");
		} else {
			System.out.println("You got an F :(:(:(");
		}
		*/
		//Roundoff Question? 
		//Why is their inconsistentcy in the roundoff as some numbers are rounded while some aren't? 
		double product1 = 2.1 * 3.2;
		System.out.println("Product 1 = " + product1);
		double product2 = 2.2 * 3.2;
		System.out.println("Product 2 = " + product2);
		double product3 = 2.3 * 3.2;
		System.out.println("Product 3 = " + product3);
		double product4 = 2.4 * 3.2;
		System.out.println("Product 4 = " + product4); //When computer tries to round off, it creates an error. 
		double product5 = 2.5 * 3.2;
		System.out.println("Product 5 = " + product5);
		double product6 = 2.6 * 3.2;
		System.out.println("Product 6 = " + product6);
		double product7 = 2.7 * 3.2;
		System.out.println("Product 7 = " + product7);
		double product8 = 2.8 * 3.2;
		System.out.println("Product 8 = " + product8);
		
		
		System.out.println();

		
		//Roundoff Erros when the same decimal point number is being added. (2 for before the decmial place and two after the decimal place. 

	}

}
