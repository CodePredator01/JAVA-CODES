/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 14-08-2020
 * Time: 03:38 PM
 * File: ArrayIntroduction.java
 * */

package course.arrays;

import java.util.Arrays;

public class ArrayIntroduction {
    public static void main(String[] args) {
/*
        byte[] byteNumbers;
        // Reference Types
        String[] string;

        // Initialization of an array
        // Type 1: with pre-defined values
        float[] studentMarks = {10.f, 20.2f};
        // Type 2: with the new keyword
        String[] nameOfMyFriends = new String[10];
        // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
*/
        int[] numbers = new int[10];
        System.out.println(numbers.length);
        // Arrays is a utility class in Java for operating an array
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 0, numbers.length, 5);
        // Arrays.sort();
        // Arrays.binarySearch();
        // nt[] modifiedNumbers = Arrays.copyOf(numbers, numbers.length);
        // for (int number : numbers) {
        // System.out.print(number + ", "); }

    }
}
