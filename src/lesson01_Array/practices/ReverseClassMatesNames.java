package lesson01_Array.practices;

public class ReverseClassMatesNames {

    public static void main(String[] args) {
        // Define an array of classmate names
        String[] classMates = {"jika jan", "momammed alsaadi", "ayat alsaadi", "borislav despotovic", "farkhodjon najimov", "hatice yildirim", "nadia yatsiuk", "nuket pusat", "leslie nikolic", "mohammed guendouz"};

        // Iterate through each name in the array
        for (int i = 0; i < classMates.length; i++) {
            // Initialize a variable to store the reversed name
            String reversedNames = "";

            // Iterate through each character of the current name in reverse order
            for (int j = classMates[i].length() - 1; j >= 0; j--) {
                // Append each character to the reversed name string
                reversedNames += classMates[i].charAt(j);
            }

            // Print the reversed name
            System.out.println(reversedNames);
        }
    }
}
