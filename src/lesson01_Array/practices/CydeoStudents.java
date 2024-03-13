package lesson01_Array.practices;

public class CydeoStudents {

    /**
     * Displays all elements of a three-dimensional string array.
     *
     * @param threeDimensionalArray the three-dimensional string array
     */
    public static void displayAllElements(String[][][] threeDimensionalArray) {
        for (String[][] twoDimensionalArray : threeDimensionalArray) {
            for (String[] oneDimensionalArray : twoDimensionalArray) {
                for (String element : oneDimensionalArray) {
                    System.out.println(element);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Batch 1 groups
        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        // Declare and assign batch1Groups array
        String[][] batch1Groups = {batch1Group1, batch1Group2, batch1Group3};

        // Batch 2 groups
        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        // Declare and assign batch2Groups array
        String[][] batch2Groups = {batch2Group1, batch2Group2, batch2Group3};

        // Declare and assign CydeoStudents array
        String[][][] cydeoStudents = {batch1Groups, batch2Groups};

        // Display all elements of CydeoStudents array
        displayAllElements(cydeoStudents);
    }
}
