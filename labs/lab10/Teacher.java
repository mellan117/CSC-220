/* Adam Mellan */
/* CSC 220     */
/* Lab 10      */

public class Teacher extends Person {
    // Class variables
    private String course1;
    private String course2;

    // Constructor
    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
        this.course1 = "none";
        this.course2 = "none";
    }

    // Course 1 mutator
    public void setCourse1(String course) {
        this.course1 = course;
    }

    // Course 1 accessor
    public String getCourse1() {
        return this.course1;
    }

    // Course 2 mutator
    public void setCourse2(String course) {
        this.course2 = course;
    }

    // Course 2 accessor
    public String getCourse2() {
        return this.course2;
    }

    // Class toString method
    public String toString() {
        return super.toString();
    }
}