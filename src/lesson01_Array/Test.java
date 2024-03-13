package lesson01_Array;

public class Test {

    public static void main(String[] args) {

        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

        // Check if the value 80 is contained in the array
        boolean has80 = ArrayUtils.isContained(numbers, 80);

        // Print the result of the check
        System.out.println(has80);

        System.out.println("-----------------------------------------");

        // Define an array of strings
        String[] students = {"Sumeye", "Hamza", "Marika"};

        // Check if the name "Bekir" is contained in the array
        System.out.println(ArrayUtils.isContained(students, "Bekir"));
    }
}
