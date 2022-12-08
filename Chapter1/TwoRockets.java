//Exercises Pg. 56: #11
package Chapter1;

public class TwoRockets {
	
	public static void main(String[] args) {
		topsAndBottomsOfRockets();
		plusLine();
		verticalBorders();
		plusLine(); 
		topsAndBottomsOfRockets();
		flagOfUnitedStates();
		plusLine();
		verticalBorders();
		plusLine();
		topsAndBottomsOfRockets();
	}
	public static void topsAndBottomsOfRockets() {
		System.out.println("    /\\       /\\      "); 
		System.out.println("   /  \\     /  \\     ");
		System.out.println("  /    \\   /    \\    ");	
	}
	public static void plusLine() {
		System.out.println(" +------+ +------+    ");
	}
	public static void verticalBorders() {
		System.out.println(" |      | |      |    ");
		System.out.println(" |      | |      |    ");
	}
	public static void flagOfUnitedStates() {
		System.out.println(" |United| |United|    ");
		System.out.println(" |States| |States|    ");	
	}
//ANWSER TO QUESTION IN TEXTBOOK
/* 
  What redundancy can you eliminate using static methods?
  You can eliminate the redundancy of the top and the bottom of the rocket. Also, you can eliminate the redundancy 
  of the plus lines and vertical dashes. S

   What redundancy cannot be eliminated?
   The redundancy that you cannot eliminate is the the two exact same rockets because their is no possible way of adding 
   code to the right using print statements. 
   
 
 */
}
