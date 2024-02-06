package lesson01_Array.practices;

import java.util.Arrays;

public class StartsWith {

    public static void main(String[] args) {


        String[] countries = {"Cuba", "Fiji","Togo","Colombia","Cyprus"};

        int count = 0;
        for (String each : countries) {
            if (each.startsWith("C") || each.startsWith("c")) {
                count++;
            }
        }
        String[] startWithC = new String[count];

        int i = 0;
        for (String each2 : countries) {
            if (each2.startsWith("C") || each2.startsWith("c")) {
                startWithC[i++] = each2;
            }
        }
        System.out.println("Here is the countries starts with \"C\" ");
        System.out.println(Arrays.toString(startWithC));
    }
}
/*
 Create a program that defines an array of countries.
 Use the countries defined below or create your own array that has different country names.
 Use the countries to display different information defined in the mini tasks.

   - Show all the countries that start with a 'C'

 */

