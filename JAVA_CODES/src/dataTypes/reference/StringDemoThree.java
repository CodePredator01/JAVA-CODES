/*
 * Created by IntelliJ IDEA.
 * User: CodePredator01
 * Date: 11-08-2020
 * Time: 11:45 AM
 * File: StringDemoThree.java
 * */ // 1. author information

// 2. package information
package dataTypes.reference;

public class StringDemoThree {
    public static void main(String[] args) {
        String languageName = "Java";
        StringBuilder stringBuilder = new StringBuilder(languageName);
        System.out.println(stringBuilder.reverse());
    }
}
