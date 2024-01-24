package lesson01_Array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        int score1 = 85, score2 = 75, score3 = 65 , score4 = 80, score5 = 60;

        System.out.println("--------------------------------------------------");

        int [] scores = new int[5];// index : 0 ~ 4

        scores[2] = 78;
        scores[0] = 77;
        scores[3] = 75;
        scores[4] = 73;
        scores[1] = 71;

        // scores[5] = 70;
        // scores[-1]= 65;

        // scores = new int[10];
        // scores = new int[50];

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("----------------------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i : index numbers of scores array

            System.out.println(scores[i]);
        }

        System.out.println("-----------------------------------------------------");

        System.out.println(scores[scores.length-1]);

    }
}
