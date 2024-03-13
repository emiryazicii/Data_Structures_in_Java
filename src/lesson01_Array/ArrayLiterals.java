package lesson01_Array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {
        // Initializing an array with a specific size
        int[] numbers = new int[5];

        // Initializing an array with array literal
        int[] nums = {10, 20, 30, 40, 50}; // Array literal

        // Printing the lengths of the arrays
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of nums array: " + nums.length);

        // Printing the contents of the arrays
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        // Separator
        System.out.println("---------------------------------------------------------");

        // Array of days of the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Accessing a specific day
        int n = 1;
        System.out.println("Day " + n + ": " + days[n - 1]);

        // Separator
        System.out.println("-------------------------------------------------------------");

        // Array of months
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Printing the array of months
        System.out.println("months = " + Arrays.toString(months));

        // Separator
        System.out.println("--------------------------------------------------------------------");

        // Printing months array in reverse order
        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }
    }
}
