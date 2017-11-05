/* Adam Mellan */
/* CSC220-02   */
/* Lab 4       */

import java.util.Scanner;

public class Calculate {
	public static void main(String args[]) {
		// Declare variables
		Scanner scan = new Scanner(System.in);
		int hr;
		int min;
		int sec;
		int enteredSec;

		// Promt user for a value in seconds
		System.out.println("Enter a number of seconds: ");

		// Assign user input to "enteredSec"
		enteredSec = scan.nextInt();

		// Convert user input to hrs mins and secs
		sec = (enteredSec%60);
		min = ((enteredSec/60)%60);
		hr = (enteredSec/60)/60;

		// Print out the conversion
		System.out.println(enteredSec+" seconds = "+hr+" hours, "+min+" minutes, and "+sec+" seconds.");
	}
}