package Chapter1;

public class helloworld {
	
	public static void main (String[] args) {
		//System.out.println("The value is: " + '/n' + 5);
		System.out.println("The value is: " + '\n' + 5); 	
		System.out.println("Watch out" + " for " + "\"\"" + "" + "escape sequences! ");
		System.out.println("This line ");
		
		//Let's write a loop that prints the square of each number from 1 to 10 
//		for (int x = 1; x<=10; x++) {
	//		System.out.println(x*x); 	
		//		}
		
		int squared = 0;
		for (int i = 0; i<=10; i++) {
			squared = i * i;
			System.out.println(i  + " squared is " + squared);
			
		}
		System.out.println("The last one was " + squared);
		
		
	}	
}