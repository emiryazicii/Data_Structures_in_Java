package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {

    /**
     * This method creates a subarray from the given array based on the specified start and end indexes.
     *
     * @param arr   The original array from which the subarray will be created.
     * @param start The starting index of the subarray (inclusive).
     * @param end   The ending index of the subarray (exclusive).
     * @return      The subarray containing elements from the original array.
     */
    public static int[] subArray(int[] arr, int start, int end) {
        // Create a new array to store the subarray
        int[] subArray = new int[end - start];

        // Copy elements from the original array to the subarray
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = arr[start++];
        }

        return subArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of elements in the array
        System.out.println("How many integer numbers do you want to enter in your array?");
        int howManyElement = input.nextInt();

        // Prompt user to enter the integer numbers
        System.out.println("Enter the integer numbers:");
        int[] arr = new int[howManyElement];
        for (int i = 0; i < howManyElement; i++) {
            arr[i] = input.nextInt();
        }

        // Display the created array
        System.out.println("Your array is created:");
        System.out.println(Arrays.toString(arr));

        // Prompt user to enter the beginning and ending index of the subarray
        System.out.println("For the subarray, enter the beginning index:");
        int start = input.nextInt();
        System.out.println("Enter the ending index:");
        int end = input.nextInt();
        input.close();

        // Display the subarray
        System.out.println("Here is the subarray:");
        System.out.println(Arrays.toString(subArray(arr, start, end)));
    }
}
