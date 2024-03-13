package lesson01_Array.practices;

public class OddOrEven {

    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Initialize counters for even and odd numbers
        int countEven = 0, countOdd = 0;

        // Iterate through each number in the array
        for (int each : numbers) {
            // Check if the number is even
            if (each % 2 == 0) {
                countEven++; // Increment count for even numbers
            } else {
                countOdd++; // Increment count for odd numbers
            }
        }

        // Print the counts of even and odd numbers
        System.out.println("Even numbers count: " + countEven + "\nOdd numbers count: " + countOdd);
    }
}
