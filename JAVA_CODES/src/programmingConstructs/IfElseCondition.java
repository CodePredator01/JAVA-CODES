/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 09-08-2020
 * Time: 10:11 PM
 * File: ifElseCondition.java
 * */ // 1. author information

// 2. package information
package programmingConstructs;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isNumberEven = number % 2 == 0;
        if (isNumberEven) {
            /*
             * Parentheses -> (boolean)
             * 1. Test Condition / Test Expression
             * 2. Variable
             * 3. Literal Values
             * */
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }

}
