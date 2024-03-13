package lesson01_Array.practices;

public class RetrieveCharacters {

    public static void main(String[] args) {
        // Call the method to categorize characters
        categorizeCharacters("Wooden Spoon!");
    }

    /**
     * Categorizes the characters in the given string into letters, digits, and special characters.
     * Prints the result for each category.
     *
     * @param str The string from which characters will be categorized.
     */
    public static void categorizeCharacters(String str) {
        // Initialize variables to store characters
        String letters = "", digits = "", specialChars = "";

        // Convert the string to an array of characters
        char[] characters = str.toCharArray();

        // Iterate through each character in the array
        for (char each : characters) {
            // Check if the character is not a letter or digit
            if (!Character.isLetterOrDigit(each)) {
                specialChars += each; // Add the character to the specialChars string
            }
            // Check if the character is a digit
            else if (Character.isDigit(each)) {
                digits += each; // Add the character to the digits string
            }
            // If the character is a letter
            else {
                letters += each; // Add the character to the letters string
            }
        }

        // Print the categorized characters
        System.out.println("letters = \"" + letters + "\";");
        System.out.println("digits = \"" + digits + "\";");
        System.out.println("specialChars = \"" + specialChars + "\";");
    }
}
