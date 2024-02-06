package lesson01_Array.practices;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        // Test Case 3: Invalid array size (Negative)
        displayFibonacciSeries(-10);
        // Expected result : It should print error message(Fibonacci array size can't be negative , 0 or 1 .)

    }
    public static void displayFibonacciSeries(int howManyElement){

        if(howManyElement <= 1){
            System.err.println("Fibonacci array size can't be negative , 0 or 1 .");
            return;
        }

        int[] array = new int[howManyElement];
        array[0] = 0;
        array[1] = 1;
        for (int i = 1; i < array.length-1; i++) {
            array[i+1] = array[i] + array[i-1];
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
Fibonacci [IQ][problem-solving, array, loop]

    the Fibonacci sequence is a sequence of numbers that are built by calculating the sum of the previous two numbers
    the sequence always starts with 0 and 1 and to calculate the rest of the sequence the previous two numbers are added together
    for example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        0 + 1 -> 1
        1 + 1 -> 2
        1 + 2 -> 3
        2 + 3 -> 5
        etc

    create an array, with size n, with the elements being the Fibonacci sequence
    if n is 10 then give 10 numbers of the sequence
    if n is 20 then given 20 numbers of the sequence
 */

