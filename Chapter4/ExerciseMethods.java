package Chapter4;

import java.util.Scanner;

public class ExerciseMethods {
	public static void main(String[] args) {
		// # 1
		double a = fractionSum(5);
		System.out.println(a);
		// # 2
		String b = repl("hello", 3);
		System.out.println(b);
		// # 3
		String c = season(3, 14);
		System.out.println(c);
		// # 4
		int d = daysInMonth(4);
		System.out.println(d);
		// # 5
		double e = pow(3, 4);
		System.out.println(e);
		// # 6
		printRange(2, 7);
		System.out.println();
		// # 7
		xo(10);

	}

	// Exercise #1
	public static double fractionSum(int n) {
		double fraction = 1;
		for (int i = 2; i <= n; i++) {
			fraction = fraction + 1 / (double) i;
		}

		return fraction;
	}

	// Exercise #2
	public static String repl(String name, int repititions) {
		String word = "";
		for (int i = 1; i <= repititions; i++) {
			word = word + name;

		}
		return word;
	}

	// Exercise #3
	public static String season(int month, int day) {
		String season = "";
		if (((month >= 3 && month <= 6) || (month == 6 && day <= 15)) && (month == 3 && day >= 16)) { // 3/16 - 6/15
			season = "spring";
		} else if ((month >= 6 && month <= 9) || (month == 9 && day <= 15)) {
			season = "summer";
		} else if ((month >= 9 && month <= 12) || (month == 12 && day <= 15)) {
			season = "fall";
		} else {
			season = "winter";

		}
		return season;
	}

	// Exercise #4
	public static int daysInMonth(int month) {
		int daysinmonth = 0;
		if (month == 2) { // February
			daysinmonth = 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			daysinmonth = 30;
		} else {
			daysinmonth = 31;
		}

		return daysinmonth;

	}

	// Exercise #5
	public static int pow(int base, int exponent) {
		int output = 1;
		for (int i = 1; i <= exponent; i++) {
			output *= base;

		}
		return output;

	}

	// Exercise #6
	public static void printRange(int num1, int num2) {
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else
			for (int j = num1; j >= num2; j--) {
				System.out.print(j + " ");
			}

	}

	// Exercise # 7 (Did not get)
	public static void xo(int size) {
		int a = 0;
		int b = size - 1;
		for (int line = 1; line <= size; line++) {
			for (int j = 1; j <= size; j++) {
				if (line == j || j == size - line + 1) {
					System.out.print("x");
				} else {
					System.out.print("o");
				}

			}
			System.out.println();

		}
	}
}