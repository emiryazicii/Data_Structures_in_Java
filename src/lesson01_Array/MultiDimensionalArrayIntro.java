package lesson01_Array;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {


        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {10,20,30,40,50};
        int[] ar3 = {100,200};
        int[] ar4 = {1000};

        System.out.println("------------------------------------------------");

        int[][] array2D = {ar1,ar2,ar3,ar4}; // index: 0 ~ 3
        // index           0    1    2   3
        System.out.println(array2D.length);

        System.out.println(Arrays.toString(array2D[1]));
        System.out.println(Arrays.toString(array2D[2]));
        System.out.println(Arrays.toString(array2D[0]));

        System.out.println("-------------------------------------------------");

        System.out.println(array2D[0][1]);
        System.out.println(array2D[0][2]);
        System.out.println(array2D[0][3]);
        System.out.println(array2D[1][2]);
        System.out.println("---------------------------------------------------");
    }
}
