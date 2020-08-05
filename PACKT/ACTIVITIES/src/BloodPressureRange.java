/*
You are tasked with writing a program that takes a patient's blood pressure as
input and then determines if that blood pressure is within the ideal range.Blood
pressure has two components, the systolic blood pressure and the diastolic blood
pressure.According to "bloodpressureuk.org", the ideal systolic number is more than
90 and less than 120. 90 and below is low blood pressure. Above 120 and below 140
is called pre-high blood pressure, and 140 and over is high blood pressure.The
ideal diastolic blood pressure is between 60 and 80. 60 and below is low.Above 80
and under 90 is pre-high blood pressure, and over 90 is high bloodpressure.
*/

import java.util.Scanner;

public class BloodPressureRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Blood pressure :");
        int systolic = sc.nextInt();
        int diastolic = sc.nextInt();
        System.out.println();
        System.out.print(systolic + "/" + diastolic + " is ");
        if ((systolic < 90) || (diastolic < 60)) {
            System.err.println("low blood pressure.");
        } else if ((systolic > 140) || (diastolic > 90)) {
            System.err.println("high blood pressure.");
        } else if ((systolic > 120) || (diastolic > 80)) {
            System.err.println("pre-high blood pressure.");
        } else {
            System.out.println("ideal blood pressure.");
        }
    }
}

