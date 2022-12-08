package Chapter1;
public class myPoint {
	
	private double myX, myY; 
	
	public myPoint() {
		
	}
	public myPoint(double x, double y) {
		myX = x; 
		myY = y; 
	}
	
	
	
	public double getMyX() {
		return myX;
	}
	public void setMyX(double myX) {
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}
	
	public myPoint midpoint(myPoint other) {
		double xmid = (this.myX + other.myX) / 2.0; 
		double ymid = (this.myY + other.myY) / 2.0; 
		return new myPoint(xmid, ymid); 
	}
	
	public static void main(String[] args) {
		myPoint one = new myPoint(1, 3); 
		myPoint two = new myPoint(2, 5); 
		System.out.println(one.midpoint(two));
		
	}

}
