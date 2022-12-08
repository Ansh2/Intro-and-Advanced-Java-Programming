//Exercise Pg.56: #12
package Chapter1;

public class FightSong {
	
	public static void main(String[] args) {
		chorus(); 
		System.out.println();
		firstStanza(); 
		System.out.println();
		secondStanza(); 
		System.out.println();
		chorus(); 
		
	}
	public static void chorus() {
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}
	public static void firstStanza() {
		chorus(); 
		System.out.println("You're the best,");
		System.out.println("In the West.");
		chorus(); 
	}
	public static void secondStanza() {
		chorus(); 
		System.out.println("You're the best,");
		System.out.println("in the West.");
	}

}
