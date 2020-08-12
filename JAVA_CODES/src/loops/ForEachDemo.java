/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 12-08-2020
 * Time: 07:40 PM
 * File: ForEachDemo.java
 * */

package loops;

import java.util.Scanner;

public class ForEachDemo {

    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        // format for creating arrays in Java
        // the size should only be a positive integer
        // <data-type>[] <arrayName> = new <data-type>[<size>]
        int[] numbers = new int[ARRAY_SIZE];
        Scanner scanner = new Scanner(System.in);
        // Enhanced for loop (For-Each loop) - only for print and assign
        for (int number : numbers) {
            System.out.println("Nikhil");
        }
        scanner.close();
    }
}
