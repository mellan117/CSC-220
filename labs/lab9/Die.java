/* Adam Mellan */
/* CSC 220     */
/* Lab 9       */

import java.util.*;

public class Die {
    // Instance variables
    protected final int MAX = 6;
    protected int faceValue;

    // Default constructor
    public Die() {
        faceValue = 1;
    }

    // Rolls the die and returns the result
    public int roll() {
        this.faceValue = (int)(Math.random() * this.MAX) + 1;
        return faceValue;
    }

    // Face value setter
    public void setFaceValue(int value) {
        this.faceValue = value;
    }

    // Face value getter
    public int getFaceValue() {
        return this.faceValue;
    }

    public String toString() {
        String result = Integer.toString(this.faceValue);
        return result;
    }
}