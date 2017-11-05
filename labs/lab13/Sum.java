/* Adam Mellan */
/* CSC 220     */
/* Lab 13      */

import java.util.*;

public class Sum {
    
    // Sum of 1 to n = (1 to n/2) + ((n/2)+1 to n)
    public static int sumN(int from, int upto) {
        // Init variables
        int result;
        
        if (from == upto) 
            result = upto;
         else 
            result = sumN(from, ((from+upto)/2))+sumN((((from+upto)/2)+1), upto);
        
        // Trace the calculation
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        // Init variables
        Scanner scan = new Scanner(System.in);
        int n = 0;

        // Verification loop
        while (n < 1) {
            System.out.print("Please enter a number greater than 1: ");
            n = (int)scan.nextDouble();
        }

        // Run and print the calculation
        System.out.println("The sum from 1 to "+n+" is: "+sumN(1, n));
    }
}