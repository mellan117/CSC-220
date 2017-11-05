/* Adam Mellan */
/* CSC 220     */
/* Lab 9       */

import java.util.*;

public class Kennel {
    public static void main(String[] args) {
        // Init dog1 and call the "toString" method
        Dog dog1 = new Dog("Thor", 4);
        System.out.println();
        System.out.println(dog1);

        // Reassign a name
        dog1.setName("Athena");
        System.out.println("New dog name: "+dog1.getName());

        // Reassign age
        dog1.setAge(5);
        System.out.println("New dog age: "+dog1.getAge());

        // Compute and print the dog's age in human years
        System.out.println("New dog age in human years: "+dog1.computeDogAgeInHumanYears());
        System.out.println(dog1);

        // Init dog2 and call the "toString" method
        Dog dog2 = new Dog("Cooper", 3);
        System.out.println();
        System.out.println(dog2);

        // Reassign name
        dog2.setName("Scruff");
        System.out.println("New dog name: "+dog2.getName());

        // Reassign age
        dog2.setAge(4);
        System.out.println("New dog age: "+dog2.getAge());

        // Compute and print the dog's age in human years
        System.out.println("New dog age in human years: "+dog2.computeDogAgeInHumanYears());
        System.out.println(dog2);

        // Init dog3 and call the "toString" method
        Dog dog3 = new Dog("Zeus", 6);
        System.out.println();
        System.out.println(dog3);

        // Reassign name
        dog3.setName("Hades");
        System.out.println("New dog name: "+dog3.getName());

        // Reassign age
        dog3.setAge(7);
        System.out.println("New dog age: "+dog3.getAge());

        // Compute and print the dog's age in human years
        System.out.println("New dog age in human years: "+dog3.computeDogAgeInHumanYears());
        System.out.println(dog3);
        System.out.println();
    }
}