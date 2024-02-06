package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the months names by order : ");
        String[] countries = new String[12];

        for (int i = 0; i < 12; i++) {
            countries[i] = input.nextLine();
        }
        System.out.println("Thanks, here is the array that you created: ");
        System.out.println(Arrays.toString(countries));

        System.out.println("Enter a number and see to month result: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 12) {
            System.out.println(countries[num - 1]);
        }else {

            do {
                System.err.println("Invalid entry, please reenter: ");
                num = input.nextInt();

            }while(num < 0 || num > 12);

            System.out.println(countries[num-1]);
        }
        input.close();
    }
}
/*
Months [array]

	Create a program that will define an array with all the months in order. Use this array to help print the full name of a month by giving a number

	Ex:
		input: 1
		output: January

		input: 11
		output: November

	Other variations of this task we have done before: word to number, number to word
 */

