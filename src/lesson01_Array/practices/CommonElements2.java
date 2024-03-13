package lesson01_Array.practices;

public class CommonElements2 {

    /**
     * Prints the common elements from two integer arrays using for-each loops.
     *
     * @param arr1 the first integer array
     * @param arr2 the second integer array
     */
    public static void printCommonElements(int[] arr1, int[] arr2) {
        // String to store common elements
        String commonElements = "";

        // Iterate through each element in arr1
        for (int each : arr1) {
            // Iterate through each element in arr2
            for (int each2 : arr2) {
                // Check if the elements are equal and not already added to the common elements string
                if (each == each2 && !commonElements.contains("" + each)) {
                    // Add the common element to the string
                    commonElements += each + " ";
                }
            }
        }

        // Print the common elements
        System.out.print("Common Elements: " + commonElements);
    }

    public static void main(String[] args) {
        // Two integer arrays
        int[] arr1 = {1, 2, 4, 3, 6};
        int[] arr2 = {12, 8, 2, 4, 5};

        // Print the common elements
        printCommonElements(arr1, arr2);
    }
}
