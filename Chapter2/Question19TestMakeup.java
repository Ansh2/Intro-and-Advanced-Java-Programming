package Chapter2;

public class Question19TestMakeup {

	public static void main(String[] args) {
		int i = 6;
		for (int line = 1; line <= 10; line += 2) {

			for (int j = 1; j <= (line * -1) + i; j++) {
				System.out.print("-");
			}
			for (int x = 1; x <= line; x++) {
				System.out.print(line);
			}

			for (int j = 1; j <= (line * -1) + i; j++) {
				System.out.print("-");
			}
			i++;
			System.out.println();

		}
	}

}
