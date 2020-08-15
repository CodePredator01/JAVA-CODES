/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 15-08-2020
 * Time: 04:40 PM
 * File: MultipleChoiceQuestion.java
 * */

/*
 * Creative: one question, three answer choices(one is correct)
 * Ask the user a question
 * Output answer choices to user
 * Collect user's input(that is, the answer they provide)
 * Print out an appropriate message to the user(depending on if they were correct or incorrect)
 * */

package additional;

import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void main(String[] args) {
        String question = "Who is the inventor of Java ?";
        String choiceOne = "(A) Guido van Rossum";
        String choiceTwo = "(B) Dennis Ritchie";
        String choiceThree = "(C) Rasmus Lerdorf";
        String choiceFour = "(D) James Gosling";
        System.out.println(question);
        System.out.println(choiceOne + "\n" + choiceTwo + "\n" + choiceThree + "\n" + choiceFour);
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("\n" + "Please submit your option: ");
        String optionForAnswer = scannerObject.nextLine();
        if (optionForAnswer.endsWith("d") || optionForAnswer.endsWith("D") || optionForAnswer.endsWith("(D)") || optionForAnswer.endsWith("iv") || optionForAnswer.endsWith("Four") || optionForAnswer.endsWith("four") || optionForAnswer.endsWith("IV") || optionForAnswer.endsWith("FOUR") || optionForAnswer.endsWith("4")) {
            System.out.println("Congratulation, Your answer is correct.");
        } else {
            System.out.println("Entered Option is incorrect." + "\n" + "Correct Option is: (D) James Gosling");
        }

    }
}
