/* Adam Mellan */
/* CSC 220     */
/* Project 5   */

import java.text.DecimalFormat;

public abstract class ExpressAccount {
	// Instance variables
    protected int accountNumber;
    protected int numberOfMeals;
	protected int accountTypeName;
    protected double accountBalance;
	protected double pricePerMeal;
	protected double baseAmtForBonus;
	protected boolean eligibleForBonus;
	private DecimalFormat decimalForm = new DecimalFormat("0.00");

	// Constructor
    public ExpressAccount(int accNumber, int accType) {
        this.accountNumber = accNumber;
		this.accountTypeName = accType;
        this.accountBalance = 0.00;
        this.numberOfMeals = 0;
		this.eligibleForBonus = false;
    }

	// Account number accessor
    public int getAccountNumber() {
        return this.accountNumber;
    }

	// Account balance mutator
    protected void setAccountBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

	// Account balance accessor
    public double getAccountBalance() {
        return this.accountBalance;
    }

	// Bonus minimum mutator
	protected void setBaseAmtForBonus(double minDeposit) {
		this.baseAmtForBonus = minDeposit;
	}

	// Bonus minimum accessor
    public double getBaseAmtForBonus() {
        return this.baseAmtForBonus;
    }

	// Meal price mutator
	protected void setPricePerMeal(double mealPrice) {
		this.pricePerMeal = mealPrice;
	}

	// Meal price accessor
    public double getPricePerMeal() {
        return this.pricePerMeal;
    }

	// Number of meals mutator
	protected void setNumOfMeals(int numberOfMeals) {
		this.numberOfMeals = numberOfMeals;
	}

	// Number of meals accessor
    public int getNumOfMeals() {
        return this.numberOfMeals;
    }

	// Account type mutator
	public void setAccountType(int type) {
		this.accountTypeName = type;
	}

	// Account type accessor
	public int getAccountType() {
		return this.accountTypeName;
	}

	// Make deposit
	abstract void deposit(double amount);

	// Purchase meals
	public void purchaseMeals(int numOfMealsToBuy) {
		// Init variables
		int maxNumOfMealsToBuy = (int)this.accountBalance / (int)this.pricePerMeal;

		if (numOfMealsToBuy > 0) {
			// Check if user has enough balance for x amount of meals
			if (numOfMealsToBuy < maxNumOfMealsToBuy) {
				this.accountBalance -= numOfMealsToBuy * this.pricePerMeal;
				this.numberOfMeals += numOfMealsToBuy;

				System.out.println("Purchased "+numOfMealsToBuy+" meals with $"+this.pricePerMeal+" per meal New balance $"+decimalForm.format(this.accountBalance));
			} else {
				this.accountBalance -= maxNumOfMealsToBuy * this.pricePerMeal;
				this.numberOfMeals += maxNumOfMealsToBuy;

				System.out.println("Not enought balance for "+numOfMealsToBuy+" meals");
				System.out.println("Purchased "+maxNumOfMealsToBuy+" meals, New balance $"+decimalForm.format(this.accountBalance));
			}
		} else {
			// Print error message if user wants a negative amount of meals
			System.out.println("You must purchase a positive amount of meals.");
		}
	}

	// Have a meal
	public void haveAMeal() {
		if (this.numberOfMeals > 0) {
			this.numberOfMeals--;
		} else {
			// Print error message if that express account has no meals left
			System.out.println("No meals left on your account. Please purchase meals first.");
		}
	}

	// Log out
	public void logOut() {
		System.out.println("Goodbye!");
	}

	// ExpressAccount's toString method
    public String toString() {
        return "EXPRESS ACCOUNT #"+this.accountNumber+", BALANCE: $"+decimalForm.format(this.accountBalance)+", NUMBER OF MEALS: "+this.numberOfMeals;
    }
}