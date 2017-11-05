/* Adam Mellan */
/* CSC 220     */
/* Project 4   */

import java.text.DecimalFormat;

public class ExpressAccount {
	// Instance variables
    private final double baseAmtForBonus = 500.0;
    private final double rewardLevel = 200.0;
    private final double rewardAmt = 2.0;
    private final double pricePerMeal = 10.0;
    private int accountNumber;
    private int numberOfMeals;
    private double accountBalance;
	private DecimalFormat decimalForm = new DecimalFormat("0.00");

	// Default constructor
    public ExpressAccount() {
        this.accountNumber = 0;
        this.accountBalance = 0.00;
        this.numberOfMeals = 0;
    }

	// Constructor
    public ExpressAccount(int accNumber) {
        this.accountNumber = accNumber;
        this.accountBalance = 0.00;
        this.numberOfMeals = 0;
    }

	// Account number accessor
    public int getAccountNumber() {
        return this.accountNumber;
    }

	// Account balance mutator
    public void setAccountBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

	// Account balance accessor
    public double getAccountBalance() {
        return this.accountBalance;
    }

	// Bonus minimum accessor
    public double getBaseAmtForBonus() {
        return this.baseAmtForBonus;
    }

	// Reward level accessor
	public double getRewardLevel() {
		return this.rewardLevel;
	}

	// Bonus amount accessor
	public double getRewardAmt() {
		return this.rewardAmt;
	}

	// Meal price accessor
    public double getPricePerMeal() {
        return this.pricePerMeal;
    }

	// Number of meals mutator
	public void setNumOfMeals(int numberOfMeals) {
		this.numberOfMeals = numberOfMeals;
	}

	// Number of meals accessor
    public int getNumOfMeals() {
        return this.numberOfMeals;
    }

	// ExpressAccount's toString method
    public String toString() {
        return "EXPRESS ACCOUNT #"+this.accountNumber+", BALANCE: $"+decimalForm.format(this.accountBalance)+", NUMBER OF MEALS: "+this.numberOfMeals;
    }
}