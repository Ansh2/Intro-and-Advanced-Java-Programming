package Chapter4;

import java.util.Scanner;

public class PracticeForTest {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// printTriangleType(5, 1, 10);
		// System.out.println(average(3, 5));
		// System.out.println(pow2(2, 0));
		// System.out.println(getGrade(-100));
		//printPalindrome(console);
		//System.out.println(swapPairs("example")); 
		System.out.println(wordCount("hellow world I am here"));
	}

	// Exercise #12
	public static void printTriangleType(int side1, int side2, int side3) {
		if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
			System.out.println("IllegalArgumentException");
		} else {
			if (side1 == side2 && side2 == side3) {
				System.out.print("equilateral");
			} else if (side1 == side2 || side2 == side3 || side1 == side3) {
				System.out.println("isosceles");
			} else if (side1 != side2 && side2 != side3) {
				System.out.println("scalene");
			}
		}
	}

	// Exercise #13
	public static double average(int num1, int num2) {

		double average = (double) (num1 + num2) / 2;
		return average;

	}

	// Exercise # 14
	public static double pow2(double base, int exponent) {
		double output = 1;
		if (exponent < 0) {
			int frac = Math.abs(exponent);
			for (int i = 1; i <= frac; i++) {
				output *= base;

			}
			output = 1 / output;
			return output;
		} else if (base < 0 && exponent > 0) {
			for (int i = 1; i <= exponent; i++) {
				output *= base;

			}
			return output;
		} else if (base == 0) {
			output = 0;
			return output;

		} else {
			output = 1;
			return output;
		}

	}

	// Exercise #15
	public static double getGrade(int grade) {
		double gpa = 0.0;
		double startinggpa = 0.8;
		if (grade >= 60 && grade <= 62) {
			gpa = 0.7;
			return gpa;
		} else if (grade >= 95 && grade <= 100) {
			gpa = 4.0;
			return gpa;
		} else if (grade < 60 && grade >= 0) {
			return gpa;
		} else {
			for (int i = 63; i <= 94; i++) {
				if (grade == i) {
					gpa = startinggpa;

				}
				startinggpa += 0.1;

			}
			return gpa;
		}

	}

	// Exercise #16
	public static void printPalindrome(Scanner console) {
		System.out.println("Welcome to the palindrome game!");
		System.out.print("Please enter a word: ");
		String word = console.next();
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			result = word.charAt(i) + result;

		}
		if (word.equalsIgnoreCase(result)) {
			System.out.println("The entered word is a palindrome");
		} else {
			System.out.println("The entered word is not a palindrome");
		}

	}

	// Exercise #17
	public static String swapPairs(String str) {
		String result = ""; 
		String first =  str.charAt(1) + str.substring(0, 1); 
		if (str.length() % 2 == 0) {
			for (int i = 1; i <= (str.length() - 2); i+=2) {
				first = str.substring(i , i + 1) + str.charAt(i - 1); 
				System.out.println(first);
				result = result + first; 
			}
			return result; 
		} else {
			for (int i = 1; i <= (str.length() - 2); i+=2) {
				first = str.substring(i , i + 1) + str.charAt(i - 1); 
				result = result + first; 
			}
			int lastint = str.length() - 1; 
			char conversion = str.charAt(lastint); 
			return result + conversion; 
			
		}

	}
	// #18 
	public static int wordCount(String name) {
		int count = 0;  
		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) == ' ') {
				count++; 
			} else if (name.charAt(0) == ' ') {
				return count; 
			}
			
		} 
		return count;
		
	}
	// #20 
	
	
}
