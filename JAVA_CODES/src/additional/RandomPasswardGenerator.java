/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 19-08-2020
 * Time: 05:20 PM
 * File: RandomPasswardGenerator.java
 * */

package additional;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswardGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperCaseLetter = scanner.nextInt();
        int lowerCaseLetter = scanner.nextInt();
        int digits = scanner.nextInt();
        int sizeOfPassward = scanner.nextInt();
        int afterRequirmentLeftSoace = sizeOfPassward - (upperCaseLetter + lowerCaseLetter + digits);
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghilklmnopqrstuvwxyz";
        String numbersList = "0123456789";
        String createdPassward = "";
        Random randomLetter = new Random();
        for (int upperCase = 1; upperCase <= upperCaseLetter; upperCase++) {
            createdPassward += upperCaseLetters.charAt(randomLetter.nextInt(upperCaseLetters.length()));
        }
        for (int lowerCase = 1; lowerCase <= lowerCaseLetter; lowerCase++) {
            createdPassward += lowerCaseLetters.charAt(randomLetter.nextInt(lowerCaseLetters.length()));
        }
        for (int digit = 1; digit <= digits; digit++) {
            createdPassward += numbersList.charAt(randomLetter.nextInt(numbersList.length()));
        }
        for (int lastSpaces = 1; lastSpaces <= afterRequirmentLeftSoace; lastSpaces++) {
            createdPassward += upperCaseLetters.charAt(randomLetter.nextInt(upperCaseLetters.length()));
        }
        System.out.println(createdPassward);
    }
}
