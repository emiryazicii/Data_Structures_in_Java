package lesson01_Array;

public class MaxAndMinNumbersOfMultiDimensionalArray {

    public static void main(String[] args) {

        // Define the two-dimensional array
        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

        // Initialize variables to hold maximum and minimum values
        int max = array[0][0]; // Initialize max with the first element of the array
        int min = array[0][0]; // Initialize min with the first element of the array

        // Iterate over each row (eachList) in the two-dimensional array
        for (int[] eachList : array) {
            // Iterate over each element (elements) in the current row
            for (int elements : eachList) {
                // Check if the current element is greater than max, update max if true
                if (elements > max) {
                    max = elements;
                }
                // Check if the current element is smaller than min, update min if true
                if (elements < min) {
                    min = elements;
                }
            }
        }

        // Print the maximum and minimum values found in the two-dimensional array
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
