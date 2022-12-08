package Chapter1;
//Question #15
public class Letters {
	public static void main(String[] args) {
		 letterForJohn(); 
		 System.out.println();
		 letterForDavid(); 
		 System.out.println();
		 letterForMolly(); 
	}
	public static void mainLetter() {
		System.out.print("\tI may have left my phone charger at your house. ");
		System.out.println("Could you check to see if it's there?");
		System.out.println("Would you please mail it back to me if you find it?");
		System.out.println("BTW, I had a really nice time visiting.");
		
	}
	public static void letterForJohn() {
		wordDear(); 
		System.out.println("Dear John");
		mainLetter(); 
		lineForDavidandJohn(); 
		endName(); 
		
	}
	public static void letterForDavid() {
		wordDear(); 
		System.out.println("David");
		mainLetter(); 
		lineForDavidandJohn(); 
		endName(); 
	}
	public static void letterForMolly() {
		wordDear(); 
		System.out.println("Molly");
		mainLetter(); 
		System.out.println("Thanks for letting me stay at your house during my visit.");
		System.out.println("See you soon.");
		endName(); 
	}
	public static void lineForDavidandJohn() {
		System.out.println("Great seeing you, ");
		
	}
	public static void endName() {
		System.out.println("Jesse");
	}
	public static void wordDear() {
		System.out.print("Dear ");
	}

}
