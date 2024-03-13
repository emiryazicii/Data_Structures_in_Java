package lesson01_Array.practices;

import java.util.Arrays;

public class ReverseEach {

    public static void main(String[] args) {
        // Input sentence to reverse
        String sentence = "Everything that has a beginning has an end";

        // Split the sentence into words
        String[] array = sentence.split(" ");
        // Initialize a new array to store reversed words
        String[] newArray = new String[array.length];

        int j = 0;
        // Iterate through each word in the original array
        for (String each : array) {
            // Initialize a string to store the reversed word
            String reversed = "";
            // Iterate through each character of the word in reverse order
            for (int i = each.length() - 1; i >= 0; i--) {
                // Append each character to the reversed string
                reversed += each.charAt(i);
            }
            // Store the reversed word in the new array
            newArray[j] = reversed;
            j++;
        }
        // Print the array of reversed words
        System.out.println(Arrays.toString(newArray));
    }
}
