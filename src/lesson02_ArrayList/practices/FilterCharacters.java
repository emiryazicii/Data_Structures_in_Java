package lesson02_ArrayList.practices;

import java.util.ArrayList;

public class FilterCharacters {

    public static void main(String[] args) {

        String str = "abcd@!#$etyi123lkjhaqwer%^&879",
                digits = "" , letters = "", specialChars = "";

        ArrayList<Character> chars = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        for (char ch : chars) {

            if (Character.isDigit(ch)) {
                digits += ch;
            }
            else if (Character.isLetter(ch)) {
                letters += ch;
            }
            else {
                specialChars += ch;
            }
        }
        System.out.println("digits: " + digits+"\nletters: " + letters+"\nspecial: " + specialChars);
    }
}

/*
Filter Characters [ArrayList, Wrapper class, loop, boolean]

    Create a program that will have a String of different characters, of different types. Filter(group) all the digits, letters, and special characters

        ex:
            String str = "abcd@!#$etyi123lkjhaqwer%^&879";
            digits: 123879
            letters: abcdetyilkjhaqwer
            special: @!#$%^&

 */

