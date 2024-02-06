package lesson01_Array.practices;

public class HtmlGenerator {

    public static void main(String[] args) {

        String request1 = "ul1;li3;button2";

        String[] arr = request1.split(";");

        for (String each : arr) {
            String tag = "";
            String repeat = "";
            for (int i = 0; i < each.length(); i++) {
                char ch = each.charAt(i);
                if (Character.isDigit(ch)) {
                    repeat += ch;
                } else if (Character.isLetter(ch)) {
                    tag += ch;
                }
            }
            for (int j = 0; j < Integer.parseInt(repeat); j++) {
                System.out.println("<" + tag + "></" + tag + ">");
            }
        }
    }
}
/*
T2HtmlGenerator [String, wrapper class, loop, array]

Create a program that will read the request for the HTML that will be generated. Each request will be made of the tags and how many times that tag should be repeated. Each separate HTML tag will be separated by a semi-colon;

Tags should be surrounded in diamond brackets and each closing tag has a / too

Note: we are not creating a fully valid HTML structure. It is just a task

    Ex:
        Input:
            div2;li1

        Output:
            <div> </div>
            <div> </div>
            <li> </li>

    Ex:
        Input:
            ul1;li3;button2

        Output:
            <ul> </ul>
            <li> </li>
            <li> </li>
            <button> </button>
            <button> </button>

 */

