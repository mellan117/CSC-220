/* Adam Mellan */
/* CSC 220     */
/* Lab 10      */

public class Person {
    // Class variables
    protected String name;
    protected String address;

    // Default constructor
    public Person() {
        this.name = "none";
        this.address = "none";
    }
    
    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Name accessor
    public String getName() {
        return this.name;
    }

    // Address mutator
    public void setAddress(String address) {
        this.address = address;
    }

    // Address accessor
    public String getAddress() {
        return this.address;
    }

    // Class toString method
    public String toString() {
        return "To String:\nName: "+this.name+"\nAddress: "+this.address;
    }
}