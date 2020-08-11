/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 10-08-2020
 * Time: 04:47 PM
 * File: ConvertNumberToWords.java
 * */ // 1. author information

// 2. package information
package labTasks;

import java.util.Scanner;

public class ConvertNumberToWords {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number (1-999): ");
        String input = scanner.nextLine();
        scanner.close();
        String[] placevalue = {"hundred"};
        String[] digits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] multiplesOfTen = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};


        if (input.length() == 1) {
            System.out.println(digits[Character.getNumericValue(input.charAt(0)) - 1]);
        } else if (input.length() == 2 && Character.getNumericValue(input.charAt(0)) == 1) {
            String result = digits[Character.getNumericValue(input.charAt(0) + input.charAt(1)) - 1];
            System.out.println(result);
        } else if (input.length() == 2) {
            String result = multiplesOfTen[Character.getNumericValue(input.charAt(0)) - 2] + " ";
            if (input.charAt(1) != '0') {
                result += digits[Character.getNumericValue(input.charAt(1)) - 1];
            }
            System.out.println(result);
        } else if (input.length() == 3) {
            String result = digits[Character.getNumericValue(input.charAt(0)) - 1] + " " + placevalue[0];
            if (input.charAt(1) == '0') {
                if (input.charAt(2) != '0') {
                    result += " " + digits[Character.getNumericValue(input.charAt(2) - 1)];
                }
            } else if (Character.getNumericValue(input.charAt(1)) == 1) {
                result += " " + digits[Character.getNumericValue(input.charAt(1) + input.charAt(2)) - 1];
            } else {
                result += " " + multiplesOfTen[Character.getNumericValue(input.charAt(1)) - 2] + " ";
                if (input.charAt(2) != '0') {
                    result += digits[Character.getNumericValue(input.charAt(2)) - 1];
                }
            }
            System.out.println(result);
        }
    }
}

