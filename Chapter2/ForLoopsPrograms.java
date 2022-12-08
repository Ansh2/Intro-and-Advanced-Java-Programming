package Chapter2;

//Exercises 2-8 

public class ForLoopsPrograms {
	public static void Exercise2() {

		for (int x = 1; x <= 10; x++) {
			System.out.print(x * x);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println();
		// complex way of doing exercise 2
		int number = 1;
		int inc = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.print(number + " ");
			number += inc;
			inc += 2;
		}
		for (int i = 3, j = 1; j < 100; j = j + i, i += 2) {
			System.out.println(j + " ");

		}
		int z;
		int q = 1;
		System.out.print(q);
		System.out.print(" ");

		for (int i = 0, y = 3; i <= 10; i++, y += 2) {

			q = q - 1;
			z = q + y;
			System.out.print((i + z));
			System.out.print(" ");
		}
	}

	public static void Exercise3() {
		int number1 = 1;
		int number2 = 1;
		int number3;
		int pnum;

		System.out.print(number1);
		for (int q = 1; q <= 12; q++) {

			number3 = number1 + number2;

			number1 += number2;
			number3 = number1;
			System.out.print(" " + number3);

		}
		// Fibonacci sequence
		// 1 1 2 3 5 8 13 21....
		int current = 1; // the current number to print
		int previous = 0; // the number before the current number
		int next = 0; // the next number in the series
		System.out.print(current + " ");
		for (int i = 0; i < 10; i++) {
			next = previous + current;
			System.out.print(next + " ");
			previous = current;
			current = next;
		}

	}

	public static void Exercise4() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

	}

	public static void Exercise5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

	}

	public static void Exercise6() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

	}

	public static void Exercise7() {
		for (int i = 1; i <= 5; i++) {
			for (int x = 1; x <= 5 - i; x++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

	}

	public static void Exercise8() {
		for (int i = 1; i <= 5; i++) {
			for (int x = 1; x <= 5 - i; x++) {
				System.out.print(" ");
			}
			for (int j = 2; j <= 1 + i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Exercise2();
		Exercise3();
		Exercise4();
		Exercise5();
		Exercise6();
		Exercise7();
		Exercise8();

	}

}
