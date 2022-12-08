package Chapter3;

public class ThreePointThreeMethods {

	public static void main(String[] args) {
		// #17
		System.out.println(padString("hello", 8));
		System.out.println();
		System.out.println();
		// #18
		vertical("hey now");
		System.out.println();
		System.out.println();
		// #19
		System.out.println(printReverse("hello there!"));
	}

	// Exercise #17
	public static String padString(String s, int x) {
		int a = s.length();
		int b = x - a;

		String d = "";
		for (int i = 1; i <= b; i++) {
			d = d + " ";
		}

		return s + d;

	}

	// Exercise #18
	public static void vertical(String s) {
		int a = s.length();
		s.substring(a);

		char y = 'j'; // Primative Type, not object

		for (int i = 0; i <= a - 1; i++) {
			y = s.charAt(i);
			System.out.print(y + "\n");
		}

	}

	// Exercise #19
	public static String printReverse(String s) {
		int a = s.length();
		String d = "";

		for (int i = a - 1; i >= 0; i--) {
			d = d + s.charAt(i);
		}
		return d;
	}

}