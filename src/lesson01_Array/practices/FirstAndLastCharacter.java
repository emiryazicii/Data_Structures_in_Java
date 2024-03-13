package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastCharacter {

    /**
     * Finds and prints the first and last characters of each country name in the array.
     *
     * @param countries the array of country names
     */
    public static void printFirstAndLastCharacter(String[] countries) {
        System.out.println("First and last letter of each country that you entered:");
        for (String country : countries) {
            // Print the first character of the country name
            System.out.print(country.substring(0, 1));
            // Print the last character of the country name
            System.out.print(country.substring(country.length() - 1) + " ");
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

        // Print the first and last characters of each country
        printFirstAndLastCharacter(countries);

        input.close();
    }
}
