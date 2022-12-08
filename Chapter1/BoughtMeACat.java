package Chapter1;
// Programming Project #6
public class BoughtMeACat {
	   public static void main(String[] args) {
	    	para1(); 
	    	System.out.println();
	    	para2(); 
	    	System.out.println();
	    	para3(); 
	    	System.out.println();
	    	para4();
	    	System.out.println();
	    	para5(); 

	    }
	    public static void fiddleLine() {
	    	System.out.println("Cat goes fiddle-i-fee");
	    }
	    public static void chimmyChuckLastTwoLines() {
	    	System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	    	fiddleLine(); 
	    	
	    } 
	    public static void quackQuackLastThreeLines() {
	    	System.out.println("Duck goes quack, quack,");
	    	chimmyChuckLastTwoLines();
	    	
	    }
	    public static void hissyHissyLastFourLines() {
	    	System.out.println("Goose goes hissy, hissy,");
	    	quackQuackLastThreeLines(); 
	    }
	    public static void baaBaaLastFiveLines() {
	    	System.out.println("Sheep goes baa, baa,");
	    	hissyHissyLastFourLines(); 
	    }
	    
	    public static void para1() {
	        System.out.println("Bought me a cat and the cat pleased me,");
	        System.out.println("I fed my cat under yonder tree.");
	       fiddleLine(); 
	    }
	    public static void para2() {
	        System.out.println("Bought me a hen and the hen pleased me,");
	        System.out.println("I fed my hen under yonder tree.");
	        chimmyChuckLastTwoLines(); 
	    }
	    public static void para3() {
	        System.out.println("Bought me a duck and the duck pleased me,");
	        System.out.println("I fed my duck under yonder tree.");
	        quackQuackLastThreeLines(); 
	    }
	    public static void para4() {
	        System.out.println("Bought me a goose and the goose pleased me,");
	        System.out.println("I fed my goose under yonder tree.");
	        hissyHissyLastFourLines(); 
	    }
	    public static void para5() { 
	    	System.out.println("bought me a sheep and the sheep pleased me,");
	    	System.out.println("I fed my sheep under yonder tree.");
	    	baaBaaLastFiveLines(); 

	    }

}
