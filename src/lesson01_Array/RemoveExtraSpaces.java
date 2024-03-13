package lesson01_Array;

import java.util.Arrays;

/**
 * This class demonstrates a program that removes all extra spaces from a string.
 */
public class RemoveExtraSpaces {


     //Main method to remove extra spaces from a string.
    public static void main(String[] args) {
        String str = "    Hello world          I       love     java     ";
        System.out.println("Original string: " + str);

        // Split the string into words using spaces as delimiter
        String[] words = str.split(" ");
        System.out.println("Words array: " + Arrays.toString(words));

        // Reconstruct the string without extra spaces
        str = "";
        for (String each : words) {
            if (!each.isEmpty()) {
                str += each + " ";
            }
        }
        str = str.trim(); // Remove trailing and leading spaces
        System.out.println("Modified string: " + str);
    }
}
