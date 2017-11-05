/* Adam Mellan */
/* CSC 220     */
/* Lab 10      */

public class CourseTaken {
    // Class variables
    private String courseName;
    private int grade;

    // Constructor
    public CourseTaken(String courseName, int grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    // Grade accessor
    public int getGrade() {
        return this.grade;
    }

    // Class toString method
    public String toString() {
        return "To String:\nCourse Name: "+this.courseName+"\nGrade: "+this.grade;
    }
}