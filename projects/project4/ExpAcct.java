/* Adam Mellan */
/* CSC 220     */
/* Project 4   */

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
                createAccount();

                break;
            }
            case 2: {
                logIn();

                break;
            }
            case 3: {
                exitBank();

                break;
            }
            default: {
                mainMenu();

                break;
            }
        }
    }

	// Creates an express account and adds it to an arraylist
    public static void createAccount() {
		ExpressAccount newAccount = new ExpressAccount(accountsList.size());
		accountsList.add(newAccount);
		
		// Display the sub-menu
		subMenu(newAccount.getAccountNumber());
    }

	// Log the user into the system
    public static void logIn() {
		// Init variables
		boolean accountExists = false;
		int accountNum = -1;

		// Prompt user for express account number
		System.out.println();
		System.out.print("Enter account number: ");
		accountNum = (int)scan.nextDouble();

		// Iterate through all the express acounts
		for (ExpressAccount existingAccount : accountsList) {
			// Check if that express account exists
			if (existingAccount.getAccountNumber() == accountNum) {
				System.out.println("Welcome back Student Express account #"+existingAccount.getAccountNumber()+", balance: $"+decimalForm.format(existingAccount.getAccountBalance())+", number of meals: "+existingAccount.getNumOfMeals());
				accountExists = true;

				break;
			}
		}

		if (accountExists) { 	// if that express account exists display the sub-menu
			subMenu(accountNum);
		} else { 				// else display error message and display the main menu again
			System.out.println("Express account: "+accountNum+" does not exist.");
			mainMenu();
		}
	}

	// Terminate the program
    public static void exitBank() {
		System.out.println("Exiting the system");
		System.out.println();
    }

	// Sub-menu logic
    public static void subMenu(int accountNum) {
		// Init variables
		double scanOption = 0.0;
		int option = 0;

		// Print that express account's info
		for (ExpressAccount account : accountsList) {
			if (account.getAccountNumber() == accountNum) {
				System.out.println();
				System.out.println(account);

				break;
			}
		}

		// Display the sub-menu
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
				makeDeposit(accountNum);

				break;
			}
			case 2: {
				purchaseMeals(accountNum);

				break;
			}
			case 3: {
				haveMeal(accountNum);

				break;
			}
			case 4: {
				logOut();

				break;
			}
			default: {
				subMenu(accountNum);

				break;
			}
		}
    }

	// Deposit method
    public static void makeDeposit(int accountNum) {
		// Init variables
        double deposit = 0;

		// Prompt user to enter deposit amount
        System.out.print("Enter deposit amount: ");
        deposit = scan.nextDouble();

		if (deposit > 0) {	// Check if deposit amount is positive
			for (ExpressAccount account : accountsList) {	// Iterate through all of the express accounts
				if (account.getAccountNumber() == accountNum) {
					// Make deposit into that express account
					account.setAccountBalance(account.getAccountBalance() + deposit);

					// Check if there should be a bonus
					if (deposit > account.getBaseAmtForBonus()) {
						account.setAccountBalance(account.getAccountBalance() + ((int)(deposit / account.getRewardLevel()) * account.getRewardAmt()));
					}
				}
			}
		} else {
			// Print error message if deposit is negative
			System.out.println("The deposit must be a positive amount.");
		}

		// Display the sub-menu
		subMenu(accountNum);
    }

	// Buy meals
    public static void purchaseMeals(int accountNum) {
		// Init variables
		int numOfMealsToBuy = 0;
		
		// Prompt user to for amount of meals to purchase
		System.out.print("Enter the number of meals you want to purchase: ");
		numOfMealsToBuy = (int)scan.nextDouble();

		if (numOfMealsToBuy > 0) {	// Check if user purchased a positive amount of meals
			for (ExpressAccount account : accountsList) {	// Iterate through all of the express accounts
				if (account.getAccountNumber() == accountNum) {

					if (numOfMealsToBuy * account.getPricePerMeal() > account.getAccountBalance()) {	// Check that that express account has enough money to purchase x number of meals
						// Max amount of meals that express account can purchase
						int maxNumOfMeals = (int)account.getAccountBalance() / (int)account.getPricePerMeal();

						// Purchase the max amount of meals
            			account.setAccountBalance(account.getAccountBalance() % account.getPricePerMeal());
						account.setNumOfMeals(account.getNumOfMeals() + maxNumOfMeals);

						// Print error message and new balance
            			System.out.println("Not enough balance for "+numOfMealsToBuy+" meals");
            			System.out.println("Purchased "+maxNumOfMeals+" meals, New balance $"+decimalForm.format(account.getAccountBalance()));
        			} else {
						// Purchase x amount of meals
            			account.setAccountBalance(account.getAccountBalance() - (numOfMealsToBuy * account.getPricePerMeal()));
						account.setNumOfMeals(account.getNumOfMeals() + numOfMealsToBuy);
            			System.out.println("Purchased "+numOfMealsToBuy+" meals with $"+account.getPricePerMeal()+" per meal New balance $"+decimalForm.format(account.getAccountBalance()));
        			}

					break;
				}
			}
		} else {
			// Print error message if user wants a negative amount of meals
			System.out.println("You must purchase a positive amount of meals.");
		}		

		// Display the sub-menu
		subMenu(accountNum);
    }

	// Eat a meal
    public static void haveMeal(int accountNum) {
		for (ExpressAccount account : accountsList) {	// Iterate through all of the express accounts
			if (account.getAccountNumber() == accountNum) {
				if (account.getNumOfMeals() > 0) {	// Check if that express account has any meals
					// Eat meal
					account.setNumOfMeals(account.getNumOfMeals() - 1);
				} else {
					// Print error message if that express account has no meals left
					System.out.println("No meals left on your account. Please purchase meals first.");
				}

				break;
			}
		}

		// Display the sub-menu
		subMenu(accountNum);
    }

	// Logout and display the main menu
    public static void logOut() {
        System.out.println("Goodbye!");
		mainMenu();
    }

	// ExpAcct main method
    public static void main(String[] args) {
		// Print welcome message and display the main menu
		System.out.println();
        System.out.println("Welcome to the Express Account Company");
        mainMenu();
    }
}