package lesson01_Array.practices;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {

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

        System.out.println("For the subarray what's the beginning index ? :");
        int start = input.nextInt();
        System.out.println("What's the ending index ? : ");
        int end = input.nextInt();

        input.close();
        System.out.println("Here is the subarray: ");
        System.out.println(Arrays.toString(subArray(arr,start,end)));

    }
    public static int[] subArray(int[] arr, int start , int end){

        int[] subArray = new int[end-start];

        for (int i = 0 ; i < subArray.length; i++) {

            subArray[i] = arr[start++];
        }
        return subArray;
    }
}
/*
 subArray(int[] arr, int start, int end)
        create a method that will return part of the array back. The part of sub-array will be based on the start the end indexes. The end index is not included

        Ex:
          subArray({3, 4, 1, 5, 6, 5}, 0, 3) -> {3, 4, 1}
          subArray({3, 4, 1, 5, 6, 5}, 2, 5) -> {1, 5, 6}
          subArray({3, 4, 1, 5, 6, 5}, 1, 6) -> {4, 1, 5, 6, 5}
 */

