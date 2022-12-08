package Chapter1;

public class Picture {
	public static void main(String[] args) {
		roof(); 
		doorFloorAndWalls();
		grass(); 
		road();
	}
	
	public static void roof() {
		System.out.println("          XX               ");
		System.out.println("         X  X              ");
		System.out.println("        X    X             ");
		System.out.println("       X      X            ");
		System.out.println("      X        X           ");
		System.out.println("     X----------X          ");
	}
	
	public static void doorFloorAndWalls() {
		System.out.println("     |          |          ");
		System.out.println("     |          |          ");
		System.out.println("     |     __   |          ");
		System.out.println("     |    |  |  |          ");
		System.out.println("     |    |  |  |          ");
		System.out.println("     |____|__|__|          ");
	}
	
	public static void grass() {
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("****************************");
	}
	
	public static void road() {
		System.out.println("----------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("----------------------------");
	}

}
