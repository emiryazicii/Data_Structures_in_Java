package lesson01_Array;

/**
 * This class demonstrates the usage of 4-dimensional arrays in Java.
 */
public class MultiDimensionalArrayPractice3 {


     //The main method to demonstrate 4-dimensional arrays.
    public static void main(String[] args) {

        int [][][] arr3D1 = {{{1,2},{3,4,5}},{{6,7,8,9},{12,13,14}}};
        int [][][] arr3D2 = {{{1,2},{3,4,5}},{{6,7,8,9},{12,13,14}}};
        int [][][] arr3D3 = {{{1,2},{3,4,5}},{{6,7,8,9},{12,13,14}}};

        int[][][][] arr4D = {arr3D1,arr3D2,arr3D3};

        // Iterating through each element of the 4D array and printing it
        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }
    }
}
