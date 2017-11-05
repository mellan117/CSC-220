/* Adam Mellan */
/* CSC 220     */
/* Lab 9       */

public class Dog {
    // Instance variables
    private String name;
    private int age;

    // Default constructor
    public Dog() {
        this.name = "none";
        this.age = 0;
    }

    // Constructor
    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    // Name setter
    public void setName(String dogName) {
        this.name = dogName;
    }

    // Name getter
    public String getName() {
        return this.name;
    }

    // Age setter
    public void setAge(int dogAge) {
        this.age = dogAge;
    }

    // Age getter
    public int getAge() {
        return this.age;
    }

    // Compute age in human years
    public int computeDogAgeInHumanYears() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog name: "+this.name+" | Dog age: "+this.age+" | Age in human years: "+this.computeDogAgeInHumanYears();
    }
}