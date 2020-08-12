/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 11-08-2020
 * Time: 11:23 PM
 * File: LabTask2D.java
 * */

// Task2D : Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.

package labTasks;

public class LabTask2D {

    // This is a Static Method
    static void myAge(String name, int age) {
        System.out.println("My name is " + name + ".");
        System.out.println("My age is " + age + ".");
    }

    public static void main(String[] args) {
        LabTask2D.myAge("Priyanshu Vishwakarma", 19); // Static access by class
        LabTask2D obj = new LabTask2D();
        obj.myRollNo(); // Non-Static access by object
    }

    // This is a non-static variable
    public void myRollNo() {
        System.out.println("My roll no. is 191500604.");
    }
}
