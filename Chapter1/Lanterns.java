//Exercises Pg.57 (#14)
package Chapter1;

public class Lanterns {
	public static void main(String[] args) {
		firstAndSmallestLantern();
		System.out.println();
		secondAndLargestLantern();
		System.out.println();
		thirdAndMediumLantern();
	}
	public static void fiveStarLine() {
		System.out.println("      *****       ");
	}
	public static void nineStarLine() {
		System.out.println("    *********     ");
	}
	public static void thirteenStarLine() {
		System.out.println("  *************   ");
	}
	public static void horizontalDashLine() {
		System.out.println("  * | | | | | *   ");
	}
	public static void firstAndSmallestLantern() {
		fiveStarLine(); 
		nineStarLine(); 
		thirteenStarLine(); 
		
		
	}
	public static void secondAndLargestLantern() {
		firstAndSmallestLantern(); 
		horizontalDashLine(); 
		thirteenStarLine(); 
		firstAndSmallestLantern(); 
		
	}
	public static void thirdAndMediumLantern() {
		firstAndSmallestLantern(); 
		fiveStarLine();
		horizontalDashLine(); 
		horizontalDashLine(); 
		fiveStarLine();
		fiveStarLine();
		
		
		
	}
}
