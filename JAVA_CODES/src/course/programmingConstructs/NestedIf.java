/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 09-08-2020
 * Time: 10:56 PM
 * File: NestedIf.java
 * */ // 1. author information

// 2. package information
package course.programmingConstructs;

public class NestedIf {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 4;
        if (firstNumber > secondNumber) { // <- braces are important
            System.out.println(firstNumber + " is greater than " + thirdNumber);
            // nested ifs
            if (firstNumber > thirdNumber) {
                System.out.println(firstNumber + " is also greater than " + thirdNumber);
            } else {
                System.out.println("but " + thirdNumber + " is greater than " + firstNumber);
            }
        } else {
            System.out.println("but " + thirdNumber + " is greater than " + secondNumber);
        }
    }
}
