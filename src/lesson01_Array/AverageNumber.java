package lesson01_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i <size ; i++) {

            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / size ;

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum: "+ sum);
        System.out.println("average = " + average);
    }
}
