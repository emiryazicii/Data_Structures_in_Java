package lesson01_Array.practices;

import java.util.Arrays;

public class BeginningEnd {

    public static void main(String[] args) {

        String[] names = {"Mukerrem", "Aurelio", "Huseyin", "Necla", "Oswaldo", "Emre", "Nathan", "Anna", "Norman"};

        String[] names2 = new String[names.length];
        int count = 0;

        for (String each : names) {
            if (each.substring(0, 1).equalsIgnoreCase(each.substring(each.length() - 1))) {
                names2[count] = each;
                count++;
            }
        }
        names2 = Arrays.copyOf(names2, count);
        System.out.println(count+ " names starts and ends with the same character.");
        System.out.println("Here is the new array");
        System.out.println(Arrays.toString(names2));
    }
}
