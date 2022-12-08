package Chapter4;

import java.util.Scanner;

import jdk.internal.org.jline.utils.OSUtils; 

public class ProgrammingProjects {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		roman(console); 
		
	}
	//# 1
	public static void roman(Scanner console) {
		System.out.print("Enter a number you would like to convert with: ");
		int number = console.nextInt(); 
		
		for (int i = 1; i<=number; i++) {
			if (number == i) {
			}
			
		}
		
		
	}
	// #5
	public static void compute(Scanner console) {
		System.out.println("Welcome to the computation program for your grades. Please enter the following.");
		System.out.print("Enter the number of homework assignments: ");
		int assignments = console.nextInt(); 
		System.out.println("Enter the points earned for each test below: ");
		double points = 0; 
		
		
		for (int i = 0; i<=assignments; i++) {
			System.out.print("Homework #" + (i + 1) + "points earned: ");
			double pointsrecur = console.nextDouble(); 
			System.out.println("Assignemtn " + (i+ 1) + "points: ");
			maximumpoints += console.nextDouble(); 
		}
		
		
		//double averageofhomeworkassignments = points / assignments; 
		System.out.print("Enter the midterm score: ");
		double midgrade = console.nextDouble(); 
		earnedpoints += console.nextDouble(); 
		System.out.println("Enter the maximum points for midterm: ");
		double maximummidgrade = console.nextDouble(); 
		maximumPoints += console.nextDouble(); 
		
		
		
		System.out.print("Enter the final exam score maximum points: ");
		maximumPOints += console.nextDouble(); 
		
		System.out.print("Enter whether each exame was curved: ");
		String curve = console.next(); 
		curve = curve.toLowerCase(); 
		if (curve.charAt(0) == 'y') {
			System.out.println("Then, enter the amount each test was curved: ");
			
		}
	}

}
