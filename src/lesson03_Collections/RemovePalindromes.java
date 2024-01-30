package lesson03_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList(
                "Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam")
        );

        Iterator<String> it = names.iterator();

        while (it.hasNext()){

            String each = it.next();
            String reversed = "";

            for(int i = each.length()-1 ; i >= 0 ; i--){
                reversed += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reversed)){
                // names.remove(each);
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("--------------------------------------------------------------------------------------");

        List<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList(
                "Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam")
        );

         names2.removeIf(p-> reverse(p).equalsIgnoreCase(p));

        // names2.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));

        System.out.println(names2);
    }

    public static String reverse(String str) {

        String reverse = ""; // to contain all the characters of the given string in reverse

        for (int i = str.length() - 1; i >= 0; i--) {// i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get each character of the string starting from last index to index zero
        }
        return reverse;
    }
}
