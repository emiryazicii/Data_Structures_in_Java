package lesson01_Array.practices;

public class CustomToString {

    /**
     * Creates a custom string representation of a 2D integer array.
     *
     * @param arr the 2D integer array
     * @return a custom string format of the array
     */
    public static String customToString(int[][] arr) {
        String str = "";

        // Loop through the rows of the array
        for (int i = 0; i < arr.length; i++) {
            // Append the index
            str += "Index " + i + " | ";

            // Loop through the columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Append each element surrounded by parentheses
                str += "(" + arr[i][j] + ")";
            }

            // Add a newline character after each row
            str += "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 4, 5, 6}, {5, 2, 6}, {10, 40, 20}};

        // Test the customToString method
        System.out.println("Custom String Representation:");
        System.out.println(customToString(arr));
    }
}
