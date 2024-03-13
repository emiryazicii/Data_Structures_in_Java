package lesson01_Array.practices;

import java.util.Arrays;

public class Fibonacci {

    /**
     * Displays the Fibonacci series up to the specified number of elements.
     *
     * @param howManyElement the number of elements in the Fibonacci series
     */
    public static void displayFibonacciSeries(int howManyElement) {
        // Check if the input is valid
        if (howManyElement <= 1) {
            // Print an error message if the input is negative, 0, or 1
            System.err.println("Fibonacci array size can't be negative, 0, or 1.");
            return;
        }

        // Initialize the Fibonacci series array
        int[] array = new int[howManyElement];
        array[0] = 0;
        array[1] = 1;

        // Calculate the rest of the Fibonacci series
        for (int i = 1; i < array.length - 1; i++) {
            array[i + 1] = array[i] + array[i - 1];
        }

        // Print the Fibonacci series array
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        // Test Case 3: Invalid array size (Negative)
        displayFibonacciSeries(-10);
        // Expected result: It should print an error message(Fibonacci array size can't be negative, 0, or 1.)
    }
}
