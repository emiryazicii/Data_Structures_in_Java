package lesson01_Array;

public class ForEachLoop {

    public static void main(String[] args) {

        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Using traditional for loop to iterate over the array
        for (int i = 0; i < numbers.length; i++) {
            // Print each element of the array
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------------------------");

        // Using for-each loop to iterate over the array
        for (int each : numbers) {
            // Print each element of the array
            System.out.println(each);
        }

        System.out.println("-----------------------------------------------");
    }
}
