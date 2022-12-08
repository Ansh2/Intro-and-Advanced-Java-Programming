package Chapter2;

public class Exercsie9 {

	public static void main(String[] args) {
//	newMethod(); 
		for (int j = 1; j <= 40; j++) {
			System.out.print("-");
		}
		System.out.println();
		for (int j = 1; j <= 10; j++) {
			System.out.print("_-^-");
		}
		System.out.println();
		for (int x = 1; x <= 2; x++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j);
				System.out.print(j);

			}
			System.out.print("00");
		}
		System.out.println();
		for (int j = 1; j <= 40; j++) {
			System.out.print("-");
		}
	}
	public static void newMethod() {
		for (int i = 1; i <= 4; i++) {
			for (int x = 1; x <= 40; x++) {
				System.out.print("-");
			}
			System.out.println();
			for (int y = 1; y <=40; y++) {
				System.out.print("_-^-");
			}
			System.out.println();
		}
	}
}
