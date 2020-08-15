package course.inputMethod.scanner;

// Step 1: import the Scanner class from the java.util package

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        // Step 2: create an object of the Scanner class
        // <ClassName> <objectName> = new <ClassName>();
        // Car          totalNano   = new Car        ();
        Scanner scanner = new Scanner(System.in);
       /* int number;       // declaration
          int number1 = 4;    // initialization
        byte byteVariable = scanner.nextByte();
        short shortVariable = scanner.nextShort();
        int number = scanner.nextInt();  // Step 3: use the method
        float marks = scanner.nextFloat();
        double cpi = scanner.nextDouble();
        long phoneNumber = scanner.nextLong();
        boolean isStudent = scanner.nextBoolean();  */
        System.out.println("Please enter your name: "); // output: monitor console
        char name = scanner.nextLine().charAt(0);  // charAt for get char from String
        System.out.println(name);
        scanner.close(); // Step 4: close the scanner object
    }
}