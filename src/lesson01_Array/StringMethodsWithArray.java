package lesson01_Array;

import java.util.Arrays;

public class StringMethodsWithArray {

    public static void main(String[] args) {


        String str = "Cydeo School";

        char[] c1 = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(c1));


        System.out.println("------------------------------------------------------------------------------");

        String str2 = "Today is a great day to learn java";

        String[] s1 = str2.split(" ");

        System.out.println(Arrays.toString(s1));

        System.out.println("---------------------------------------------------------------------------------");

        String sentence = "I love Java";

        String[] o1 = sentence.split(" ");

        String[] r1 = ArrayUtils.reverse(o1);

        System.out.println(Arrays.toString(r1));

        String reversedSentence = "";

        for (int i = 0; i < r1.length; i++) {
            reversedSentence += r1[i] + " ";
        }

        System.out.println(reversedSentence);

        // "Java love I"
    }
}
