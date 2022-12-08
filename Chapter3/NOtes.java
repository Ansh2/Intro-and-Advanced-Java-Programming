package Chapter3;

public class NOtes {
	
	
	
	public static void printPattern(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printPattern(5); 
	}
}
