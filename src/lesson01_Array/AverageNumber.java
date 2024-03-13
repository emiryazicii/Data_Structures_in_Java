package lesson01_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Take input from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
        }

        // Calculate and display results
        displayResults(numbers);
    }

    /**
     * Calculate and display sum and average of numbers
     * @param numbers Array of numbers
     */
    private static void displayResults(int[] numbers) {
        // Calculate sum of numbers
        int sum = calculateSum(numbers);

        // Calculate average of numbers
        double average = calculateAverage(numbers, sum);

        // Display results
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    /**
     * Calculate sum of numbers in the array
     * @param numbers Array of numbers
     * @return Sum of numbers
     */
    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Calculate average of numbers in the array
     * @param numbers Array of numbers
     * @param sum Sum of numbers
     * @return Average of numbers
     */
    private static double calculateAverage(int[] numbers, int sum) {
        return (double) sum / numbers.length;
    }
}
