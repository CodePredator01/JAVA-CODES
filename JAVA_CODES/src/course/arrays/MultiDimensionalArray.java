/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 19-08-2020
 * Time: 01:01 PM
 * File: MultiDimensionalArray.java
 * */

package course.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    private static final int NUMBER_OF_FLOORS = 4;
    private static final int NUMBER_OF_ROOMS = 10;

    public static void main(String[] args) {
        int[][] hostelRoomNumbers = new int[NUMBER_OF_FLOORS][NUMBER_OF_ROOMS];
        for (int floorNumber = 0; floorNumber < NUMBER_OF_FLOORS; floorNumber++) {
            int roomNumberPrefix = (floorNumber + 1) * 100;
            for (int roomNumber = 0; roomNumber < NUMBER_OF_ROOMS; roomNumber++) {
                hostelRoomNumbers[floorNumber][roomNumber] = roomNumberPrefix + (roomNumber + 1);
            }
        }
        for (int[] hostelRoomNumber : hostelRoomNumbers) {
            System.out.println(Arrays.toString(hostelRoomNumber));
        }
    }
}
