package lesson01_Array;

import java.util.Arrays;

public class ArrayUtils {

    /**
     * Merges two integer arrays into a single array.
     *
     * @param arr1 First integer array
     * @param arr2 Second integer array
     * @return Merged array containing elements from both arrays
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    /**
     * Merges two double arrays into a single array.
     *
     * @param arr1 First double array
     * @param arr2 Second double array
     * @return Merged array containing elements from both arrays
     */
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    /**
     * Merges two char arrays into a single array.
     *
     * @param arr1 First char array
     * @param arr2 Second char array
     * @return Merged array containing elements from both arrays
     */
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    /**
     * Merges two String arrays into a single array.
     *
     * @param arr1 First String array
     * @param arr2 Second String array
     * @return Merged array containing elements from both arrays
     */
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    /**
     * Reverses the elements of an integer array.
     *
     * @param array Integer array to be reversed
     * @return Reversed integer array
     */
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    /**
     * Reverses the elements of a double array.
     *
     * @param array Double array to be reversed
     * @return Reversed double array
     */
    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    /**
     * Reverses the elements of a char array.
     *
     * @param array Char array to be reversed
     * @return Reversed char array
     */
    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    /**
     * Reverses the elements of a String array.
     *
     * @param array String array to be reversed
     * @return Reversed String array
     */
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    /**
     * Adds an element to the end of an integer array.
     *
     * @param array   Integer array to which the element will be added
     * @param element Element to be added
     * @return New integer array with the added element
     */
    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    /**
     * Adds an element to the end of a double array.
     *
     * @param array   Double array to which the element will be added
     * @param element Element to be added
     * @return New double array with the added element
     */
    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    /**
     * Adds an element to the end of a char array.
     *
     * @param array   Char array to which the element will be added
     * @param element Element to be added
     * @return New char array with the added element
     */
    public static char[] addElement(char[] array, char element) {
        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    /**
     * Adds an element to the end of a String array.
     *
     * @param array   String array to which the element will be added
     * @param element Element to be added
     * @return New String array with the added element
     */
    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    /**
     * Checks if an integer array contains a specific element.
     *
     * @param array   Integer array to be checked
     * @param element Element to be checked for containment
     * @return True if the element is present in the array, otherwise false
     */
    public static boolean isContained(int[] array, int element) {
        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a double array contains a specific element.
     *
     * @param array   Double array to be checked
     * @param element Element to be checked for containment
     * @return True if the element is present in the array, otherwise false
     */
    public static boolean isContained(double[] array, double element) {
        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a char array contains a specific element.
     *
     * @param array   Char array to be checked
     * @param element Element to be checked for containment
     * @return True if the element is present in the array, otherwise false
     */
    public static boolean isContained(char[] array, char element) {
        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a String array contains a specific element.
     *
     * @param array   String array to be checked
     * @param element Element to be checked for containment
     * @return True if the element is present in the array, otherwise false
     */
    public static boolean isContained(String[] array, String element) {
        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
