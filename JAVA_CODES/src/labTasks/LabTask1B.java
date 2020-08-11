/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 11-08-2020
 * Time: 07:54 PM
 * File: LabTask2.java
 * */

// Task 1B : Create a program in Java to declare, and use local variables of all the primitive data types in Java.


package labTasks;

public class LabTask1B {
    public static void main(String[] args) {
        // My Object : My University Information
        byte classRollNo = (byte) 31;
        System.out.println(classRollNo + " is a first primitive data-type no.");

        short universityRank = (short) 384;
        System.out.println(universityRank + " is a second primitive data-type no.");

        int universityRollNo = 191500611;
        System.out.println(universityRollNo + " is a third primitive data-type no.");

        long phoneNo = 6393997047L;
        System.out.println(phoneNo + " is a fourth primitive data-type no.");

        float firstSemCpi = 7.77f;
        System.out.println(firstSemCpi + " is a fifth primitive data-type no.");

        double firstSemSpi = 7.77;
        System.out.println(firstSemSpi + " is a sixth primitive data-type no.");

        char gender = 'P';
        System.out.println(gender + " is a seventh primitive data-type character.");

        boolean areYouMale = true;
        System.out.println(areYouMale + " is a eighth primitive data-type no.");
    }
}
