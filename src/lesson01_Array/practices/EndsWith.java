package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class EndsWith {

    /**
     * Displays countries from the array that end with 's' or 'S'.
     *
     * @param countries the array of country names
     */
    public static void displayCountriesEndingWithS(String[] countries) {
        System.out.println("Here are the countries that end with \"s\":");
        for (String country : countries) {
            // Check if the country name ends with 's' or 'S'
            if (country.endsWith("s") || country.endsWith("S")) {
                System.out.println(country);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of countries from the user
        System.out.println("Enter how many countries you want in your array:");
        int num = input.nextInt();
        input.nextLine();

        // Create an array to store country names
        System.out.println("Enter the country names:");
        String[] countries = new String[num];
        for (int i = 0; i < num; i++) {
            // Read country names from the user
            countries[i] = input.nextLine();
        }

        // Display the array of countries
        System.out.println("Thanks! Here is the array that you created:");
        System.out.println(Arrays.toString(countries));

        // Display countries ending with 's'
        displayCountriesEndingWithS(countries);

        input.close();
    }
}
