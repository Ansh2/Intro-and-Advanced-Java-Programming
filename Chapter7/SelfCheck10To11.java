package Chapter7;

public class SelfCheck10To11 {

	public static void main(String[] args) {
		int[] list1 = { 1, 5, 2, 2, 7 };
		System.out.println(max(list1));
		int[] list2 = { 1, -2, 4, -4, 9, -6, 16, -8, 25, -10 };
		System.out.println(average(list2));
	}

	// SelfCheck#10
	public static int max(int[] x) {
		int max = x[0];
		for (int i = 1; i <= x.length - 1; i++) {
			if (max < x[i]) {
				max = x[i];
			}

		}
		return max;

	}

	// SelfCheck#11
	public static double average(int[] x) {
		int sumofall = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			sumofall += x[i];
		}

		return (double) sumofall / (double) x.length;

	}
}