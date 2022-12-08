package Chapter4;

public class countFactorClass {
	
	public static void main(String[] args) {
		System.out.println(countFactors(24));
	}
	public static int countFactors(int num1) {
	int factors = 0; 
		for (int i = 1; i<=num1; i++) {
			if (num1 % i == 0) {
				factors++; 
			} else {
				
			}
			
		}
		return factors; 
		
	}


}
