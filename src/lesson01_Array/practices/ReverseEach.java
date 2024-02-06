package lesson01_Array.practices;

import java.util.Arrays;

public class ReverseEach {

    public static void main(String[] args) {

        String sentence = "Everything that has a beginning has an end";

        String[] array = sentence.split(" ");
        String[] newArray = new String[array.length];

        int j = 0;
        for (String each : array) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            newArray[j] = reversed;
            j++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
