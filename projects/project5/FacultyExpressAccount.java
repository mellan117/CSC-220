/* Adam Mellan */
/* CSC 220     */
/* Project 5   */

import java.text.DecimalFormat;

public class FacultyExpressAccount extends ExpressAccount {
	// Instance variables
	private double rewardPct;
	private static DecimalFormat decimalForm = new DecimalFormat("0.00");

	// Constructor
	public FacultyExpressAccount(int accountNum, int accountType) {
		super(accountNum, accountType);
		this.setBaseAmtForBonus(0.0);
		this.setPricePerMeal(8.0);
		this.setRewardPct(0.01);
	}

	// Reward percent mutator
	public void setRewardPct(double percent) {
		this.rewardPct = percent;
	}

	// Reward percent accessor
	public double getRewardPct() {
		return this.rewardPct;
	}

	// Make deposit
	public void deposit(double amount) {
		double bonus = 0.0;

		//////// Bonus code /////////
		
		if (amount > 0) {
			if (amount >= this.baseAmtForBonus) {
				bonus = amount * this.rewardPct;

				this.accountBalance += bonus;
			}
		} else {
			// Print error message if deposit is negative
			System.out.println("The deposit must be a positive amount.");
		}

		// Add deposit to balance
		this.accountBalance += amount;

		System.out.println("Received bonus of $"+bonus);
		System.out.println("Deposit $"+amount+" New balance $"+decimalForm.format(this.accountBalance));
	}
}