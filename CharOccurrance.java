package week1.day2.assignments;

public class CharOccurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences

		int count = 0;

		// convert the string into char array
		char[] cArray = str.toCharArray();
		// get the length of the array
		int l = cArray.length;
		// traverse from 0 till the array length
		for (int i = 0; i < l; i++) {
			// Check the char array has the particular char in it
			if (cArray[i] == 'e') {
				// if is has increment the count

				count = count + 1;
			}

		}
		// print the count out of the loop
		System.out.println("The letter e occurrence is: " + count);
	}

}
