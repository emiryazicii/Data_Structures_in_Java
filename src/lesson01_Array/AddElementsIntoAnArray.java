package lesson01_Array;

import java.util.Arrays;

public class AddElementsIntoAnArray {

    /**
     * Adds an element to the end of an integer array.
     *
     * @param array   The original integer array.
     * @param element The element to be added to the array.
     * @return The new array with the element added at the end.
     */
    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    /**
     * Adds an element to the end of a double array.
     *
     * @param array   The original double array.
     * @param element The element to be added to the array.
     * @return The new array with the element added at the end.
     */
    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    /**
     * Adds an element to the end of a string array.
     *
     * @param array   The original string array.
     * @param element The element to be added to the array.
     * @return The new array with the element added at the end.
     */
    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static void main(String[] args) {

        // Adding an element to an integer array
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        System.out.println(Arrays.toString(newArray));

        System.out.println("---------------------------------------------------------------");

        // Adding elements to integer arrays using custom method
        int[] numbers = {100, 90, 80, 70, 60};
        System.out.println(Arrays.toString(numbers));
        numbers = addElement(numbers, 50);
        System.out.println(Arrays.toString(numbers));

        // Adding elements to double arrays using custom method
        double[] nums = {1.5, 2.5, 3.5, 4.5};
        nums = addElement(nums, 5.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------------------------------------");

        // Adding elements to string arrays using custom method
        String[] students = {"Yasin", "Sumeye", "Ermek"};
        students = addElement(students, "Umran");
        students = addElement(students, "Kamil");
        students = addElement(students, "Recep");
        System.out.println(Arrays.toString(students));
    }
}
