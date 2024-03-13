package lesson01_Array;

public class MaxNumberInArray {

    public static void main(String[] args) {

        // Define the array of numbers
        int[] numbers = {100,20,500,40,-10,30};

        // Assume that the first element of the array is the maximum number
        int max = numbers[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {

            // Compare the current element of the array with the current maximum
            if(numbers[i] > max) {
                // If the current element is greater than the current maximum, update the maximum
                max = numbers[i];
            }
        }

        // Print the maximum number found in the array
        System.out.println("max = " + max);
    }
}
