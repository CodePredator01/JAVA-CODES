/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 11-08-2020
 * Time: 10:48 AM
 * File: StringDemo2.java
 * */ // 1. author information

// 2. package information
package dataTypes.reference;

public class StringDemo2 {
    public static void main(String[] args) {
/*      String name = "Java"; // 2301506
        String names= "jAvA";
        String nameInLowercase = names.toLowerCase();
        System.out.println(name + " : " + name.hashCode());
        System.out.println(names + " : " + name.hashCode());
        System.out.println(nameInLowercase + " : " + nameInLowercase.hashCode()); */

        // StringBuilder give us same hashcode after modify any thing in string
        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder.hashCode());

        StringBuilder stringBuilderAppend = stringBuilder.append("2");
        System.out.println(stringBuilderAppend.hashCode());
    }
}
