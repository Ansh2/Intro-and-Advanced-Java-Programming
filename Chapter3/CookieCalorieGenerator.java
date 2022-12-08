package Chapter3;

import java.util.Scanner; 

public class CookieCalorieGenerator {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter the number of cookies you ate between 0 - 40: ");
		int cookies = keyboard.nextInt();

		int serving = cookies / 4;
		int calories = serving * 300;

		System.out.println("The total calories that you consumed are " + calories + " calories");
	}
	

}

