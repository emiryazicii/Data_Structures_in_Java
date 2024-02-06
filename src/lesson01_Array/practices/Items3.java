package lesson01_Array.practices;

public class Items3 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        String str ="";
        for (String[] eachList : items) {
            for (int i = eachList.length - 1; i >= 0; i--) {
                str += eachList[i]+" \t";
            }
            str = str.trim()+"\n";
        }
        System.out.println(str);
    }
}

/*
2. print the following output: (each inner array reversed, add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke
 */

