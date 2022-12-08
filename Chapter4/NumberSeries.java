package Chapter4;

import java.util.Scanner; 

public class NumberSeries {
	
/*
 Psuedocode: 
 Keeping track of the maximum or minimum number in a series of numbers

Create a method that asks the user to enter the low temperature for each day in June.  The method should return the the lowest temperature.

Hints:
Get your program to work for 5 days before having to enter 30 days
You will probably need a variable to hold the minimum value
What should be the initial value for the variable?
It may help to write pseudo
 
 
 */
	
	public static void main(String[] args) {
		System.out.println(series());
		
	}
	public static int series() {
		Scanner console = new Scanner(System.in); 
		System.out.print("Enter the number of days you want to compare temperatures? ");
		int days = console.nextInt(); 
		System.out.println("Enter the first temperature in June: ");
		int minimum = console.nextInt(); 
		int temp = 0; 
		for (int i = 1; i<=days; i++) {
			temp = console.nextInt(); 
			if (temp < minimum ) {
				minimum = temp; 
			} 
			
		}
		String s = "The lowest temperature in the five days was " + minimum; 
		return minimum; 
		
		
	}

}
