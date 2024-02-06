package lesson01_Array.practices;

public class UniqueElements {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 9, 8, 7, 7};

        String uniqueElements = "";

        for (int each : numbers) {
            int elementCount = 0;

            for (int each2 : numbers) {

                if (each == each2){
                    elementCount++;
                }
            }
            if (elementCount == 1){
                uniqueElements += each +" ";
            }
        }
        System.out.println("Unique Elements : "+uniqueElements);
    }
}
/*
Write a program that can display the unique elements of an array

			MUST use for each loops


 */

