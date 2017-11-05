/* Adam Mellan */
/* CSC 220     */
/* Lab 10      */

import java.util.*;

public class Student extends Person {
    // Class variables
    private int numCourses;
    private ArrayList<CourseTaken> courses;

    // Constructor
    public Student(String name, String address) {
        this.courses = new ArrayList<CourseTaken>();
        this.numCourses = 0;
        this.name = name;
        this.address = address;
    }

    // Add courses
    public void addCourseGrade(String course, int grade) {
        CourseTaken newCourse = new CourseTaken(course, grade);
        this.courses.add(newCourse);
        this.numCourses += 1;
    }

    // Average grade
    public double getAverageGrade() {
        int avg = 0;
        for (CourseTaken course : this.courses) {
            avg += course.getGrade();
        }

        return avg / this.courses.size();
    }

    // Print grades
    public void printGrades() {
        for(CourseTaken course : this.courses) {
            System.out.println(course.getGrade());
        }
    }

    // Class toString method
    public String toString() {
        return super.toString();
    }
}