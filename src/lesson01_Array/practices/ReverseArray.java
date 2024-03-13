package lesson01_Array.practices;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        // Define the original array
        int[] array = {1, 2, 3, 4, 5};

        // Create a new array to store the reversed elements
        int[] reversedArray = new int[array.length];

        // Loop through the original array in reverse order and assign elements to the new array
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        // Print the reversed array
        System.out.println(Arrays.toString(reversedArray));
    }
}
