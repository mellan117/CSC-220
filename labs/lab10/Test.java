/* Adam Mellan */
/* CSC 220     */
/* Lab 10      */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("Adam", "2000 Pennington Road");
        System.out.println();
		System.out.println(s);
        s.addCourseGrade("CSC 220", 95);
        s.addCourseGrade("CSC 99", 98);
        s.addCourseGrade("MAT 96", 86);
        s.addCourseGrade("CRI 100", 82);
        s.addCourseGrade("FSP 161", 92);
        s.addCourseGrade("IDS 102", 97);

        System.out.println();
        System.out.println("Grades:");
        s.printGrades();
        System.out.println("Average: "+s.getAverageGrade());

        Teacher t = new Teacher("Danese", "123 Pennington Road");
        System.out.println();
        System.out.println(t);

        t.setCourse1("Physics 101");
        t.setCourse2("Astronomy 101");
        
        System.out.println();
        System.out.println("Professor Danese teaches:");
        System.out.println(t.getCourse1());
        System.out.println(t.getCourse2());
        System.out.println();
    }
}