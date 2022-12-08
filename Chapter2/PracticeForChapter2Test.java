package Chapter2;

public class PracticeForChapter2Test {
	public static final int CLASS_CONSTANT_EXERCISE_10 = 6; 
	public static final int SIZE = 4; 
	
	public static void main(String[] args) {
		// Exercise #2
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");

		}
		System.out.println();
		System.out.println();
		System.out.println();

		// Exercise #4
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		// Exercise #5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		// Exercise #6

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// Exercise #7
		for (int i = 1; i <= 5; i++) {
			for (int space = 1; space <= 5 - i; space++) {
				System.out.print(" ");
			}
			for (int num = 1; num <= 1; num++) {
				System.out.print(i);

			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// Exercise #8

		for (int i = 1; i <= 5; i++) {
			for (int space = 1; space <= 5 - i; space++) {
				System.out.print(" ");
			}
			for (int num = 1; num <= i; num++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// Exercise # 9
		// In the program called ExerciseNumberNine

		// Exercise #10

		for (int j = 1; j <= CLASS_CONSTANT_EXERCISE_10 + 2; j++) {
			for (int x = 1; x <= CLASS_CONSTANT_EXERCISE_10; x++) {
				System.out.print(" ");
			}
			System.out.print("|");
			
		}
		System.out.println();
		for (int i = 1; i <= CLASS_CONSTANT_EXERCISE_10 + 2; i++) {
			for (int x = 1; x<= CLASS_CONSTANT_EXERCISE_10; x++) {
				System.out.print(x);
			}
			System.out.print("0");
			
		}
	}
}
