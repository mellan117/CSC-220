/* Adam Mellan */
/* CSC220-02   */
/* Lab 6       */

import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		// Declare variables
		Scanner scan = new Scanner(System.in);
		String[] wordAndIndicesArray = new String[3];
		String wordAndIndices;
		String word;
		int indexA, indexB;

		// Prompt user to input a word AND 2 numbers on the SAME line
		System.out.println("\nEnter a word and two numbers: ");
		wordAndIndices = scan.nextLine();

		// Split the input from a string to a string and 2 ints
		wordAndIndicesArray = wordAndIndices.split(" ");
		word = wordAndIndicesArray[0];
		indexA = Integer.parseInt(wordAndIndicesArray[1]);
		indexB = Integer.parseInt(wordAndIndicesArray[2]);

		// Swap the characters
		char[] charArrayOfWord = word.toCharArray();
		char tempLetter = charArrayOfWord[indexA];
		charArrayOfWord[indexA] = charArrayOfWord[indexB];
		charArrayOfWord[indexB] = tempLetter;
		String swappedWord = new String(charArrayOfWord);

		// Print the original and swapped version
		System.out.println("\nOriginal Word: "+word);
		System.out.println("Swapped Word: "+swappedWord+"\n");
	}
}