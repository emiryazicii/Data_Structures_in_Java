package lesson01_Array.practices;

public class OddOrEven {

    public static void main(String[] args) {

        int[] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 20};

        int countEven = 0, countOdd = 0;

        for (int each : numbers) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even numbers count: "+countEven+"\nOdd numbers count: "+countOdd);
    }
}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */

