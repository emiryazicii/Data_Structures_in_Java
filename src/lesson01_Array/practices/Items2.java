package lesson01_Array.practices;

public class Items2 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        String str = "";
        for (String[] itemsList : items) {
            for (String eachItem : itemsList) {
                str += eachItem + " \t";
            }
            str = str.trim()+"\n";
        }
        System.out.println(str);
    }
}

/*
Given the Array:
		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water
 */

