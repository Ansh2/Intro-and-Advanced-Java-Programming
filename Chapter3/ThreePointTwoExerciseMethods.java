package Chapter3;

public class ThreePointTwoExerciseMethods {

	public static void main(String[] args) {
		// #6
		// int x = largerAbsVal(2, -5);
		// System.out.println(x);

		System.out.println();
		System.out.println();
		System.out.println();

		// #7
		// int y = largerAbsVal2(1, -7, -22);
		// System.out.println(y);

		System.out.println();
		System.out.println();
		System.out.println();

		// #9
		// int z = lastDigit(-728);
		// System.out.println(z);

		System.out.println();
		System.out.println();
		System.out.println();

		// #13
		double a = pay(4.00, 24);
		System.out.println(a);

	}

	// Exercise # 6
	public static int largerAbsVal(int x, int y) {

		int a = Math.abs(x);
		int b = Math.abs(y);
		int c = Math.max(a, b);

		return c;

	}

	// Exercise # 7
	public static int largerAbsVal2(int x, int y, int z) {
		int a = largerAbsVal(x, y);
		return Math.max(a, Math.abs(z));

	}

	// Exercise # 9
	public static int lastDigit(int x) {
		return Math.abs(x) % 10;
	}

	// Exercise # 13
	public static double pay(double salary, double hours) {

		double normalpay = salary * 8;

		double extrahours = hours - 8;

		double newsalary = salary * (double) (3 / 2);

		double extrapay = newsalary * extrahours;

		double overallpay = normalpay + extrapay;

		return overallpay;
	}

	// Teachers #13 Anwswer
	public static double calcTAPay(double rate, int hours) {
		int hoursWorkedRegularTime = Math.min(8, hours);
		int hoursWorkedOverTime = Math.max(0, hours - 8);
		return (hoursWorkedRegularTime * rate) + (hoursWorkedOverTime * (rate * 1.5));
	}

}
