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
        String str = scanner.nextLine();
        String strr = scanner.nextLine();
        String s = strr.replace(" ", "");
        String st = str.replace(" ", "");
        System.out.println(st.equals(s));
    }
}
