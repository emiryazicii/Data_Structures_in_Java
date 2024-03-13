package lesson01_Array.practices;

import java.text.DecimalFormat;
import java.util.Arrays;

public class AverageEach {

    /**
     * Calculates the average of each inner array and the average of the whole 2D array.
     *
     * @param arr 2D integer array
     * @return a string representation of the averages
     */
    public static String printAverage(int[][] arr) {
        // DecimalFormat to format the average values
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // String to store the output
        String str = "";

        // Variables to calculate the sum and count of elements
        double sum = 0, sumAll = 0;
        int elementCount = 0;

        // Loop through the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Append the current array to the output string
            str += "Average of :" + Arrays.toString(arr[i]) + " is ";

            // Loop through the inner array to calculate the sum
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                sumAll += arr[i][j];
                elementCount++;
            }

            // Calculate the average of the current inner array and append to the output string
            str += decimalFormat.format(sum / arr[i].length) + "\n";

            // Reset the sum for the next inner array
            sum = 0;
        }

        // Calculate the overall average and append to the output string
        return str + "Average of all is : " + decimalFormat.format(sumAll / elementCount);
    }

    public static void main(String[] args) {
        // Define a 2D array
        int[][] nums = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 20}};

        // Print the result
        System.out.println(printAverage(nums));
    }
}


