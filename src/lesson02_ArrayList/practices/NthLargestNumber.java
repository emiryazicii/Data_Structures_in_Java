package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        Collections.reverse(numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        for (Integer each : numbers) {
            if (!newNumbers.contains(each)){
                newNumbers.add(each);
            }
        }
        System.out.println(newNumbers.get(n-1));
    }
}
/*
4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4

 */

