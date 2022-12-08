package Chapter7;

import java.util.*;

public class ClassExamples {

	public static void main(String[] args) {
		int[] result = { 11, 42, -5, 27, 0, 89 };
		int[] finale = reverseArray(result);
		int[] finale2 = reverseArray2(result); 
		System.out.println(Arrays.toString(finale));
		System.out.println(Arrays.toString(finale2));
	}

	public static int[] reverseArray(int[] result) {
		int x = 0;
		int i = result.length - 1; 
		while (x <= result.length - 1 || i >= 0) {
				result[x] = result[i];
				x++;
				i--; 
		}
		return result;
	}
	public static int[] reverseArray2(int[] result) {
		int x = 0; 
		int a = 0;
		int z = (result.length - 1) / 2; 
		int y = result.length - 1; 
		for (int i = 0; i<= result.length - 1; i++) {
			result[z] = result[x]; 
			result[a] = result[y]; 
			x++; 
			y--; 
			z--; 
			a++; 
		}
		
		return result ; 
	}

}
