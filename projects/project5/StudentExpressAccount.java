/* Adam Mellan */
/* CSC 220     */
/* Project 5   */

import java.text.DecimalFormat;

public class StudentExpressAccount extends ExpressAccount {
	// Instance variables
	private double rewardLevel;
    private double rewardAmt;
	private static DecimalFormat decimalForm = new DecimalFormat("0.00");

	// Constructor
	public StudentExpressAccount(int accountNum, int accountType) {
		super(accountNum, accountType);
		this.setBaseAmtForBonus(500.0);
		this.setPricePerMeal(10.0);
		this.setRewardLevel(200.0);
		this.setRewardAmt(2.0);
	}

	// Reward level mutator
	public void setRewardLevel(double rwdLvl) {
		this.rewardLevel = rwdLvl;
	}

	// Reward level accessor
	public double getRewardLevel() {
		return this.rewardLevel;
	}
	
	// Reward amount mutator
	public void setRewardAmt(double rwdAmt) {
		this.rewardAmt = rwdAmt;
	}

	// Reward amount accessor
	public double getRewardAmt() {
		return this.rewardAmt;
	}

	// Make deposit
	public void deposit(double amount) {
		if (amount > 0) {
			double bonus = 0.0;

			//////// Bonus code /////////

			if (!this.eligibleForBonus) {	// Check if account is already eligible for bonus
				if (amount >= this.baseAmtForBonus) {	// Check if account should start recieving bonus
					// Determine bonus amount
					int numOfRewardLvls = (int)amount / (int)this.rewardLevel;
					bonus = numOfRewardLvls * this.rewardAmt;

					this.accountBalance += bonus;
					this.eligibleForBonus = true;	// Make account eligible for future bonus
				}
			} else {
				if (amount >= this.rewardLevel) {
					// Determine bonus amount
					int numOfRewardLvls = (int)amount / (int)this.rewardLevel;
					bonus = numOfRewardLvls * this.rewardAmt;

					this.accountBalance += bonus;
				}
			}
		
			// Add deposit to balance
			this.accountBalance += amount;

			System.out.println("Received bonus of $"+bonus);
			System.out.println("Deposit $"+amount+" New balance $"+decimalForm.format(this.accountBalance));
		} else {
			// Print error message if deposit is negative
			System.out.println("The deposit must be a positive amount.");
		}
	}
}