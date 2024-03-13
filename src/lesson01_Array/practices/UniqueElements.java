package lesson01_Array.practices;

public class UniqueElements {

    /**
     * Finds and prints the unique elements from an integer array.
     *
     * @param numbers The array containing integer elements.
     */
    public static void findUniqueElements(int[] numbers) {
        String uniqueElements = "";

        // Iterate through each element in the array
        for (int each : numbers) {
            int elementCount = 0;

            // Count the occurrences of the current element in the array
            for (int each2 : numbers) {
                if (each == each2) {
                    elementCount++;
                }
            }

            // If the element occurs only once, add it to the uniqueElements string
            if (elementCount == 1) {
                uniqueElements += each + " ";
            }
        }

        // Print the unique elements found in the array
        System.out.println("Unique Elements: " + uniqueElements);
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 9, 8, 7, 7};

        // Find and print the unique elements from the array
        findUniqueElements(numbers);
    }
}
