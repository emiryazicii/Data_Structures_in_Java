package lesson02_ArrayList.practices;

import java.util.ArrayList;

public class RetrieveCharacters {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        char[] characters = str.toCharArray();

        for (char each : characters) {
            if(!Character.isLetterOrDigit(each)){
                list3.add(each);
            } else if (Character.isDigit(each)) {
                list1.add(each);
            }else {
                list2.add(each);
            }
        }
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        System.out.println("list3: "+list3);
    }
}
/*
7. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */

