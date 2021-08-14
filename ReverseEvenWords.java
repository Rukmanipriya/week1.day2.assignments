package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)

		/*
		 * Pseudo Code:
		 * 
		 * Declare the input as Follow String test = "I am a software tester"; a) split
		 * the words and have it in an array b) Traverse through each word (using loop)
		 * c) find the odd index within the loop (use mod operator)
		 * 
		 * d)split the words and have it in an array
		 * 
		 * e)print the even position words in reverse order using another loop (nested
		 * loop) f) Convert words to character array if the position is even else print
		 * the word as it is(concatenate space at the end).
		 * 
		 * 
		 */
		String test = "I am a software tester";
		String[] stringArray = test.split(" ");
		String reverseEvenWords = "";
		for (int i = 0; i < stringArray.length; i++) {
			if ((i + 1) % 2 == 0) {
				String reverse = "";
				for (int j = stringArray[i].length() - 1; j >= 0; j--) {
					reverse = reverse + stringArray[i].charAt(j);
				}
				reverseEvenWords = reverseEvenWords + reverse;
			} else {
				reverseEvenWords = reverseEvenWords + stringArray[i];
			}
			reverseEvenWords = reverseEvenWords + " ";
		}
		System.out.println(reverseEvenWords);
	}

}
