package Chapter1;

public class Shining {
	
	public static void main(String[] args) {
		lineThird(); 
	}
	public static void lineX() {
		System.out.println("All work and no play makes Jack a dull boy. ");
	}
	public static void lineFirst() {
		lineX(); 
		lineX(); 
		lineX(); 
		lineX(); 
		lineX(); 
		lineX();
		lineX(); 
		lineX(); 
		lineX(); 
		lineX(); 
		lineX();
	}
	public static void lineSecond() { 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
		lineFirst(); 
	}
	public static void lineThird() {
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond(); 
		lineSecond();
		
	}
}
