package lesson01_Array.practices;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0, 3, 5, 8, 0, 5, 0};

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // If the current element is zero
            if (array[i] == 0) {
                // Find the next non-zero element
                for (int j = i + 1; j < array.length; j++) {
                    // Swap the zero with the non-zero element
                    if (array[j] != 0) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break; // Exit the inner loop after the swap
                    }
                }
            }
        }

        // Print the modified array
        System.out.println(Arrays.toString(array));
    }
}
