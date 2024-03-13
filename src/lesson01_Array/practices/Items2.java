package lesson01_Array.practices;

public class Items2 {

    public static void main(String[] args) {
        // Given 2D array of items
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        // Generate the output string with tabs between each item
        String str = "";
        for (String[] itemList : items) {
            for (String eachItem : itemList) {
                str += eachItem + " \t";
            }
            str = str.trim() + "\n"; // Trim the last space and add a newline character
        }
        // Print the output string
        System.out.println(str);
    }
}
