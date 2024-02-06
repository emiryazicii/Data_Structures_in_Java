package lesson02_ArrayList.practices;

import java.util.ArrayList;

public class CombineArraysIntoArrayList {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = combine2ArraysToList(arr1, arr2);

        System.out.println(list);
    }
    public static ArrayList<String> combine2ArraysToList(String[] arr1, String[] arr2) {

        ArrayList<String> list = new ArrayList<>();

        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }
        return list;
    }
}
/*
3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */

