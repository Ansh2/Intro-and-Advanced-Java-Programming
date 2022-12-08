package Chapter5;

import java.util.Random;

public class ExerciseMethod6 {

	public static void main(String[] args) {
		Random r = new Random();
		makeGuesses(r);

	}

	// Exercise #6
	public static void makeGuesses(Random r) {
		int firstrandom = r.nextInt(50) + 1;
		System.out.println("guess = " +  firstrandom);
		int num = firstrandom;
		while (num <= 48) {
			num = r.nextInt(50) + 1;
			System.out.println("guess = " + num);

		}
	}

}
