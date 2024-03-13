package lesson01_Array;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Reversing the array
        int[] reversedArray = reverseArray(array);

        // Printing the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    /**
     * Reverses the given array of integers and returns the reversed array.
     *
     * @param array The array to be reversed.
     * @return The reversed array.
     */
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        // Reversing the array
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }
}
