package Chapter2;

public class ComplexFigure {
	
	public static final int SIZE = 20; 

	public static void main(String[] args) {
		//Original Code
		/*
		for(int line = 1; line<=6; line++) {
			for(int backslash = 1 ; backslash<= (line * 2) -2; backslash++) {
				System.out.print("\\");
			}
			for(int one = 1; one <= (-4 * line) + 26; one++) {
				System.out.print("1");
			}
			for(int slash = 1; slash <= (line * 2) -2; slash++) {
				System.out.print("/");
			}
			System.out.println();
		} */
		
	
		
		//With SIZE constant
		for(int line = 1; line<=SIZE; line++) {
			for(int backslash = 1 ; backslash <= (line * 2) - 2; backslash++) {
				System.out.print("\\");
			}
			
			for(int one = 1; one <= (-4 * line) + ((4 * SIZE) + 2); one++) {
				System.out.print("1");
			}
			
			for(int slash = 1; slash <= (line * 2) - 2; slash++) {
				System.out.print("/");
			}
			System.out.println();
			
		}
		


		
		
	}
}
