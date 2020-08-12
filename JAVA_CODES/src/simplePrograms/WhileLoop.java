/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 12-08-2020
 * Time: 10:02 PM
 * File: WhileLoop.java
 * */

// input a number from the client and print all the number from that number upto 1000.

package simplePrograms;

import java.util.Scanner;

public class WhileLoop {
    private static final int FINAL_NUMBER = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        while (number <= FINAL_NUMBER) {
            System.out.print(number++ + ((number <= FINAL_NUMBER) ? ", " : "."));
        }
    }
}
