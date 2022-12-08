package Chapter7;

import java.util.Arrays;

public class SelfCheckExercises {

	public static void main(String[] args) {
		int[] list1 = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(swapPairs(list1)));
		String[] list2 = { "belt", "hat", "jelly", "bubble gum" };
		System.out.println(average(list2));
		String[] list3 = { "alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha" };
		System.out.println(palindrome(list3));

	}

	// SelfCheck#21
	public static int[] swapPairs(int[] array) {
		for (int i = 0; i < array.length / 2; i += 2) {
			int y = array[i];
			array[i] = array[i + 1];
			array[i + 1] = y;

		}
		return array;
	}

	// SelfCheck#28
	public static double average(String[] array) {
		int x = 0;
		int conversion = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			conversion = array[i].length();
			x += conversion;
		}
		return (double) (x) / (double) (array.length);

	}

	// SelfCheck#29
	public static boolean palindrome(String[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			if (!(array[i].equalsIgnoreCase(array[(array.length - 1) - i]))) {
				return false;
			}
		}
		return true;

	}

}
