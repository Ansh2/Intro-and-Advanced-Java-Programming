package Chapter2;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 2; i<=10; i++) {
			for (int j = 1; j<= 10; j++) {
				System.out.print((j * i));
				System.out.print(" ");
			}
				System.out.println();
		}
	}
}
