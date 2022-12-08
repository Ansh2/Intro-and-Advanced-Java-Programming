package Chapter1;

public class StarFigures {
	public static void main(String[] args) {
		firstStar();
		secondStar();
		thirdStar();
	}
	public static void crossStar() {
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	public static void linesOfStars() {
		System.out.println("*****");
		System.out.println("*****");
		
	}
	public static void verticalStars() {
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
		
	}
	public static void firstStar() {
		linesOfStars();
		crossStar();
		System.out.println();
		System.out.println();
		
		
	}
	public static void secondStar() {
		linesOfStars();
		crossStar();
		linesOfStars();
		System.out.println();
		System.out.println();
	}
	public static void thirdStar() {
		verticalStars();
		linesOfStars();
		crossStar();
	}
}

