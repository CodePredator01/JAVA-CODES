/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 13-08-2020
 * Time: 04:37 PM
 * File: HackerRank.java
 * */

package simplePrograms;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
            System.out.println(number + " can be fitted in:");
            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                System.out.println("* long");
            } else {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }

    }
}
