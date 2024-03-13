package lesson01_Array.practices;

public class Items4 {

    public static void main(String[] args) {
        // Given 2D array of items
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        String str = "";
        for (String[] eachList : items) {
            for (String eachItem : eachList) {
                // Concatenate the first 3 letters of each item with a tab between them
                str += eachItem.substring(0, 3) + " \t";
            }
            str = str.trim() + "\n"; // Trim the last space and add a newline character
        }
        // Print the output string
        System.out.println(str);
    }
}
