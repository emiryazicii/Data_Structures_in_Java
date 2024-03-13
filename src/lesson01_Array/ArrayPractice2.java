package lesson01_Array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {
        // Creating an array of 100 integers and populating it with consecutive numbers from 1 to 100
        int[] arr1 = new int[100];
        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
        // Printing the array
        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------------------------------------");

        // Creating another array of 100 integers and populating it with consecutive numbers from 100 to 1
        int[] arr2 = new int[100];
        for (int i = 0, j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }
        // Printing the array
        System.out.print(Arrays.toString(arr2));
    }
}
