package lesson02_ArrayList.practices;

import java.util.ArrayList;

public class MaxAndMinNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1,j = 5; i <=5 ; i++, j--) {
            list.add(i);
            list.add(j);
        }
        System.out.println("Here is the array list : ");
        System.out.println(list);
        displayMaxAndMinNumbers(list);
    }
    public static void displayMaxAndMinNumbers(ArrayList<Integer> list){

        Integer max = list.get(0) , min = list.get(0);

        for (Integer each : list) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
    }
}
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */

