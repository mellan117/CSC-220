/* Adam Mellan */
/* CSC 220     */
/* Lab 9       */

public class RollingDice2 {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();

        dice.setDie1FaceValue(3);
        System.out.println();
        System.out.println("Die1 face value: "+dice.getDie1FaceValue());

        dice.setDie2FaceValue(5);
        System.out.println("Die2 face value: "+dice.getDie2FaceValue());

        dice.rollDice();
        System.out.println("Die1 face value after roll: "+dice.getDie1FaceValue());
        System.out.println("Die2 face value after roll: "+dice.getDie2FaceValue());
        System.out.println("Sum of dice is: "+dice.sum());
        System.out.println();
    }
}