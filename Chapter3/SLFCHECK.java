package Chapter3;

import java.util.Scanner; 

public class SLFCHECK {
	
	public static void main(String[] args) {
		fsef(); 
	}
	
	
	public static void firstprolem() {
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("What would you like the lowest integer and highest integer to be for the sum?");
		int low = keyboard.nextInt(); 
		int high = keyboard.nextInt(); 
		int sum = 0; 
		for (int i = low; i<=high; i++) {
			sum+=i; 
		}
		System.out.println("Your sum is "  + sum);
		
	}
	public static void fsef() {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("What is your phrase?");
		String phrase = keyboard.nextLine(); 
		System.out.println("How many times do you want to repeat your phrase?");
		int repeat = keyboard.nextInt(); 
		 
		for (int i = 1; i<=repeat; i++) {
			System.out.println(phrase);
		}
		
	}

		
}
