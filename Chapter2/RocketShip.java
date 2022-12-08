package Chapter2;

//Programming Project #6
public class RocketShip {

	public static final int SIZE = 5;

	public static void main(String[] args) {
		methodWithoutClassConstant();
		System.out.println();
		System.out.println();
		System.out.println();
		methodWithClassConstant();
	}

	public static void methodWithClassConstant() {
		topAndBottomOfRocket2();
		plusEqualStarLine2();
		middleOfRocketNumberOne2();
		plusEqualStarLine2();
		plusEqualStarLine2();
		topAndBottomOfRocket2();

	}

	public static void methodWithoutClassConstant() {

	}

	public static void topAndBottomOfRocket2() {
		for (int line = 1; line <= SIZE; line++) {
			for (int x = 1; x <= SIZE - line; x++) {
				System.out.print(" ");
			}
			for (int forwardslash = 1; forwardslash <= line; forwardslash++) {
				System.out.print("/");
			}
			for (int star = 1; star <= 2; star++) {
				System.out.print("*");
			}
			for (int backslash = 1; backslash <= line; backslash++) {
				System.out.print("\\");
			}
			System.out.println();
		}

	}

	public static void plusEqualStarLine2() {
		for (int line = 1; line <= 1; line++) {
			for (int plus = 1; plus <= 1; plus++) {
				System.out.print("+");
			}
			for (int x = 1; x <= SIZE; x++) {
				for (int equal = 1; equal <= 1; equal++) {
					System.out.print("=");
				}
				for (int star = 1; star <= 1; star++) {
					System.out.print("*");
				}
			}
			for (int plus = 1; plus <= 1; plus++) {
				System.out.print("+");
			}
			System.out.println();
		}
	}

	public static void middleOfRocketNumberOne2() {
		int line = 0;
		for (int firstloop = 1; firstloop <= SIZE; firstloop++) {
			for (int verticalLine = 1; verticalLine <= 1; verticalLine++) {
				System.out.print("|");
			}
			for (int dot = 1; dot <= (-1 * firstloop) + 3; dot++) {
				System.out.print(".");
			}
			for (int slash = 1; slash <= firstloop * 2 - 1; slash++) {
				System.out.print("/");
			}
			for (int backslash = 1; backslash <= line; backslash++) {
				System.out.print("\\");
			}
			for (int dot = 1; dot <= (3 * SIZE) + 3; dot++) {
				System.out.print(".");
			}
			for (int slash = 1; slash <= line * 2; slash++) {
				System.out.print("/");
			}
			for (int backslash = 1; backslash <= line; backslash++) {
				System.out.print("\\");
			}
			for (int dot = 1; dot <= (3 * SIZE) + 3; dot++) {
				System.out.print(".");
			}
			for (int verticalLine = 1; verticalLine <= 1; verticalLine++) {
				System.out.print("|");
			}
			System.out.println();
		}
		for (int secondloop = 1; secondloop <= SIZE; secondloop++) {

			for (int verticalLine = 1; verticalLine <= 1; verticalLine++) {
				System.out.print("|");
			}
			for (int dot = 1; dot <= (4 * SIZE) + 3; dot++) {
				System.out.print(".");
			}
			for (int slash = 1; slash <= line * 2; slash++) {
				System.out.print("/");
			}
			for (int backslash = 1; backslash <= line; backslash++) {
				System.out.print("\\");
			}
			for (int dot = 1; dot <= (3 * SIZE) + 3; dot++) {
				System.out.print(".");
			}
			for (int slash = 1; slash <= line * 2; slash++) {
				System.out.print("/");
			}
			for (int backslash = 1; backslash <= line; backslash++) {
				System.out.print("\\");
			}
			for (int dot = 1; dot <= (3 * SIZE) + 3; dot++) {
				System.out.print(".");
			}
			for (int verticalLine = 1; verticalLine <= 1; verticalLine++) {
				System.out.print("|");
			}

		}
	}
}
