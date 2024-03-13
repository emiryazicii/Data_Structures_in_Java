package lesson01_Array.practices;

import java.util.Arrays;

public class ShiftLeft {

    public static void main(String[] args) {
        // Original array
        int[] array = {10, 20, 30, 40, 50};

        // Initialize a new array to store the shifted elements
        int[] shiftedArray = new int[array.length];
        // Assign the last element of the original array to the first element of the shifted array
        shiftedArray[shiftedArray.length - 1] = array[0];

        // Shift the elements to the left
        for (int i = 0; i < shiftedArray.length - 1; i++) {
            shiftedArray[i] = array[i + 1];
        }

        // Print the shifted array
        System.out.println(Arrays.toString(shiftedArray));
    }
}
