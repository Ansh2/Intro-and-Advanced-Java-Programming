package Chapter2;

public class Test {
	public static void main(String[] args) {
		/*
		 * System.out.println("The following will be printed " + "in a tabbed format: "
		 * + "\n\tFirst" + "\t" + "= " + 5 * 6 + ", " + "\n\tSecond\t= " + (6 + 4) + ","
		 * + "\n\tThird" + "\t" + "= " + 16.7 + "\n\tFourth\t= " + 10 + 2 + "."); //\t
		 * tabs from prior tab in Eclipse (It is every 8 spaces)
		 */

		for (int i = 1; i <= 5; i++) {
			for (int r = 1; r <= i; r++) {
				System.out.print("*");
			
			}
			System.out.println();

		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		 
		for (int i = 1; i<=7; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
	}

}
