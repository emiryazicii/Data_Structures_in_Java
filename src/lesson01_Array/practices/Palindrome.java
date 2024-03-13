package lesson01_Array.practices;

public class Palindrome {

    public static void main(String[] args) {
        // Array of strings
        String[] str = {"Anna", "Level", "Java"};

        // Initialize counter for palindromes
        int palindromeCount = 0;

        // Iterate through each string in the array
        for (String each : str) {
            // Initialize a variable to store the reversed string
            String reversed = "";

            // Iterate through the characters of the string in reverse order
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i); // Append each character to the reversed string
            }

            // Check if the original string is equal to its reverse (ignoring case)
            if (each.equalsIgnoreCase(reversed)) {
                palindromeCount++; // Increment palindrome count if it is a palindrome
            }
        }

        // Print the count of palindromes
        System.out.println("Palindrome count: " + palindromeCount);
    }
}
