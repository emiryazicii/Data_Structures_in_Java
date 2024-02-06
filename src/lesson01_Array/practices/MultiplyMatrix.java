package lesson01_Array.practices;

import java.util.Arrays;

public class MultiplyMatrix {

    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3},{5,2,1}};
        int[][] arr2 = {{25,3,5},{0,1,19}};
        int[][] arr3 = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr3.length ; i++) {
            for (int j = 0; j < arr3[i].length ; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr3));
    }
}
/*
T1MultiplyMatrix [multidimensional array]

Create a program that will take two given 2D int array that have the same number of elements and multiply the matrices together. Each number is multiplied with each other number in the same position
Print the result as a separate 2D array

    Ex: array 1                 array 2
     [[1, 2, 3], [5, 2, 1]] * [[25, 3, 5], [0, 1, 19]]
     result:
        [[25, 6, 15], [0, 2, 19]]
 */

