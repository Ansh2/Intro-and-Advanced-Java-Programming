package Chapter3;

import java.util.Scanner; 

public class AscendingNumbers {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter two value from 2 to 20: ");
		int firstvalue = keyboard.nextInt(); 
		int secondvalue = keyboard.nextInt(); 
		
		int x = Math.min(firstvalue, secondvalue); 
		int y = Math.max(firstvalue, secondvalue); 
		
		for (int i = x ; i<=y; i++) {
			System.out.println(i + ": " + (i * i * i));
		}	
		
	}
 
}
