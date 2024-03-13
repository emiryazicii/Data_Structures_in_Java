package lesson01_Array;

import java.util.Arrays;

public class Anagram {

    /**
     * Checks if two strings are anagrams of each other.
     *
     * @param str1 The first string to compare.
     * @param str2 The second string to compare.
     * @return True if the strings are anagrams, otherwise false.
     */
    public static boolean isAnagram(String str1, String str2) {
        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted arrays are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        // Check if the two strings are anagrams
        System.out.println("Is \"" + str1 + "\" an anagram of \"" + str2 + "\"? " + isAnagram(str1, str2));

        str1 = "java";
        str2 = "python";

        // Check if the two strings are anagrams
        System.out.println("Is \"" + str1 + "\" an anagram of \"" + str2 + "\"? " + isAnagram(str1, str2));
    }
}
