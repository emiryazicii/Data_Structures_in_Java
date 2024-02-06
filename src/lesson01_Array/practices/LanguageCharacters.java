package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class LanguageCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the language you want to check : ");
        String language = input.next();
        input.close();
        System.out.println("Here is the result : ");
        System.out.println(Arrays.toString(charArray(language)));


    }
    public static char[] charArray(String language) {

        switch (language.toLowerCase()) {
            case "english":
                return charArray(33, 126);
            case "greek":
                return charArray(884, 1011);
            case "arabic":
                return charArray(1548, 1790);
            case "chinese": case "japanese": case "vietnamese": case "korean":
                return charArray(63744, 64045);
            case "braille":
                return charArray(10240, 10495);
            default:
                System.out.println("Can't show any character because of the invalid entry.");
                char[] emptyChar = new char[0];
                return emptyChar;
        }
    }
    public static char[] charArray(int start, int end) {

        char[] characters = new char[end - start + 1];
        for (int i = start, j = 0; i <= end; i++) {
            characters[j++] = (char) i;
        }
        return characters;
    }
}
/*
LanguageCharacters [array, char, loop, method]

    Create a method that will accept a String for the language name. Based on the given language name return a char array of the characters that are used in that language. We will use ascii numbers

    Use the following ranges:

    English: 33 - 126

    Greek: 884 - 1011

    Arabic: 1548 - 1790

    Chinese, Japanese, Korean or Vietnamese:  63744 - 64045
        (this group of characters are the: CJK Compatibility Ideographs)

    Braille: 10240 - 10495

 */

