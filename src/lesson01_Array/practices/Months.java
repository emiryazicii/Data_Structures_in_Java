package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class Months {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the months in order
        System.out.println("Enter the month names in order: ");
        String[] months = new String[12];
        for (int i = 0; i < 12; i++) {
            months[i] = input.nextLine();
        }

        // Display the array of months
        System.out.println("Thanks, here is the array that you created: ");
        System.out.println(Arrays.toString(months));

        // Prompt the user to enter a number representing a month
        System.out.println("Enter a number to see the corresponding month: ");
        int num = input.nextInt();

        // Validate the user input and print the corresponding month
        if (num >= 1 && num <= 12) {
            System.out.println(months[num - 1]);
        } else {
            // Loop until the user enters a valid number
            do {
                System.err.println("Invalid entry, please reenter (1-12): ");
                num = input.nextInt();
            } while (num < 1 || num > 12);

            System.out.println(months[num - 1]);
        }
        input.close();
    }
}
