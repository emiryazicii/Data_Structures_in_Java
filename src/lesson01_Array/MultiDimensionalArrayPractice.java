package lesson01_Array;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    /**
     * Prints the contents of a 2D array of strings.
     * @param groups The 2D array containing groups of strings.
     */
    public static void printGroups(String[][] groups) {
        for (int i = 0; i < groups.length; i++) { // Loop through each group
            String[] eachGroup = groups[i]; // Get the current group
            System.out.println(Arrays.toString(eachGroup)); // Print the group
            for (String each : eachGroup) { // Loop through each name in the group
                System.out.println(each); // Print each name
            }
        }
    }

    /**
     * Prints the contents of a 2D array of strings in reverse order.
     * @param groups The 2D array containing groups of strings.
     */
    public static void printReversedGroups(String[][] groups) {
        for (int i = groups.length - 1; i >= 0; i--) { // Loop through each group in reverse order
            String[] reversed = groups[i]; // Get the current group
            System.out.println(Arrays.toString(reversed)); // Print the group
            for (int j = reversed.length - 1; j >= 0; j--) { // Loop through each name in the group in reverse order
                System.out.println(reversed[j]); // Print each name
            }
        }
    }

    /**
     * Main method to test MultiDimensionalArrayPractice class.
     */
    public static void main(String[] args) {
        String[] group1 = {"Emir","Ceyhun","Mesut","Recai"};
        String[] group2 = {"Merve","Bahar","Beyza"};
        String[] group3 = {"Hayri","Nuri","Hatice","Sukran","Mehmet"};
        String[] group4 = {"Evren","Mirac"};

        String[][] groups = {group1,group2,group3,group4};

        // Printing groups
        printGroups(groups);

        System.out.println("----------------------------------------------------------------");

        // Printing groups in reverse order
        printReversedGroups(groups);

        System.out.println("----------------------------------------------------------------");

        // Printing groups using deepToString method
        System.out.println(Arrays.deepToString(groups));
    }
}
