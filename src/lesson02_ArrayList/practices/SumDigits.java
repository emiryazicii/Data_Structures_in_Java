package lesson02_ArrayList.practices;

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("123", "52", "513"));
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (String eachString : arr) {
            int sum = 0;
            for (int i = 0; i < eachString.length(); i++) {
                sum += Integer.parseInt(String.valueOf(eachString.charAt(i)));
            }
            arr2.add(sum);
        }
        System.out.println(arr2);
    }
}

/*
SumDigits [Wrapper class, ArrayList, loop]

    Create a program that will define an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Print all the sums of the digits at the end.

        Ex:
            Input:
            ["123","52","513"]
            Output:
            [6, 7, 9]

 */

