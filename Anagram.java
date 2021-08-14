package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 * 
		 * Declare a String String text1 = "stops"; Declare another String String text2
		 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
		 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
		 * the arrays has same value
		 * 
		 */

		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] cArray1 = text1.toCharArray();
			char[] cArray2 = text2.toCharArray();
			Arrays.sort(cArray1);
			Arrays.sort(cArray2);
			boolean result = Arrays.equals(cArray1, cArray2);
			if (result) {
				System.out.println(text1+ " is Anagram of "+text2);
			} else {
				System.out.println(text1 + " is not Anagram of "+text2);
			}
		}

	}

}
