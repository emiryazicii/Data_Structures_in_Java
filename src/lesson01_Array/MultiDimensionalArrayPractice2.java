package lesson01_Array;

import java.util.Arrays;

/**
 * This class demonstrates the usage of multi-dimensional arrays in Java.
 */
public class MultiDimensionalArrayPractice2 {


    //The main method to demonstrate multi-dimensional arrays.
    public static void main(String[] args) {

        int[][] arr2D1 = {{1, 2}, {3, 4, 5}};
        int[][] arr2D2 = {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}};
        int[][] arr2D3 = {{15, 16, 17, 18}};

        int[][][] arr3D = {arr2D1, arr2D2, arr2D3};

        // Printing the entire 3D array
        System.out.println(Arrays.deepToString(arr3D));

        // Printing the second 2D array in the 3D array
        System.out.println(Arrays.deepToString(arr3D[1]));

        // Printing the first 1D array in the second 2D array of the 3D array
        System.out.println(Arrays.toString(arr3D[0][1]));

        // Printing the first 1D array in the first 2D array of the 3D array
        System.out.println(Arrays.toString(arr3D[1][0]));

        // Printing the third element of the second 1D array in the first 2D array of the 3D array
        System.out.println(arr3D[0][1][2]);

        System.out.println("------------------------------------------------------------------------------------");

        // Looping through each 2D array in the 3D array
        for (int i = 0; i < arr3D.length; i++) {
            int[][] each2DArray = arr3D[i]; // Get the current 2D array
            System.out.println(Arrays.deepToString(each2DArray)); // Print the 2D array

            // Looping through each 1D array in the current 2D array
            for (int j = 0; j < each2DArray.length; j++) {
                int[] each1DArray = each2DArray[j]; // Get the current 1D array
                System.out.println(Arrays.toString(each1DArray)); // Print the 1D array

                // Looping through each element in the current 1D array
                for (int eachElement : each1DArray) {
                    System.out.println(eachElement); // Print each element
                }
            }
        }
    }
}
