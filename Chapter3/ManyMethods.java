package Chapter3;

// Exercises 1-5
public class ManyMethods {
	public static void main(String[] args) {
		printNumbers(10);
		System.out.println();
		System.out.println();
		printPowersof2(10);
		System.out.println();
		System.out.println();
		printPowersOfN(-2, 8);
		System.out.println();
		System.out.println();
		printSquare(3, 7);
		System.out.println();
		System.out.println();
		printGrid(4, 6);
	}

	public static void printNumbers(int number) {
		// Exercise #1
		for (int i = 1; i <= number; i++) {
			System.out.print("[" + i + "] ");
		}

	}

	public static void printPowersof2(int num) {
		// Exercise #2
		int power = 2;
		int x = 1;
		System.out.print("1 ");
		for (int z = 1; z <= num; z++) {
			System.out.print(x * power + " ");
			x = x * 2;
		}
	}

	public static void printPowersOfN(int base, int exponent) {
		// Exercise #3
		int power = base;
		int x = 1;
		System.out.print("1 ");
		for (int z = 1; z <= exponent; z++) {
			System.out.print(x * power + " ");
			x = x * base;
		}

	}

	public static void printSquare(int min, int max) {
		// Exercise #4
		// Minimum = 3 |  Maximum = 7
		for (int i = min; i <= max; i++) {
			for (int x = i; x <= max; x++) {
				System.out.print(x);
			}
			for (int y = min; y < i; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

	public static void printGrid(int rows, int columns) {
		// Exercise #5
		for (int i = 1; i <= rows; i++) {

			int newnumber = i;

			for (int x = 1; x <= columns; x++) {
				
				newnumber = i + rows * (x - 1);
				System.out.print(newnumber + " ");

			}
			System.out.println();
		}

	} 	

}