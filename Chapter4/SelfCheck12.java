package Chapter4;

import java.util.Scanner;

// Self Check Problem #12
public class SelfCheck12 {
	public static void main(String[] args) {
		int numBills1 = bill("John");
		int numBills2 = bill("Jane");
		System.out.println("John needs " + numBills1 + " bills");
		System.out.println("Jane needs " + numBills2 + " bills");
	}

	public static int bill(String name) {
		Scanner console = new Scanner(System.in);
		System.out.print("How much will " + name + " be spending?\n");
		double amount = console.nextDouble();
		int billAmount = (int) (amount / 20.0);
		if (billAmount * 20.0 < amount) {
			billAmount++;
		}
		return billAmount;
	}

}
