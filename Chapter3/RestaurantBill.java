package Chapter3;

import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a charge for a meal: ");
		double charge = keyboard.nextDouble();
		double taxamount = charge * 0.0675;
		double tipamount = 0.20 * (charge + taxamount);
		double totalbill = charge + taxamount + tipamount;
		System.out.println("The tax is " + taxamount + "\n" 
						 + "The tip is " + tipamount + "\n" 
				         + "The total bill is " + totalbill);

	}

}
