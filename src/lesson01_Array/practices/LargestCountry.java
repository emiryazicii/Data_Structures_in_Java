package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class LargestCountry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of countries
        System.out.println("Enter how many countries you want in your array: ");
        int num = input.nextInt();
        input.nextLine();

        // Prompt the user to enter country names
        System.out.println("Enter the country names: ");
        String[] countries = new String[num];
        for (int i = 0; i < num; i++) {
            countries[i] = input.nextLine();
        }

        // Display the array of countries
        System.out.println("Thanks, here is the array that you created: ");
        System.out.println(Arrays.toString(countries));

        // Find the largest country/countries based on the length of their names
        System.out.println("Here is the largest country/ies : ");
        int maxLength = 0; // Variable to store the maximum length of country name
        for (String country : countries) {
            // Update maxLength if current country name is longer
            if (country.length() > maxLength) {
                maxLength = country.length();
            }
        }

        // Print country/countries with maximum length
        for (String country : countries) {
            if (country.length() == maxLength) {
                System.out.println(country);
            }
        }
        input.close();
    }
}
