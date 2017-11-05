/* Adam Mellan */
/* CSC220-02   */
/* Project 2   */

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class WordUnscrambler {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		// Create instance variable to call non-static methods
		WordUnscrambler wordUnscrambler = new WordUnscrambler();

		int numOfLinesInFile = wordUnscrambler.getNumberOfLines();
		String word = new String(wordUnscrambler.getRandomWord(numOfLinesInFile));

		// Make sure the word is not too short or too long
		while (word.length() < 4 || word.length() > 10) {
			word = wordUnscrambler.getRandomWord(numOfLinesInFile);
		}
		
		// Scramble the word
		String scrambledWord = new String(wordUnscrambler.scrambleTheWord(word));

		// Start the game
		wordUnscrambler.runGame(word, scrambledWord);
	}

	// Determine the number of lines in the file
	public int getNumberOfLines() throws FileNotFoundException, IOException {
		// Init variables
		FileReader fileRead = new FileReader("words.txt");
		LineNumberReader lineNumRead = new LineNumberReader(fileRead);
		int numOfLines = 0;

		while (lineNumRead.readLine() != null) {
			numOfLines ++;
		}

		return numOfLines;
	}

	// Randomly select a word from the file
	public String getRandomWord(int numOfLines) throws FileNotFoundException, IOException {
		// Init variables
		Scanner scan = new Scanner(new File("words.txt"));
		String word = new String();
		int randLine = 1 + (int)(Math.random()*numOfLines);

		// Iterate through the file line by line
		for (int x=1; x<=numOfLines; x++) {
			// If the random word is on the current line:
			if (x == randLine) {
				// Found the random word
				word = scan.next();

				break;
			}
			word = scan.next();
		}

		return word;
	}

	// Display the dashes, indexes, word, and dashes
	public void displayWordGraphics(String word) {
		// Init variables
		String dashes = new String();
		String wordIndexes = new String();

		// Create a string with the word's indexes
		for (int x=0; x<=word.length()-1; x++) {
			wordIndexes += x;
		}

		// Create a string with 4 more dashes than the word's length
		for (int x=1; x<=wordIndexes.length()+4; x++) {
			dashes += "-";
		}

		// Print the dashes, indexes, word, and dashes
		System.out.println(dashes);
		System.out.println("  "+wordIndexes);
		System.out.println("  "+word);
		System.out.println(dashes);
	}

	// Scramble the random word
	public String scrambleTheWord(String word) {
		// Init variables
		char[] wordArray = word.toCharArray();
		int randNumOfCharSwaps = 2 + (int)(Math.random()*10);

		// Perfrom a random number of swaps
		for (int x=1; x<= randNumOfCharSwaps; x++) {
			// Init random indexes
			int randCharIndexA = 0 + (int)(Math.random()*word.length()-1);
			int randCharIndexB = 0 + (int)(Math.random()*word.length()-1);
			char temp = wordArray[randCharIndexA];

			// Check if random indexes are the same, if so reassign index B
			while (randCharIndexA == randCharIndexB) {
				randCharIndexB = 0 + (int)(Math.random()*word.length()-1);
			}

			// Swap letters
			wordArray[randCharIndexA] = wordArray[randCharIndexB];
			wordArray[randCharIndexB] = temp;
		}

		// Return scrambled word
		String scrambledWord = new String(wordArray);
		return scrambledWord;
	}

	// Swap a pair of letters that the user picks
	public String swapLetters(String scrambledWord, int indexA, int indexB) {
		// Init variables
		char[] wordArray = scrambledWord.toCharArray();
		char temp = wordArray[indexA];

		// Swap letters
		wordArray[indexA] = wordArray[indexB];
		wordArray[indexB] = temp;

		// Return new word
		String newWord = new String (wordArray);
		return newWord;
	}

	public void runGame(String originalWord, String scrambledWord) {
		// Create instance variable to call non-static methods
		WordUnscrambler wordUnscrambler = new WordUnscrambler();

		// Init variables
		Scanner scan = new Scanner(System.in);
		int numOfAttempts = 0;
		int userChoice = 0;

		// Continue game until the user unscrambles the word
		while (!scrambledWord.equals(originalWord)) {
			// Display the scrambled word and options
			System.out.println("\nScrambled Word");
			wordUnscrambler.displayWordGraphics(scrambledWord);

			System.out.println("Enter 1 to swap letters.");
			System.out.println("Enter 2 to solve.");
			System.out.println("Enter 3 to quit.");
			userChoice = scan.nextInt();

			if (userChoice == 1) {
				// Option 1
				int indexA = -1;
				int indexB = -1;
				int count = 0;

				// Check if indexes are valid
				// If invalid enter new valid indexes
				while(indexA<0 || indexA>scrambledWord.length()-1 || indexB<0 || indexB>scrambledWord.length()-1) {
					count ++;
					if (count>1) {
						System.out.println("\n*** Invalid index *** \n*** Please enter valid indexes ***");
					}

					System.out.println("\nEnter the first index:");
					indexA = scan.nextInt();
					System.out.println("Enter the second index:");
					indexB = scan.nextInt();
				}

				// Swap letters and overwrite scrambled word
				scrambledWord = wordUnscrambler.swapLetters(scrambledWord, indexA, indexB);

				// Keep track of attempts
				numOfAttempts ++;
			} else if (userChoice == 2) {
				// Option 2
				System.out.println("\nUnscrambled Word");
				wordUnscrambler.displayWordGraphics(originalWord);
				System.exit(0);
			} else if (userChoice == 3) {
				// Option 3
				System.out.println("\n\n\tProgram Terminated\n\n");
				System.exit(0);
			}
		}

		System.out.println("\n***\n\nCongradulations! You have successfully unscrambled the word \""+originalWord+"\" in "+numOfAttempts+" steps.\n\n***\n");
	}
}