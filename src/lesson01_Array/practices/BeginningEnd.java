package lesson01_Array.practices;

import java.util.Arrays;

public class BeginningEnd {

    /**
     * Finds the names that start and end with the same character.
     *
     * @param names an array of strings representing names
     * @return an array of strings containing names that start and end with the same character
     */
    public static String[] findBeginningEnd(String[] names) {
        // Initialize an array to store names that start and end with the same character
        String[] names2 = new String[names.length];
        int count = 0;

        // Loop through each name
        for (String each : names) {
            // Check if the first and last characters are equal ignoring case
            if (each.substring(0, 1).equalsIgnoreCase(each.substring(each.length() - 1))) {
                // Add the name to the new array if the condition is met
                names2[count] = each;
                count++;
            }
        }

        // Resize the array to remove null values
        names2 = Arrays.copyOf(names2, count);
        return names2;
    }

    public static void main(String[] args) {
        // Array of names
        String[] names = {"Mukerrem", "Aurelio", "Huseyin", "Necla", "Oswaldo", "Emre", "Nathan", "Anna", "Norman"};

        // Find names that start and end with the same character
        String[] result = findBeginningEnd(names);

        // Print the count of such names
        System.out.println(result.length + " names starts and ends with the same character.");

        // Print the new array
        System.out.println("Here is the new array");
        System.out.println(Arrays.toString(result));
    }
}
