/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 10-08-2020
 * Time: 03:04 PM
 * File: StringDemo.java
 * */ // 1. author information

// 2. package information
package dataTypes.reference;

// import Scope.Student;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println(name.toLowerCase());
        // toLowerCase() for given input change in lowercase

        /*
        // String in Java is a definition class
        // fields & methods for using String values
        Student student = new Student();
        System.out.println(student);
        String names = "Nikhil";

        // pirimitive (int)
        int number = 4;

        // reference (String)
        String name = new String();
        // new is for allocate new memory for keyword an object of a class/*/
    }
}
