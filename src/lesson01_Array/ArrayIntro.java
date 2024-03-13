package lesson01_Array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        // Declaring and initializing individual scores
        int score1 = 85, score2 = 75, score3 = 65 , score4 = 80, score5 = 60;

        // Separator
        System.out.println("--------------------------------------------------");

        // Creating an array to store scores
        int[] scores = new int[5]; // Index : 0 ~ 4

        // Assigning values to specific indices of the scores array
        scores[2] = 78;
        scores[0] = 77;
        scores[3] = 75;
        scores[4] = 73;
        scores[1] = 71;

        // Uncommenting the lines below would result in runtime errors
        // scores[5] = 70;
        // scores[-1]= 65;

        // Uncommenting any of the lines below would resize the scores array
        // scores = new int[10];
        // scores = new int[50];

        // Printing the array using Arrays.toString() method
        System.out.println(Arrays.toString(scores));

        // Printing the value at a specific index of the scores array
        System.out.println(scores[2]);

        // Separator
        System.out.println("----------------------------------------------------");

        // Looping through the scores array and printing each element
        for (int i = 0; i < scores.length; i++) {
            // Printing each score
            System.out.println(scores[i]);
        }

        // Separator
        System.out.println("-----------------------------------------------------");

        // Printing the last element of the scores array
        System.out.println(scores[scores.length-1]);
    }
}
