package Chapter3;

public class MathMethods {

	public static void main(String[] args) {

		double a = areaOfCircle(5);
		double b = circumferenceOfCircle(12);
		double c = distance(10, 12, 15, 20);
		double d = largerValue(10, 20);
		double e = smallerValue(5, 10);
		double f = roundUp(10.6);
		double g = roundDown(9.4);
		double h = absoluteValue(-10);

		System.out.println(a + "\n" + b + "\n" 
						 + c + "\n" + d + "\n" 
				         + e + "\n" + f + "\n" 
						 + g + "\n" + h + "\n");

	}

	public static double areaOfCircle(double radius) {
		return MyMath.PI * Math.pow(radius, 2);

	}

	public static double circumferenceOfCircle(double radius) {
		return 2 * MyMath.PI * radius;
	}

	public static double distance(double x1, double x2, double y1, double y2) {
		double xDelta = x2 - x1;
		double yDelta = y2 - y1;

		return Math.pow(xDelta, 2) + Math.pow(yDelta, 2);

	}

	public static double largerValue(double x, double y) {

		return Math.max(x, y);

	}

	public static double smallerValue(double x, double y) {

		return Math.min(x, y);
	}

	public static double roundUp(double x) {

		return Math.ceil(x);

	}

	public static double roundDown(double x) {

		return Math.floor(x);

	}

	public static double absoluteValue(double x) {

		return Math.abs(x);

	}
}
