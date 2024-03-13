package lesson01_Array;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        // Define individual 1D arrays
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = {10, 20, 30, 40, 50};
        int[] ar3 = {100, 200};
        int[] ar4 = {1000};

        System.out.println("------------------------------------------------");

        // Create a 2D array containing the individual 1D arrays
        int[][] array2D = {ar1, ar2, ar3, ar4}; // index: 0 ~ 3
        // Indexes:       0     1     2    3
        System.out.println(array2D.length); // Print the length of the 2D array

        // Access and print elements of specific 1D arrays within the 2D array
        System.out.println(Arrays.toString(array2D[1])); // Print elements of the second array
        System.out.println(Arrays.toString(array2D[2])); // Print elements of the third array
        System.out.println(Arrays.toString(array2D[0])); // Print elements of the first array

        System.out.println("-------------------------------------------------");

        // Access and print specific elements within the 2D array
        System.out.println(array2D[0][1]); // Access the second element of the first array
        System.out.println(array2D[0][2]); // Access the third element of the first array
        System.out.println(array2D[0][3]); // Access the fourth element of the first array
        System.out.println(array2D[1][2]); // Access the third element of the second array

        System.out.println("---------------------------------------------------");
    }
}
