package Chapter5;

public class ClassNotes {

	public static void main(String[] args) {
		printPrimes(50);
		isEven(10); 
	}

	public static int countFactors(int num1) {
		int factors = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				factors++;
			} 
		}
		return factors;

	}

	public static void printPrimes(int max) {
		if (max < 2) {
			
			
		} else {
			System.out.print(2);
			for (int i = 3; i <= max; i++) {
				if (countFactors(i) == 2) {
					System.out.print(", " 	+ i);
				}
			}
		}
	}
	//7/30/2020
	public static boolean isEven(int num) {
		return (num % 2 == 0); 
		
	}

}
