/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 13-08-2020
 * Time: 04:37 PM
 * File: HackerRank.java
 * */


/*
    another comment
*/
package simplePrograms;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();

        if (breadth > 0 && height > 0) {
            int parallelogram = breadth * height;
            System.out.println(parallelogram);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
