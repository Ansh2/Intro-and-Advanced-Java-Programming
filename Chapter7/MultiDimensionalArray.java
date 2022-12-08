package Chapter7;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[][] x = new int[3][3];
		double[][] last = calculation(x, console);
		for (int rows = 0; rows < last.length; rows++) {
			for (int columns = 0; columns < last[rows].length; columns++) {
				System.out.print(last[rows][columns] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] calculation(int[][] list1, Scanner console) {

		for (int rows = 0; rows < list1.length; rows++) {
			System.out.println("Please input grades for student #" + (rows + 1));
			for (int columns = 0; columns < list1[rows].length; columns++) {
				list1[rows][columns] = console.nextInt();

			}

		}
		double[][] list2 = new double[list1.length][2];
		int sum = 0;
		for (int rows = 0; rows < list1.length; rows++) {
			for (int columns = 0; columns < list1[rows].length; columns++) {
				sum = sum + list1[rows][columns];
			}
			list2[rows][0] = sum;
			list2[rows][1] = (double) (sum) / list1[0].length; // Tells how many columns there are
			sum = 0;

		}
		return list2;

	}
}
