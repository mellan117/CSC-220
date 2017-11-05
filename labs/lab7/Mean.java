/* Adam Mellan */
/* CSC 220     */
/* Lab 7       */

import java.util.*;

public class Mean {
	public static void main(String[] args) {
		// Init variables
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		double mean1 = 0;
		double mean2 = 0;
		int n = 0;

		// Prompt the user for the value of "n"
		System.out.println("\nEnter the amount of integers in the list: ");
		n = scan.nextInt();

		// Prompt user to populate the list
		System.out.println();
		for (int x=1; x<=n; x++) {
			System.out.println("Enter a number ("+x+"/n): ");
			list.add(scan.nextInt());
		}

		// Populate the 2 smaller lists by even/odd index parameters
		for (int x : list) {
			if (list.indexOf(x) %2 == 0) {
				list1.add(x);
			} else {
				list2.add(x);
			}
		}

		// Print List 1
		System.out.print("\nList 1: ");
		for (int x : list1) {
			System.out.print(x);
			if (x != list1.get(list1.size()-1)) {
				System.out.print(", ");
			}
			mean1 += x;
		}
		// Print List 1 mean
		mean1 /= (double)list1.size();
		System.out.println("\nMean: "+mean1);

		// Print List 2
		System.out.print("\nList 2: ");
		for (int x : list2) {
			System.out.print(x);
			if (x != list2.get(list2.size()-1)) {
				System.out.print(", ");
			}
			mean2 += x;
		}
		// Print List 2 mean
		mean2 /= (double)list2.size();
		System.out.println("\nMean of list 2: "+mean2+"\n");
	}
}