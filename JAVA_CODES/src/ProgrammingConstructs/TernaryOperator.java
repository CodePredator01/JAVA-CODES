/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 09-08-2020
 * Time: 11:08 PM
 * File: TernaryOperator.java
 * */ // 1. author information

// 2. package information
package ProgrammingConstructs;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 4;
        String result = number % 2 == 0 ? " even." : " odd.";
        /*
         * Ternary Operator - ?:
         * */
        System.out.println(number + " is" + result);
    }
}
