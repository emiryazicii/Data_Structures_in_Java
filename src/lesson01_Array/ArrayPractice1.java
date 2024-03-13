package lesson01_Array;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        // Creating an array of strings with a length of 5
        String[] myGroup = new String[5];

        // Assigning values to array elements
        myGroup[0] = "Emir";
        myGroup[1] = "Damla";
        myGroup[2] = "Sevinc";
        myGroup[3] = "Turan";
        myGroup[myGroup.length - 1] = "Kamil";

        // Modifying array elements
        myGroup[2] = "Sumeyye";
        myGroup[0] = "Neriman";

        // Printing the array
        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------------------");

        // Printing the array elements in reverse order
        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("-----------------------------------------------------");
    }
}
