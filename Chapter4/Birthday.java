package Chapter4;

import java.util.Scanner;
//Programming Project 6
public class Birthday {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		dateOfBirthday(console);

	}

	public static void dateOfBirthday(Scanner console) {
		System.out.print("Person #1 - Enter your birthday: ");
		int month = console.nextInt();
		int day = console.nextInt();

		System.out.print("Person #2 - Enter your birthday: ");
		int month2 = console.nextInt();
		int day2 = console.nextInt();

		System.out.print("Enter today's date: ");
		int todaysmonth = console.nextInt();
		int todaysday = console.nextInt();

		int firstdaysinmonth = day;

		int firstdaysinmonth2 = day2;

		int daysintodaysmonth = ExerciseMethods.daysInMonth(todaysmonth) - todaysday;
		int daysintodaysmonthx = 0;
		int daysintodaysmonth2 = ExerciseMethods.daysInMonth(todaysmonth) - todaysday;

		if (todaysmonth < month) {
			for (int i = todaysmonth + 1; i < month; i++) {
				daysintodaysmonthx = ExerciseMethods.daysInMonth(i);
				daysintodaysmonth = daysintodaysmonth + daysintodaysmonthx;
			}
			daysintodaysmonth = daysintodaysmonth + firstdaysinmonth;
		} else {
			for (int i = todaysmonth + 1; i <= 12; i++) {
				daysintodaysmonthx = ExerciseMethods.daysInMonth(i);
				daysintodaysmonth = daysintodaysmonth + daysintodaysmonthx;
			}
			for (int i = 1; i < month; i++) {
				daysintodaysmonthx = ExerciseMethods.daysInMonth(i);
				daysintodaysmonth = daysintodaysmonth + daysintodaysmonthx;
			}
			daysintodaysmonth += firstdaysinmonth;
		}

		System.out.println(daysintodaysmonth + " is the days left before person 1's birthday");

		if (todaysmonth < month2) {
			for (int i = todaysmonth + 1; i < month2; i++) {
				daysintodaysmonthx = ExerciseMethods.daysInMonth(i);
				daysintodaysmonth2 = daysintodaysmonth2 + daysintodaysmonthx;
			}
			daysintodaysmonth2 += firstdaysinmonth2;
		} else {
			for (int i = todaysmonth + 1; i <= 12; i++) {
				daysintodaysmonthx = ExerciseMethods.daysInMonth(i);
				daysintodaysmonth2 = daysintodaysmonth2 + daysintodaysmonthx;
			}
			for (int i = 1; i < month2; i++) {
				daysintodaysmonthx = ExerciseMethods.daysInMonth(i);
				daysintodaysmonth2 = daysintodaysmonth2 + daysintodaysmonthx;
			}
			daysintodaysmonth2 += firstdaysinmonth2;
		}

		System.out.println(daysintodaysmonth2 + " is the days left before person 2's birthday");

		if (month > month2) {
			System.out.println("Person 1's birthday is sooner");
		} else if (month < month2) {
			System.out.println("Person 2's birthday is sooner");
		} else if (day > day2) {
			System.out.println("Person 1's birthday is sooner");
		} else if (day < day2) {
			System.out.println("Person 2's birthday is sooner");
		}

	}

}
