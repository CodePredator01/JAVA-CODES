/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 18-08-2020
 * Time: 10:04 PM
 * File: Array2D.java
 * */

package course.arrays;

import java.util.Scanner;

public class Array2D {
    private static final int NUMBER_OF_ROWS = 3;
    private static final int NUMBER_OF_COLUMNS = 3;

    public static void main(String[] args) {
        int[][] pointsInCartesianPlane = new int[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
        Scanner scanner = new Scanner(System.in);
        for (int rowIndex = 0; rowIndex < NUMBER_OF_ROWS; rowIndex++) {
            for (int columnIndex = 0; columnIndex < NUMBER_OF_COLUMNS; columnIndex++) {
                System.out.printf("Enter the value of (%d, %d).", rowIndex, columnIndex);
                pointsInCartesianPlane[rowIndex][columnIndex] = scanner.nextInt();
            }
        }
        for (int[] ints : pointsInCartesianPlane) {
            for (int anInt : ints) {
                System.out.printf("%02d ", anInt);
            }
            System.out.println();
        }
    }
}
