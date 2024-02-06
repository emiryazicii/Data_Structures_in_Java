package lesson01_Array.practices;

import java.util.Arrays;

public class ShiftLeft {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};

        int[] shiftedArray = new int[array.length];
        shiftedArray[shiftedArray.length-1] = array[0];

        for (int i = 0; i < shiftedArray.length-1; i++) {

            shiftedArray[i] = array[i+1];
        }
        System.out.println(Arrays.toString(shiftedArray));
    }
}
