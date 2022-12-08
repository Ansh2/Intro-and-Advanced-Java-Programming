package Chapter2;

//Programming Project #1
public class StarSlashLoop {

	public static final int SIZE = 50;

	public static void main(String[] ars) {
		methodWithoutClassConstant();
		System.out.println();
		System.out.println();
		System.out.println();
		// methodWithClassConstant();
	}

	public static void methodWithoutClassConstant() {

		for (int line = 1; line <= 6; line++) {

			for (int j = 1; j <= (line * -1) + 6; j++) {
				System.out.print("-");
			}
			for (int y = 1; y <= line + 2; y += 2) {
				for (int x = 1; x <= line; x += 2) {
					System.out.print(x);
				}

			}

			for (int j = 1; j <= (line * -1) + 6; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public static void methodWithClassConstant() {

		for (int line = 1; line <= SIZE; line++) {
			for (int star = 1; star <= (line * -1) + SIZE + 1; star++) {
				System.out.print("*");
			}
			for (int space = 1; space <= line; space++) {
				System.out.print(" ");
			}
			for (int forwardslash = 1; forwardslash <= (line * -2) + (2 * SIZE) + 2; forwardslash++) {
				System.out.print("/");
			}
			for (int backslash = 1; backslash <= (line * 2) - 2; backslash++) {
				System.out.print("\\");
			}
			for (int space = 1; space <= line; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= (line * -1) + SIZE + 1; star++) {
				System.out.print("*");
			}
			System.out.println();

		}
		// last line
		for (int space = 1; space <= SIZE + 1; space++) {
			System.out.print(" ");
		}
		for (int backslashline = 1; backslashline <= SIZE * 2; backslashline++) {
			System.out.print("\\");
		}
	}

}
