package Chapter5;

public class Exercise1To3 {

	public static void main(String[] args) {
		// # 1
		// showTwos(7);
		// # 2
		gcd(10, 15);
		// #3
		// toBinary(2);
	}

	// Exercise #1
	public static void showTwos(int num) {
		System.out.print(num + " = ");
		while (num % 2 == 0) {
			System.out.print("2 * ");
			num /= 2;
		}
		System.out.println(num);

	}

	// Exercise #2
	public static void gcd(int num1, int num2) {
		int loopcount = 1;
		int holdlargestfactor = 1;
		int minimum = Math.min(num1, num2);
		while (loopcount <= minimum) {
			if (num1 % loopcount == 0 && num2 % loopcount == 0) {
				holdlargestfactor = loopcount;

			}
			loopcount++;
		}
		System.out.println(holdlargestfactor);

	}

	// Exercise #3 (Did not get)
	public static void toBinary(int x) {
		String binary = "";
		while (x < 0) {
			int remainder = x % 2;
			binary = remainder + binary;
			x = x / 2;
		}
		System.out.println(binary);

	}

}
