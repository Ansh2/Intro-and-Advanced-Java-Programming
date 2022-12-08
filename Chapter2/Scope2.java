package Chapter2;

public class Scope2 {

	public static void showI() {
		int i = 1;
		System.out.print(i);
	}

	public static void main(String[] args) {
		int x = 25;
		int j = 5; 
		for (int i = 0; i < 100; i++) {
			//showI();
			System.out.println(i);
		}
		
		System.out.println(j);
	}

}
