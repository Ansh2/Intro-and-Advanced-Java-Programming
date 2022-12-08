package Chapter7;

import java.util.Arrays; 

public class EnhancedForLooop {
	
	/*
	 Write a method, findLongest, that takes an array of Strings and returns the String that has the most characters. 
	  Use an enhanced for loop in this exercise.
For example:
String[] words = {"This","is","the","forest","primeval"};
String longest = findLongest(words);
System.out.println("The longest word is: "+longest);

Output:
	The longest word is: primeval

Syntax:
for(dataType elementVariable : array)
	block or statement

dataType – The type of the array
elementVariable – A variable that holds the value of the current iteration’s element.
array – The array in which we are iterating through.

The type of the temporary variable must be compatible with the element type of the array.
	 */
	
	public static void main(String[] args) {
		String[] words = {"This","is","the","forest","primeval"};
		String longest = findLongest(words);
		System.out.println(longest);
		
	}
	public static String findLongest(String[] words) {
		String longestString = words[0]; 
		int length = longestString.length(); 
		for (int i = 1; i<=words.length - 1; i++) {
			String string2 = words[i]; 
			int length2 = string2.length();
			if (length2 > length) {
				longestString = string2; 
			}
		}
		return longestString; 
		
	}

}
