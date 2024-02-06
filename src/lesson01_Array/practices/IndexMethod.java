package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class IndexMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many integer numbers you want to enter in your array : ");
        int howManyElement = input.nextInt();
        System.out.println("Enter the integer numbers : ");
        int[] arr = new int[howManyElement];

        for (int i = 0; i < howManyElement; i++) {

            arr[i] = input.nextInt();
        }
        System.out.println("Your array is created.");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter which element are you looking for the index number");
        int element = input.nextInt();
        System.out.println("Here is the index number of the element : ");

        System.out.println(indexOf(arr,element));
        input.close();
    }
    public static int indexOf(int[] arr, int element) {

        int count = 0;
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == element){
                index = i;
                count++;
            }
            if (count == 0){
                index = -1;
            }
        }
        return index;
    }
}
/*
ArrayUtils [array, loop, method]

    Create these two utility methods for array objects

    indexOf(int[] arr, int element)
        create a method that will search for and return the index of the given element in the array.
            if there is multiple of that element return the first occurrence
            if the element does not exist return -1

        Ex:
            indexOf({3, 4, 1, 5, 6, 5}, 5) -> 3
            indexOf({3, 4, 1, 5, 6, 5}, 7) -> -1
            indexOf({3, 4, 1, 5, 6, 5}, 3) -> 0

 */

