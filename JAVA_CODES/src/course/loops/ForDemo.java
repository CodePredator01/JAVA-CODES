/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 11-08-2020
 * Time: 01:35 PM
 * File: ForDemo.java
 * */ // 1. author information

// 2. package information
package course.loops;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        /*
         * 1. variable declaration for controlling the loop loop control variable
         * 2. test codition / test expression
         * 3. modification statement for the loop control variable
         * */
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " x " + i + " = " + (inputNumber * i));
        }
    }
}
