package lesson01_Array.practices;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageEach {

    public static void main(String[] args) {

        int[][] nums = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 20}};
        System.out.println(printAverage(nums));
    }
    public static String printAverage(int[][] arr) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = "";
        double sum = 0 , sumAll = 0;
        int elementCount = 0;

        for (int i = 0; i < arr.length; i++) {
            str += "Average of :" + Arrays.toString(arr[i]) + " is ";
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                sumAll += arr[i][j];
                elementCount++;
            }
            str += decimalFormat.format(sum / arr[i].length)+"\n";
            sum = 0;
        }
        return str+"Average of all is : "+decimalFormat.format(sumAll/elementCount);
    }
}
/*
AverageEach [multidimensional, loop]

    Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

    Ex:


        output:
            average of: [3, 4, 5, 6] is 4.5
            average of: [5, 2, 6] is 4.33
            average of: [10, 40, 20] is 23.33
            average of all is 10.1
 */

