package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class CountChar {

    /**
     * Counts how many times a given character is found in all elements of the array.
     *
     * @param arr    the array of strings
     * @param letter the character to count
     * @return the count of occurrences of the character in the array
     */
    public static int countChar(String[] arr, char letter) {
        int countChar = 0;

        // Loop through each string in the array
        for (String each : arr) {
            // Loop through each character in the current string
            for (int i = 0; i < each.length(); i++) {
                // Check if the character matches the given letter
                if (each.charAt(i) == letter) {
                    countChar++;
                }
            }
        }
        return countChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.println("How many elements do you want to enter in your array?");
        int howManyElement = input.nextInt();
        input.nextLine();

        // Initialize the array
        String[] arr = new String[howManyElement];

        // Populate the array with user input
        System.out.println("Enter the elements:");
        for (int i = 0; i < howManyElement; i++) {
            arr[i] = input.nextLine();
        }

        // Display the array
        System.out.println("Your array is created:");
        System.out.println(Arrays.toString(arr));

        // Get the letter to count from the user
        System.out.println("Enter the letter that you want to count:");
        char letter = input.next().charAt(0);
        input.close();

        // Count occurrences of the letter and print the result
        System.out.println("Here is the result:");
        System.out.println(countChar(arr, letter));
    }
}
