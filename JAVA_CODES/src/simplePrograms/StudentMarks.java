/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 15-08-2020
 * Time: 01:27 PM
 * File: StudentMarks.java
 * */

/*
 * Create a program in Java, to store the marks of BCSC 1002 for all the student of C, Then, find out,
 * 1. How many students got less than 3 marks.
 * 2. How many students got 10 marks.
 *  */

package simplePrograms;

import java.util.Scanner;

public class StudentMarks {
    private static final byte TOTAL_STUDENTS = (byte) 71;

    public static void main(String[] args) {
        float[] marks = new float[TOTAL_STUDENTS];
        System.out.println("Please enter the marks for " + TOTAL_STUDENTS + " students: ");
        Scanner scannerObject = new Scanner(System.in);
        int numbersOfStudentsWithLessThanThreeMarks = 0;
        int numbersOfStudentsWithTenMarks = 0;
        for (int index = 0; index < marks.length; index++) {
            int rollNumber = index + 1;
            System.out.println("Please enter marks for roll number " + rollNumber);
            marks[index] = scannerObject.nextFloat();
            if (marks[index] < 3) {
                numbersOfStudentsWithLessThanThreeMarks++;
            } else if (marks[index] == 10) {
                numbersOfStudentsWithTenMarks++;
            }
        }
        scannerObject.close();
        System.out.println(numbersOfStudentsWithLessThanThreeMarks + " students got less than three marks.");
        System.out.println(numbersOfStudentsWithTenMarks + " students got exatly ten marks.");
    }
}
