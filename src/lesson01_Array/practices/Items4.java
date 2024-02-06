package lesson01_Array.practices;

public class Items4 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        String str = "";
        for (String[] eachList : items) {
            for (String eachItem : eachList) {
                str += eachItem.substring(0,3)+" \t";
            }
            str = str.trim()+"\n";
        }
        System.out.println(str);
    }
}
/*
3. print the following output: (the first 3 letters of every element, add \t between two words)
				App    Ban   Gra	Avo
				Pap    Toi   Tis    Dia
				Cok    Fan   Ari    Pep   Wat

 */

