package Chapter3;

public class Reverse {

	public static void main(String[] args) {

		System.out.println(reverseIt("example"));

	}

	public static String reverseIt(String str) {
		int x = str.length();
		int y = x / 2;
		String result = ""; 
		for (int i = 0; i <= str.length() - 1; i+=2) {
			
			String resultx = d.substring(i, i+1); 
			result = resultx + result; 
		}

		
		String z = d.substring(0, y);
		String b = d.substring(y, x);

		return b + z;

	}
}
