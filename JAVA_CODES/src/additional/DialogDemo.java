/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 11-08-2020
 * Time: 04:41 PM
 * File: DialogDemo.java
 * */ // 1. author information

// 2. package information
package additional;

import javax.swing.*;

public class DialogDemo {

    // A Dialog in Java is just simply a pop-up window that appears on your screen.

    public static void main(String[] args) {
        // A Simple program to display a message on a dialog!
        // 1. Plain Message (-1)
        JOptionPane.showMessageDialog(null, "dialogs are fun!", "Dialog Window Title", JOptionPane.PLAIN_MESSAGE);
        // You can also try out different kinds of messages
        // 2. Error Message (0)
        JOptionPane.showMessageDialog(null, "This is an error dialog!", "Error Dialog", JOptionPane.ERROR_MESSAGE);
        // 3. Information Message (1)
        JOptionPane.showMessageDialog(null, "This is an information dialog!", "Info Dialog", JOptionPane.INFORMATION_MESSAGE);
        // 4. Warning Message (2)
        JOptionPane.showMessageDialog(null, "This is an warning dialog!", "Warning Dialog", JOptionPane.WARNING_MESSAGE);
        // 5. Question Message (3)
        JOptionPane.showMessageDialog(null, "This is a question dialog", "Question Dialog", JOptionPane.QUESTION_MESSAGE);
    }
}