package lesson01_Array.practices;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0,3,5,8,0,5,0};

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                for (int j = i + 1; j < array.length; j++) {

                    if (array[j] != 0) {

                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;


                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */

