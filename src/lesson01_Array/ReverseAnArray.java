package lesson01_Array;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] reverse = new int[array.length];

        for (int i = array.length - 1,j = 0; i >= 0; i--,j++) {

            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("----------------------------------------");

        int[] nums = {100,200,300,400,500};

        nums = ArrayUtils.reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------------------");

        double[] d1 = {10.5,60,5,30.4,90.4};

        d1 = ArrayUtils.reverse(d1);

        System.out.println(Arrays.toString(d1));

    }
}
