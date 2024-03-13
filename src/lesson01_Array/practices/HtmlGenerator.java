package lesson01_Array.practices;

public class HtmlGenerator {

    public static void main(String[] args) {
        // Input request
        String request1 = "ul1;li3;button2";

        // Split the request by semicolon to get individual tags and their repeat counts
        String[] arr = request1.split(";");

        // Loop through each tag in the request
        for (String each : arr) {
            String tag = "";
            String repeat = "";

            // Separate the tag name and repeat count from the current element
            for (int i = 0; i < each.length(); i++) {
                char ch = each.charAt(i);
                if (Character.isDigit(ch)) {
                    repeat += ch;
                } else if (Character.isLetter(ch)) {
                    tag += ch;
                }
            }

            // Print the tag with its opening and closing brackets according to the repeat count
            for (int j = 0; j < Integer.parseInt(repeat); j++) {
                System.out.println("<" + tag + "></" + tag + ">");
            }
        }
    }
}
