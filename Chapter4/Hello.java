package Chapter4;

public class Hello {

	public static String swap(String str) {
		String result = ""; 
		String first =  str.charAt(1) + str.substring(0, 1); 
		if (str.length() % 2 == 0) {
			for (int i = 1; i <= (str.length() - 2); i+=2) {
				first = str.substring(i , i + 1) + str.charAt(i - 1); 
				System.out.println(first);
				result = result + first; 
			}
			return result; 
		} else {
			for (int i = 1; i <= (str.length() - 2); i+=2) {
				first = str.substring(i , i + 1) + str.charAt(i - 1); 
				result = result + first; 
			}
			int lastint = str.length() - 1; 
			char conversion = str.charAt(lastint); 
			return result + conversion; 
			
		}

		/*	return str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i);

		return str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i)
				+ str.substring(j + 1, str.length()); */
	}

	public static void main(String args[]) {
		/*String s = "example";

		System.out.println(swap(s, 6, s.length() - 2));
		System.out.println(swap(s, 0, s.length() - 1));

		// Original String doesn't change
		System.out.println(s); */
		
		System.out.println(swap("example"));
	//	System.out.println("example".substring(3, 4) );
		//System.out.println("example".charAt(2) );
	
	}

}
