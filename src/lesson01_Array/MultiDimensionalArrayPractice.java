package lesson01_Array;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Emir","Ceyhun","Mesut","Recai"}; // 4 names
        String[] group2 = {"Merve","Bahar","Beyza"}; // 3 names
        String[] group3 = {"Hayri","Nuri","Hatice","Sukran","Mehmet"}; // 5 names
        String[] group4 = {"Evren","Mirac"}; // 2 names


        String[][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String each : eachGroup) {
                System.out.println(each);
            }
        }

        System.out.println("----------------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] reversed = groups[i];
            System.out.println(Arrays.toString(reversed));
            for (int i1 = reversed.length - 1; i1 >= 0; i1--) {
                System.out.println(reversed[i1]);
            }
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println(Arrays.deepToString(groups));

    }
}
