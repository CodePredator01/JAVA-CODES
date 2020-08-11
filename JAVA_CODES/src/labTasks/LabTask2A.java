/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 11-08-2020
 * Time: 08:52 PM
 * File: LabTask3.java
 * */

// Task2A : Create a program in java that prints the follwing table.

package labTasks;

public class LabTask2A {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("|\t%-13s|\t%-14s|\t%-14s|                 %-28s|\n", "data type", "size in bits", "size in bytes", "range");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "byte", Byte.SIZE, Byte.SIZE / 8, Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "int", Integer.SIZE, Integer.SIZE / 8, Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "short", Short.SIZE, Short.SIZE / 8, Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "long", Long.SIZE, Long.SIZE / 8, Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "float", Float.SIZE, Float.SIZE / 8, Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "double", Double.SIZE, Double.SIZE / 8, Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "char", Character.SIZE, Character.SIZE / 8, (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.printf("|\t%-13s|\t%-14d|\t%-14s| %-43s |\n", "boolean", Byte.SIZE, Byte.SIZE / 8, Boolean.TRUE + " to " + Boolean.FALSE);
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
