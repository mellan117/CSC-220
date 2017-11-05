/* Adam Mellan */
/* CSC 220     */
/* Project 5   */

import java.util.*;
import java.text.DecimalFormat;

public class ExpAcct {
	// Instance variables
	private static DecimalFormat decimalForm = new DecimalFormat("0.00");
    private static ArrayList<ExpressAccount> accountsList = new ArrayList<ExpressAccount>();
    private static Scanner scan = new Scanner(System.in);

	// Main menu logic
    public static void mainMenu() {
		// Init variables
        double scanOption = 0.0;
		int option = 0;

		// Print main menu display to console
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println("1.) Create a new account");
        System.out.println("2.) Log into an existing account");
        System.out.println("3.) Exit the banking system");
        System.out.print("Please enter your selection: ");
        scanOption = scan.nextDouble();

		// Determine if user entered a double instead of an int
		if (scanOption % 1 == 0) {
			option = (int)scanOption;
		} else {
			mainMenu();
		}

		// Menu logic
        switch (option) {
            case 1: {
				// Create a new account
				int accountType;
				System.out.println();
				System.out.println("CHOOSE THE TYPE FOR THE NEW ACCOUNT");
				System.out.println("1.) Student express account");
				System.out.println("2.) Faculty express account");
				System.out.print("Please enter your selection: ");
				accountType = (int)scan.nextDouble();

				if (accountType == 1) {
					StudentExpressAccount newStudAccount = new StudentExpressAccount(accountsList.size(), 1);
					accountsList.add(newStudAccount);

					System.out.println("Created new Student Express account #"+newStudAccount.getAccountNumber()+", balance: $"+decimalForm.format(newStudAccount.getAccountBalance())+", number of meals: "+newStudAccount.getNumOfMeals());

					// Display the sub-menu
					subMenu(newStudAccount.getAccountNumber());
				} else if (accountType == 2) {
					FacultyExpressAccount newFacAccount = new FacultyExpressAccount(accountsList.size(), 2);
					accountsList.add(newFacAccount);

					System.out.println("Created new Faculty Express account #"+newFacAccount.getAccountNumber()+", balance: $"+decimalForm.format(newFacAccount.getAccountBalance())+", number of meals: "+newFacAccount.getNumOfMeals());

					// Display the sub-menu
					subMenu(newFacAccount.getAccountNumber());
				}

                break;
            }
            case 2: {
				// Log in
                // Prompt user for express account number
				System.out.println();
				System.out.print("Enter account number: ");
				int accountNum = (int)scan.nextDouble();


				while (accountNum < 0 || accountNum > accountsList.size()-1) {
					// Display error message and display the main menu again
					System.out.println("Invalid account number (must be between 0 and "+(accountsList.size()-1)+")");
					System.out.println();
					System.out.print("Enter account number: ");
					accountNum = (int)scan.nextDouble();
				}
				
				if (accountsList.get(accountNum).getAccountType() == 1) {
					System.out.println("Welcome back Student Express account #"+accountNum+", balance: $"+decimalForm.format(accountsList.get(accountNum).getAccountBalance())+", number of meals: "+accountsList.get(accountNum).getNumOfMeals());
				} else if (accountsList.get(accountNum).getAccountType() == 2) {
					System.out.println("Welcome back Faculty Express account #"+accountNum+", balance: $"+decimalForm.format(accountsList.get(accountNum).getAccountBalance())+", number of meals: "+accountsList.get(accountNum).getNumOfMeals());
				}
				
				subMenu(accountNum);

                break;
            }
            case 3: {
				// Exit the program
                System.out.println("Exiting the system");
				System.out.println();

                break;
            }
            default: {
                mainMenu();

                break;
            }
        }
    }

	// Sub-menu logic
    public static void subMenu(int accountNum) {
		// Init variables
		double scanOption = 0.0;
		int option = 0;

		// Display the sub-menu
		if (accountsList.get(accountNum).getAccountType() == 1) {
			System.out.println();
			System.out.println("STUDENT EXPRESS ACCOUNT #"+accountNum+", BALANCE: $"+decimalForm.format(accountsList.get(accountNum).getAccountBalance())+", NUMBER OF MEALS: "+accountsList.get(accountNum).getNumOfMeals());
		} else if (accountsList.get(accountNum).getAccountType() == 2) {
			System.out.println();
			System.out.println("FACULTY EXPRESS ACCOUNT #"+accountNum+", BALANCE: $"+decimalForm.format(accountsList.get(accountNum).getAccountBalance())+", NUMBER OF MEALS: "+accountsList.get(accountNum).getNumOfMeals());
		}
		System.out.println("1.) Make a deposit");
		System.out.println("2.) Purchase meals");
		System.out.println("3.) Have meal");
		System.out.println("4.) Log out");
		System.out.print("Please enter your selection: ");
		scanOption = scan.nextDouble();

		// Determine if the user entered a double instead of an int
		if (scanOption % 1 == 0) {
			option = (int)scanOption;
		} else {
			subMenu(accountNum);
		}

		// Sub-menu logic
		switch (option) {
			case 1: {
				// Make a deposit
				// Prompt user to enter deposit amount
        		System.out.print("Enter deposit amount: ");
        		accountsList.get(accountNum).deposit(scan.nextDouble());
				subMenu(accountNum);

				break;
			}
			case 2: {
				// Purchase meals
				// Prompt user to for amount of meals to purchase
				System.out.print("Enter the number of meals you want to purchase: ");
				accountsList.get(accountNum).purchaseMeals((int)scan.nextDouble());
				subMenu(accountNum);

				break;
			}
			case 3: {
				// Have a meal
				accountsList.get(accountNum).haveAMeal();
				subMenu(accountNum);

				break;
			}
			case 4: {
				// Log out
				accountsList.get(accountNum).logOut();
				mainMenu();

				break;
			}
			default: {
				subMenu(accountNum);

				break;
			}
		}
    }

	// ExpAcct main method
    public static void main(String[] args) {
		// Print welcome message and display the main menu
		System.out.println();
        System.out.println("Welcome to the Express Account Company");
        mainMenu();
    }
}