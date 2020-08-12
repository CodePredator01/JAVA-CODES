/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 12-08-2020
 * Time: 06:54 PM
 * File: DoWhileDemo.java
 * */

// do-while demo/

package loops;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantsToContinue;
        do {
            System.out.print("Do you want to continue (true / false): ");
            wantsToContinue = scanner.nextBoolean();
        } while (wantsToContinue);
        scanner.close();
    }
}
