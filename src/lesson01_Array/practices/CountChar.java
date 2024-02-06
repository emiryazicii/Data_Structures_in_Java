package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many element you want to enter in your array? : ");
        int howManyElement = input.nextInt();
        input.nextLine();
        System.out.println("Enter the elements : ");
        String[] arr = new String[howManyElement];

        for (int i = 0; i < howManyElement; i++) {

            arr[i] = input.nextLine();
        }
        System.out.println("Your array is created.");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the letter that you want to count : ");
        char letter = input.next().charAt(0);
        input.close();
        System.out.println("Here is the result");
        System.out.println(countChar(arr,letter));
    }
    public static int countChar(String[] arr, char letter ){

        int countChar = 0;
        for (String each : arr) {
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == letter){
                    countChar++;
                }
            }
        }
        return countChar;
    }
}
/*
CountChar [Array, String, loop]

    Create a method that defines a String array and a char letter. Return how many times the given char letter is found in all the elements of the array

        Ex:
        Input:
            "java", "html", "css", "java", "javascript", "selenium"
            letter: ‘a’
        Output:
            6
 */

