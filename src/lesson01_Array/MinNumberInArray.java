package lesson01_Array;

public class MinNumberInArray {

    public static void main(String[] args) {

        // Declare and initialize the array
        int[] numbers = {100, 20, 500, 40, -10, 30};

        // Assume that the first element is the minimum number
        int min = numbers[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {

            // Compare each element with the current minimum number
            if (numbers[i] < min) {
                // If the current element is smaller, update the minimum number
                min = numbers[i];
            }
        }

        // Print the minimum number
        System.out.println("min = " + min);
    }
}
