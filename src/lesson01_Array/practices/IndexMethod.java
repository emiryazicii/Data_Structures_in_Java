package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class IndexMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of integers to enter in the array
        System.out.println("How many integer numbers do you want to enter in your array: ");
        int howManyElement = input.nextInt();

        // Create an array to store the integers
        int[] arr = new int[howManyElement];
        System.out.println("Enter the integer numbers: ");
        for (int i = 0; i < howManyElement; i++) {
            arr[i] = input.nextInt();
        }

        // Display the array
        System.out.println("Your array is created:");
        System.out.println(Arrays.toString(arr));

        // Get the element to search for its index
        System.out.println("Enter the element you want to find the index for:");
        int element = input.nextInt();

        // Find and display the index of the element
        System.out.println("Here is the index number of the element:");
        System.out.println(indexOf(arr, element));

        input.close();
    }

    /**
     * Searches for and returns the index of the given element in the array.
     *
     * @param arr     the array to search
     * @param element the element to search for
     * @return the index of the first occurrence of the element, or -1 if the element is not found
     */
    public static int indexOf(int[] arr, int element) {
        // Initialize variables to keep track of index and occurrence count
        int index = -1;
        int count = 0;

        // Iterate through the array from the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == element) {
                // Store the index of the first occurrence of the element
                index = i;
                // Increment the occurrence count
                count++;
            }
        }

        // If no occurrence is found, set the index to -1
        if (count == 0) {
            index = -1;
        }

        return index;
    }
}
