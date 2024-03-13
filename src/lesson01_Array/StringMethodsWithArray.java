package lesson01_Array;

import java.util.Arrays;

public class StringMethodsWithArray {

    public static void main(String[] args) {

        // Remove spaces from the string and convert it into a character array
        String str = "Cydeo School";
        char[] c1 = str.replace(" ", "").toCharArray();
        System.out.println(Arrays.toString(c1));

        System.out.println("------------------------------------------------------------------------------");

        // Split the string into an array of substrings
        String str2 = "Today is a great day to learn java";
        String[] s1 = str2.split(" ");
        System.out.println(Arrays.toString(s1));

        System.out.println("---------------------------------------------------------------------------------");

        // Split the string into an array of substrings, reverse the array, and construct a reversed sentence
        String sentence = "I love Java";
        String[] o1 = sentence.split(" ");
        // Assuming ArrayUtils.reverse() is properly imported or defined elsewhere
        String[] r1 = ArrayUtils.reverse(o1);
        System.out.println(Arrays.toString(r1));

        String reversedSentence = "";
        for (int i = 0; i < r1.length; i++) {
            reversedSentence += r1[i] + " ";
        }
        System.out.println(reversedSentence);

        // Output: "Java love I"
    }
}
