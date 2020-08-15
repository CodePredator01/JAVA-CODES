/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 12-08-2020
 * Time: 06:00 PM
 * File: WhileDemo.java
 * */

// Count yhe number of digits of a number

package course.loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int numberOfDigits = 0;
        while (number != 0) {
            number = number / 10;
            numberOfDigits++;
        }
        System.out.println(numberOfDigits);
    }
}
