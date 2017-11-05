/* Adam Mellan */
/* CSC 220     */
/* Lab 9       */

public class PairOfDice extends Die {
    // Instance variables
    private Die die1;
    private Die die2;

    // Default construtor
    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    // Die 1 face value setter
    public void setDie1FaceValue(int value) {
        this.die1.faceValue = value;
    }

    // Die 1 face value getter
    public int getDie1FaceValue() {
        return this.die1.faceValue;
    }

    // Die 2 face value setter
    public void setDie2FaceValue(int value) {
        this.die2.faceValue = value;
    }

    // Die 2 face value getter
    public int getDie2FaceValue() {
        return this.die2.faceValue;
    }

    // Roll the dice
    public void rollDice() {
        this.die1.faceValue = (int)(Math.random() * die1.MAX) + 1;
        this.die2.faceValue = (int)(Math.random() * die2.MAX) + 1;
    }

    // Sum of the dice
    public int sum() {
        return this.die1.faceValue + this.die2.faceValue;
    }
}