package lesson01_Array.practices;

import java.util.Arrays;

public class MultiplyMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {5, 2, 1}};
        int[][] arr2 = {{25, 3, 5}, {0, 1, 19}};
        int[][] arr3 = new int[arr1.length][arr1[0].length];

        // Multiply the matrices
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        // Print the result
        System.out.println(Arrays.deepToString(arr3));
    }
}
