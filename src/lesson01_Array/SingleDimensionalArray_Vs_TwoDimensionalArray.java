package lesson01_Array;

import java.util.Arrays;

public class SingleDimensionalArray_Vs_TwoDimensionalArray {

    public static void main(String[] args) {
        // Creating a single-dimensional array of size 10
        int[] arr1D = new int[10];

        // Printing the contents of the single-dimensional array
        System.out.println("Single-dimensional array: " + Arrays.toString(arr1D));

        // Initializing five single-dimensional arrays with different values
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 17, 20};

        // Creating a two-dimensional array of size 5
        int[][] arr2D = new int[5][];

        // Assigning single-dimensional arrays to the elements of the two-dimensional array
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        // Printing the contents of the two-dimensional array
        System.out.println("Two-dimensional array: " + Arrays.deepToString(arr2D));
    }
}
