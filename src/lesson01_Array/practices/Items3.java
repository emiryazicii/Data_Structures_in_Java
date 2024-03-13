package lesson01_Array.practices;

public class Items3 {

    public static void main(String[] args) {
        // Given 2D array of items
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        String str = "";
        for (String[] eachList : items) {
            for (int i = eachList.length - 1; i >= 0; i--) {
                // Concatenate each item in reverse order with a tab between them
                str += eachList[i] + " \t";
            }
            str = str.trim() + "\n"; // Trim the last space and add a newline character
        }
        // Print the output string
        System.out.println(str);
    }
}
