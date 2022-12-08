package Chapter3;

public class MyMathTester {

	public static void main(String[] args) {
		double pi = MyMath.PI;
		int x = MyMath.addOne(2);
		double y = MyMath.divide(8.0, 4.0);
		double a = MyMath.square(10);
		int b = MyMath.sum(5, 10);

		System.out.println(x + "\n" + y + "\n" + a + "\n" + b);
		System.out.println(pi);
	}

}
