package lesson01_Array;

import java.util.Arrays;

public class Alphabets {

    /**
     * Generates an array of characters representing the English alphabet in ascending order.
     *
     * @return An array containing characters from 'A' to 'Z' in ascending order.
     */
    public static char[] generateAscendingAlphabet() {
        char[] ascending = new char[26];
        for (int i = 0, j = 'A'; i < ascending.length; i++, j++) {
            ascending[i] = (char) j;
        }
        return ascending;
    }

    /**
     * Generates an array of characters representing the English alphabet in descending order.
     *
     * @return An array containing characters from 'Z' to 'A' in descending order.
     */
    public static char[] generateDescendingAlphabet() {
        char[] descending = new char[26];
        for (int i = 0, k = 'Z'; i < descending.length; i++, k--) {
            descending[i] = (char) k;
        }
        return descending;
    }

    /**
     * Generates an array of characters representing all Unicode characters.
     *
     * @return An array containing all Unicode characters.
     */
    public static char[] generateAllCharacters() {
        char[] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        return characters;
    }

    public static void main(String[] args) {
        // Generate and print the ascending and descending alphabets
        char[] ascending = generateAscendingAlphabet();
        char[] descending = generateDescendingAlphabet();
        System.out.println("Ascending Alphabet: " + Arrays.toString(ascending));
        System.out.println("Descending Alphabet: " + Arrays.toString(descending));

        System.out.println("------------------------------------------------------------------");

        // Generate and print all Unicode characters
        char[] allCharacters = generateAllCharacters();
        System.out.println("All Unicode Characters: " + Arrays.toString(allCharacters));
    }
}
