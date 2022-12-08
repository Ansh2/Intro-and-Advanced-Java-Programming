package Chapter5;

import java.util.Random;

public class Die {
	
	public static void main(String[] args) {
		Random r = new Random(); 
		int first = r.nextInt(6) + 1; 
		int second = r.nextInt(6) + 1; 
		int count = 0; 
		while (!(first + second == 7)) {
			System.out.println(first + " + " + second + " = " + (first + second)); 
			first =r.nextInt(6) + 1; 
			second = r.nextInt(6) + 1;
			count++; 
			
		}
		count++; 
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println("You won after " + count + " tries!");
		
	}

}
