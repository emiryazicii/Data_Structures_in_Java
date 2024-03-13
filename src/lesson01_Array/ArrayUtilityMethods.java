package lesson01_Array;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {
        // Array initialization
        int[] score = {70, 100, 80, 90, 65};

        // Printing the array using Arrays.toString() method
        System.out.println(Arrays.toString(score));

        // Storing the array as a string
        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("--------------------------------------------------------------");

        // Comparing arrays for equality
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};
        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};
        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};
        boolean r3 = Arrays.equals(s1, s2);
        System.out.println(r3);

        System.out.println("-------------------------------------------------------------");

        // Sorting arrays
        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length - 1]);

        System.out.println("--------------------------------------------------------------");

        // Sorting and comparing arrays of strings
        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};
        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1, b2));

        // Sorting arrays of strings
        String[] students = {"Yaxier", "Madivar", "Ali", "Abidullah", "Alena"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------------");

        // Copying arrays
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int[] array2 = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(array2));

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        // Combining two arrays
        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("--------------------------------------------------");

        // Copying and slicing arrays
        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] result1 = Arrays.copyOf(ch, 20);
        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5);
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(Arrays.toString(result3));
    }
}
