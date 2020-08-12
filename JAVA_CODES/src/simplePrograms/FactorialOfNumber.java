/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 12-08-2020
 * Time: 06:16 PM
 * File: FactorialOfNumber.java
 * */

// Factorial of any number.

package simplePrograms;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = scanner.nextLong();
        long numbers = 1L;
        while (number != 0) {
            numbers = numbers * number;
            number--;
        }
        System.out.println(numbers);
    }
}
