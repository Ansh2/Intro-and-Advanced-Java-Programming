package Chapter7;

import java.util.Scanner;

public class WeatherWithArrays {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many days' temperatures? ");
		int days = console.nextInt();
		int[] arrayvar = new int[days]; //intialized as an object
		int sum = 0;
		int numofdays = 0;
		for (int i = 0; i <= arrayvar.length - 1; i++) {
			System.out.print("Please enter high temperature for day " + (i + 1) + ": ");
			int num = console.nextInt();
			arrayvar[i] = num;
			sum += num;

		}

		double average = (double)(sum) / days;
		for (int i = 0; i <= arrayvar.length - 1; i++) {
			if (arrayvar[i] > average) {
				numofdays ++; 
			}
		}
		System.out.println("Average temp = " + average);
		System.out.println(numofdays + " days were above average.");

	}

}
