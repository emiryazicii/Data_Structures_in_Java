package lesson01_Array.practices;

import java.util.Arrays;

public class StartsWith {

    public static void main(String[] args) {
        // Array of country names
        String[] countries = {"Cuba", "Fiji", "Togo", "Colombia", "Cyprus"};

        // Count the number of countries starting with 'C' or 'c'
        int count = 0;
        for (String country : countries) {
            if (country.startsWith("C") || country.startsWith("c")) {
                count++;
            }
        }

        // Array to store countries starting with 'C' or 'c'
        String[] startWithC = new String[count];

        // Populate the array with countries starting with 'C' or 'c'
        int i = 0;
        for (String country : countries) {
            if (country.startsWith("C") || country.startsWith("c")) {
                startWithC[i++] = country;
            }
        }

        // Print the countries starting with 'C' or 'c'
        System.out.println("Here are the countries that start with \"C\":");
        System.out.println(Arrays.toString(startWithC));
    }
}
