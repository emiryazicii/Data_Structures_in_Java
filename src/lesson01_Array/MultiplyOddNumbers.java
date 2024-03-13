package lesson01_Array;

import java.util.Arrays;

/**
 * This class demonstrates a program that multiplies each odd number in an integer array by 2.
 */
public class MultiplyOddNumbers {

    /**
     * Multiplies each odd number in the array by 2.
     *
     * @param numbers The integer array.
     * @return The modified array with odd numbers multiplied by 2.
     */
    public static int[] multiplyOddNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] *= 2; // Multiply odd numbers by 2
            }
        }
        return numbers;
    }


    //Main method to test MultiplyOddNumbers class.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Multiply odd numbers in the array by 2
        numbers = multiplyOddNumbers(numbers);

        System.out.println("Modified array: " + Arrays.toString(numbers));
    }
}
