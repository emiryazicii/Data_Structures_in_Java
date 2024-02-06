package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9));
        int nonZeroIndex = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 0) {
                Collections.swap(numbers, i, nonZeroIndex);
                nonZeroIndex++;
            }
        }
        System.out.println(numbers);
    }
}
/*
5. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */

