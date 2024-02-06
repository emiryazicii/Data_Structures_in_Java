package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestCountry {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many country you want in your array: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("Enter the country names: ");
        String[] countries = new String[num];

        for (int i = 0; i < num; i++) {

            countries[i] = input.nextLine();
        }
        System.out.println("Thanks, here is the array that you created");
        System.out.println(Arrays.toString(countries));
        System.out.println("Here is the smallest country/ies : ");

        int min = countries[0].length();
        for (String each : countries) {
            if (each.length() < min) {
                min = each.length();
            }
        }
        for (String each2 : countries) {
            if (each2.length() == min) {
                System.out.println(each2);
            }
        }
        input.close();
    }
}
/*
Create a program that defines an array of countries.
 Use the countries defined below or create your own array that has different country names.
 Use the countries to display different information defined in the mini tasks.
- Find the largest and smaller countries based on the length of their names
 */

