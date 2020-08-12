/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 11-08-2020
 * Time: 10:45 PM
 * File: LabTask2B.java
 * */

// Task 2B : Create a program in java to create local variable with the var keyword, Assign thw value of all 8 primitive data types to 8 variable.

package labTasks;

public class LabTask2B {
    public static void main(String[] args) {
        // My object : BankAccountDetails
        var operatingSystemNumber = 1;
        System.out.println("System Number: " + operatingSystemNumber);

        var accountNumber = 2111235245;
        System.out.println("Account Number: " + accountNumber);

        var lastMonthBalance = 30000;
        System.out.println("Balance of previous month: " + lastMonthBalance);

        var mobileNumber = 6393997047L;
        System.out.println("Contact Number: " + mobileNumber);

        var rateOfInterest = 2.90f; // percentage
        System.out.println("Monthly rate of intrest: " + rateOfInterest);

        var currentBalance = 20022.20;
        System.out.println("Current Month Balance: " + currentBalance);

        var gender = 'M';
        System.out.println("Gender: " + gender);

        var areYouAdult = true;
        System.out.println("You are adult: " + areYouAdult);
    }
}
