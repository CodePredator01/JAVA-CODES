/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 10-08-2020
 * Time: 11:44 AM
 * File: Student.java
 * */ // 1. author information

// 2. package information
package course.Scope;

public class Student {
    // local variable
    static int studentRollNumber; // Static Variable, Class Owned
    String studentName; // Non-Static Variable, Object Owned

    static void showStudentRollNumber() {
    } // Static Method

    void showStudentName() {
    } // Non-Static Method
}

class ExecutionClass {
    public static void main(String[] args) {
        int number = 4;   // number is a local variable for main method
        System.out.println(number);
    }
}
