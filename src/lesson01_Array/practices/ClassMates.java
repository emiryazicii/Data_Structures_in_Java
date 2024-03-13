package lesson01_Array.practices;

public class ClassMates {

    /**
     * Prints the initials of each classmate in separate lines.
     *
     * @param classMates an array of strings representing classmates' full names
     */
    public static void printInitials(String[] classMates) {
        // Variable to store initials
        String initials = "";

        // Loop through each classmate
        for (int i = 0; i < classMates.length; i++) {
            // Extract the first letter of the first name and the last name
            initials += classMates[i].substring(0, 1).toUpperCase() + "." +
                    classMates[i].substring(classMates[i].indexOf(" ") + 1, classMates[i].indexOf(" ") + 2).toUpperCase() +
                    "\n";
        }

        // Print the initials
        System.out.println(initials);
    }

    public static void main(String[] args) {
        // Array of classmates' full names
        String[] classMates = {"jika jan", "momammed alsaadi", "ayat alsaadi", "borislav despotovic", "farkhodjon najimov", "hatice yildirim", "nadia yatsiuk", "nuket pusat", "leslie nikolic", "mohammed guendouz"};

        // Print the initials of each classmate
        printInitials(classMates);
    }
}
