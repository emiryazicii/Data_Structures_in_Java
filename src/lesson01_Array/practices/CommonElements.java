package lesson01_Array.practices;

public class CommonElements {

    /**
     * Prints the common elements from two integer arrays.
     *
     * @param arr1 the first integer array
     * @param arr2 the second integer array
     */
    public static void printCommonElements(int[] arr1, int[] arr2) {
        // String to store common elements
        String temp = "";

        // Loop through the first array
        for (int i = 0; i < arr1.length; i++) {
            // Loop through the second array
            for (int j = 0; j < arr2.length; j++) {
                // Check if the elements are equal and not already added to the common elements string
                if (arr1[i] == arr2[j] && !temp.contains("" + arr1[i])) {
                    // Add the common element to the string
                    temp += arr1[i] + " ";
                }
            }
        }

        // Print the common elements
        System.out.println(temp);
    }

    public static void main(String[] args) {
        // Two integer arrays
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 6, 4};

        // Print the common elements
        printCommonElements(arr1, arr2);
    }
}
