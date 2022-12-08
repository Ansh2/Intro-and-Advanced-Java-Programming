package Chapter7;

import java.util.Scanner;

public class MarathonWithArrays {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int runners = 3;
		String[] array1 = new String[runners];
		int[] array2 = new int[runners];
	/*	System.out.print("Time: ");
		int leasttime = console.nextInt();
		array2[0] = leasttime;
		System.out. print("Name: ");
		String least = console.next();
		array1[0] = least;
		int greatesttime = 0;
		String greatest = ""; */
		
		int sum = 0;
		for (int i = 0; i <= array2.length - 1; i++) {
			System.out.print("Time: ");
			array2[i] = console.nextInt();
			System.out.print("Name: ");
			array1[i] = console.next(); 
			sum += array2[i];

		}
/*
		int average = sum / runners;
		int hours = average / 3600;
		int conversion = average - (hours * 3600);
		int minutes = conversion / 60;
		int seconds = minutes % 60;

		String finaltimemin = "" + minutes;
		String finaltimesec = "" + seconds;

		if (minutes <= 9) {
			finaltimemin = "0" + finaltimemin;
		}
		if (seconds <= 9) {
			finaltimesec = "0" + finaltimemin;
		}
*/
		for (int i = array2.length - 1; i < 0; i--) {
			System.out.println(array2[i]);
			System.out.println(array1[i]);
		}
//
//		System.out.println("Fastest Runner: " + least + ":   Time: " + leasttime);
//		System.out.println("Slowest Runner: " + greatest + ":   Time: " + greatesttime);
//		System.out.println("Average Time: " + hours + ":" + finaltimemin + ":" + finaltimesec);

	}

}
