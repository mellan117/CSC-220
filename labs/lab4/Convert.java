/* Adam Mellan */
/* CSC220-02   */
/* Lab 4       */

public class Convert {
	public static void main(String args[]) {
		// Declare Variables
		double mile;
		double kilo;
		
		// Prompt user to enter a value in miles
		System.out.println("Miles: ");     

		// Assign the user value to "mile"  
		mile = Double.parseDouble(args[0]);

		// Convert miles to kilometers
		kilo = mile * 1.60935;

		// Print the conversion
		System.out.println(mile + " miles = " + kilo + " kilometers.");
	}
}