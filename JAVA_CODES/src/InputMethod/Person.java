/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 08-08-2020
 * Time: 06:43 PM
 * */


//  This class for print Persons details as a result


package InputMethod;

class Person {
    public static void printData(String firstName, String lastName, int age, double height, double weight) {
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println("My name is " + fullName(firstName, lastName) + ".");
        System.out.println("I am " + age + " years old.");
        if (age >= 18) {
            System.out.println("I am an adult.");
        } else {
            System.out.println("I am not an adult.");
        }
        System.out.println("I am " + height + " cm tall.");
        System.out.println("My weight is " + weight + " kg.");
        double bmi = bmi(height, weight);
        System.out.println("My BMI is " + Math.round(bmi) + ".");

        // if else condition for check weather person is healthy or not
        if (isHealthy(bmi)) {
            System.out.println("I am healthy!");
        } else {
            System.out.println("I am not healthy.");
        }
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static double bmi(double height, double weight) {
        return weight / height / height;
    }

    public static boolean isHealthy(double bmi) {
        return bmi >= 18.5 && bmi < 25.0;
    }
}