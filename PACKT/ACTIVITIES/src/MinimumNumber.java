/*
Write a program that will check two numbers entered as variables and print out the message
"The minimum of numbers: XX and YY is ZZ", where XX, YY, and ZZ represent the values of the
two variables and the result of the operation, respectively. To do this, perform the following
steps:
Declare 3 double variables: a, b, and m. Initialize them with the values 3, 4 and 0 respectively.

 */

public class MinimumNumber {

    public static void main(String[] args) {
        double num1 = 3;
        double num2 = 4;
        double min = 0;
        double max = 0;
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
        System.out.println("Minimum Number is " + min );
        System.out.println("Maximum Number is " + max);
    }
}