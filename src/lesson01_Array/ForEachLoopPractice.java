package lesson01_Array;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        // Example 1: Print odd numbers from an array
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int each : number) { // Iterate through each element in the array
            if (each % 2 != 0) { // Check if the element is odd
                System.out.println(each); // Print the odd number
            }
        }

        System.out.println("--------------------------------------------------------------------------");

        // Example 2: Find the maximum and minimum values in an array
        int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};
        int max = nums[0]; // Initialize max with the first element of the array
        int min = nums[0]; // Initialize min with the first element of the array
        for (int each : nums) { // Iterate through each element in the array
            if (each > max) { // If current element is greater than max, update max
                max = each;
            }
            if (each < min) { // If current element is smaller than min, update min
                min = each;
            }
        }
        System.out.println("Max is: " + max); // Print the maximum value
        System.out.println("Min is: " + min); // Print the minimum value

        System.out.println("---------------------------------------------------------------------------");

        // Example 3: Merge two arrays into a new array
        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};
        int[] a3 = new int[a1.length + a2.length]; // Create a new array to hold merged elements
        int k = 0; // Initialize index for array a3
        for (int each : a1) { // Iterate through elements of array a1
            a3[k++] = each; // Add elements of a1 to a3
        }
        for (int each : a2) { // Iterate through elements of array a2
            a3[k++] = each; // Add elements of a2 to a3 after a1 elements
        }
        System.out.println(Arrays.toString(a3)); // Print the merged array
    }
}
