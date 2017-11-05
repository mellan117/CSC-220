/* Adam Mellan */
/* CSC 220     */
/* Project 3   */

import java.util.*;
import java.io.*;

public class FindWords {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        // Create instance variable to call non-static methods
        FindWords findWords = new FindWords();
        
        // Init variables
        Scanner scanMatrix = new Scanner(new File("matrix"));
        Scanner scanDictionary = new Scanner(new File("words"));
        
        ArrayList<String> foundWords = new ArrayList<String>();
        
        int numOfLinesInDictionary = findWords.getNumberOfLines("words");
        int numOfRows = scanMatrix.nextInt();
        int numOfCols = scanMatrix.nextInt();
        
        // Init the 2d matrix array
        char[][] matrix = new char[numOfRows][numOfCols];
        for (int r=0; r<numOfRows; r++) {
            for (int c=0; c<numOfCols; c++) {
                matrix[r][c] = scanMatrix.next().charAt(0);
            }
        }
        
        // Check all words in the dictionary
        for (int x=0; x<numOfLinesInDictionary; x++) {
            // Create word from dictionary
            String dictionaryWord = new String(scanDictionary.next());
            char[] dictWord = dictionaryWord.toCharArray();
            
            // Iterate through the matrix
            for (int r=0; r<numOfRows; r++) {
                int dictWordIndex = 0;
                for (int c=0; c<numOfCols; c++) {
                    // Check if the letter in the word equals a letter in the matrix
                    if (matrix[r][c] == dictWord[dictWordIndex]) {
                        if (dictWordIndex != dictionaryWord.length()-1) {
                            // Increment that word index by one to check the next letter
                            dictWordIndex++;
                        } else {
                            // Found a word
                            // Only add words from the dictionary that are longer than one letter
                            if (dictionaryWord.length() > 1) {
                                foundWords.add(dictionaryWord);
                            }
                            // Reset word index now that we found a word
                            dictWordIndex = 0;
                        }
                    } else {
                        // Word not found yet so reset the word index
                        dictWordIndex = 0;
                    }
                }
            }
        }
        
        // Print the words found
        System.out.println("\nWords Found:\n");
        for (String word : foundWords) {
            System.out.println(word);
        }
        System.out.println();
        
    }
    
    // Determine the number of lines in the file
    public int getNumberOfLines(String textFile) throws FileNotFoundException, IOException {
        // Init variables
        FileReader fileRead = new FileReader(textFile);
        LineNumberReader lineNumRead = new LineNumberReader(fileRead);
        int numOfLines = 0;
        
        while (lineNumRead.readLine() != null) {
            numOfLines++;
        }
        
        return numOfLines;
    }
}