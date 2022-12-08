package Chapter4;

import java.util.Scanner; 

public class CumulativeMult {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Please input two integers to be multiplied: ");
		int x = keyboard.nextInt(); 
		int y = keyboard.nextInt(); 
		power(x, y); 
	}
	
	public static void power(int base, int multiplier) {
		int product = 1; 
		for (int i = 1; i<= multiplier; i++) {
			product = product * base; 
		}
		System.out.println(product);
		
	}
	public static void sum(int num1, int num2) {
		int anwser; 
		for (int i = 1; i<=num2; i++) {
			
		}
	}

}
