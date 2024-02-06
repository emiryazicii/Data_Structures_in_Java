package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class EndsWith {

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
        System.out.println("Here is the countries that ends with \"s\" : ");

        for (String each : countries) {
            if (each.endsWith("s") || each.endsWith("S")){
                System.out.println(each);
            }
        }
        input.close();
    }
}
/*
Create a program that defines an array of countries.
 Use the countries defined below or create your own array that has different country names.
 Use the countries to display different information defined in the mini tasks.

- Show all the countries that end with an 's'
 */

