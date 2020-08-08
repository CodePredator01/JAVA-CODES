/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 08-08-2020
 * Time: 06:42 PM
 * */

// Main class for take input from End - user at run time

package InputMethod;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of people: ");
        int n = scanner.nextInt();

        int maxAge = 0;
        int totalAge = 0;

        // Start for loop for run the Persons details specified till no.
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Person number " + (i + 1));

            System.out.print("First name: ");
            String firstName = scanner.next();

            System.out.print("Last name: ");
            String lastName = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            if (age > maxAge) {
                maxAge = age;
            }

            totalAge += age;

            System.out.print("Height (cm): ");
            double height = scanner.nextDouble();

            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();

            Person.printData(firstName, lastName, age, height, weight);
        }
        scanner.close();
        System.out.println();
        System.out.println();

        System.out.println("Age of oldest person: " + maxAge + ".");
        System.out.println("Average age: " + totalAge / n + ".");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.println("Thank You !");
        
    }
}