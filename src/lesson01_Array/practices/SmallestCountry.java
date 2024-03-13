package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestCountry {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of countries in the array
        System.out.println("Enter how many countries you want in your array: ");
        int num = input.nextInt();
        input.nextLine(); // Consume the newline character

        // Prompt the user to enter the country names
        System.out.println("Enter the country names: ");
        String[] countries = new String[num];

        // Populate the array with user input
        for (int i = 0; i < num; i++) {
            countries[i] = input.nextLine();
        }

        // Print the array of countries
        System.out.println("Thanks, here is the array that you created:");
        System.out.println(Arrays.toString(countries));

        // Find the smallest country/ies based on their lengths
        System.out.println("Here is the smallest country/ies: ");

        // Find the length of the smallest country name
        int min = countries[0].length();
        for (String country : countries) {
            if (country.length() < min) {
                min = country.length();
            }
        }

        // Print the smallest country/ies
        for (String country : countries) {
            if (country.length() == min) {
                System.out.println(country);
            }
        }

        // Close the Scanner object to prevent resource leak
        input.close();
    }
}
