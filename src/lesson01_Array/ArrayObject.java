package lesson01_Array;

import java.util.Arrays;

public class ArrayObject {

    public static void main(String[] args) {
        // Arrays of integers
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1; // arr2 points to the same memory location as arr1
        int[] arr3 = arr2; // arr3 also points to the same memory location as arr1 and arr2

        // Modifying elements in arr1, arr2, or arr3 affects all three arrays
        arr1[0] = 1000;
        arr2[2] = 3000;

        // Printing the arrays
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));

        System.out.println("--------------------------------------------------");

        // Arrays of strings
        String[] a1 = {"Umran", "Mehmet"};
        // Creating a new array and assigning it to a1
        a1 = new String[]{"James", "Daniel"};

        // Printing the new contents of a1
        System.out.println("a1: " + Arrays.toString(a1));
    }
}
