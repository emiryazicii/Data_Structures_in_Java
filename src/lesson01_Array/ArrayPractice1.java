package lesson01_Array;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Emir";
        myGroup[1] = "Damla";
        myGroup[2] = "Sevinc";
        myGroup[3] = "Turan";
        myGroup[myGroup.length-1] = "Kamil";

        myGroup[2] = "Sumeyye";
        myGroup[0] = "Neriman";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------------------");

        for (int i = myGroup.length-1 ; i >= 0 ; i--) {

            System.out.println(myGroup[i]);
        }

        System.out.println("-----------------------------------------------------");
    }
}
