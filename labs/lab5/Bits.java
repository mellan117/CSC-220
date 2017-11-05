/* Adam Mellan */
/* CSC220-02   */
/* Lab5        */

public class Bits {
	public static void main(String args[]) {
		int count = 0;
		int n;

		n = Integer.parseInt(args[0]);

		while(n>=1) {
			n /= 2;
			count++;
		}

		System.out.println("\nYou need to divide "+args[0]+", "+count+" times before "+args[0]+" is less than 1.\n");
	}
}