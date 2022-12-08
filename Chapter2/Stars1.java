package Chapter2;

public class Stars1 {

	public static void main(String[] args) {
		box(10, 3);
	}

	public static void box(int width, int height) {
		line(width);
		for (int i = 1; i <= height - 2; i++) {
			System.out.print("*");
			for (int space = 1; space <= width - 2; space++) {
				System.out.print(" ");
				
			}
			System.out.print("*\n");
		}

		line(width);
	}

	public static void line(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
