package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class LanguageCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the language
        System.out.println("Enter the language you want to check : ");
        String language = input.next();
        input.close();

        // Display the result
        System.out.println("Here is the result : ");
        System.out.println(Arrays.toString(charArray(language)));
    }

    /**
     * Generates a char array based on the given language name.
     *
     * @param language The name of the language.
     * @return An array of characters used in the specified language.
     */
    public static char[] charArray(String language) {
        switch (language.toLowerCase()) {
            case "english":
                return charArray(33, 126); // English characters in ASCII range 33-126
            case "greek":
                return charArray(884, 1011); // Greek characters in ASCII range 884-1011
            case "arabic":
                return charArray(1548, 1790); // Arabic characters in ASCII range 1548-1790
            case "chinese":
            case "japanese":
            case "vietnamese":
            case "korean":
                return charArray(63744, 64045); // CJK Compatibility Ideographs in ASCII range 63744-64045
            case "braille":
                return charArray(10240, 10495); // Braille characters in ASCII range 10240-10495
            default:
                System.out.println("Can't show any character because of the invalid entry.");
                return new char[0]; // Return empty array for invalid language
        }
    }

    /**
     * Generates a char array from start to end ASCII values.
     *
     * @param start The starting ASCII value.
     * @param end   The ending ASCII value.
     * @return An array of characters from start to end ASCII values.
     */
    public static char[] charArray(int start, int end) {
        char[] characters = new char[end - start + 1];
        for (int i = start, j = 0; i <= end; i++) {
            characters[j++] = (char) i; // Convert ASCII value to character
        }
        return characters;
    }
}
