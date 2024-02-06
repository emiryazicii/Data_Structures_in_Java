package lesson01_Array.practices;

public class RetrieveCharacters {

    public static void main(String[] args) {

        categorizeCharacters("Wooden Spoon!");

    }
    public static void categorizeCharacters(String str) {

        String letters = "", digits = "", specialChars = "";

        char[] characters = str.toCharArray();

        for (char each : characters) {
            if(!Character.isLetterOrDigit(each)){
                specialChars += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            }else {
                letters += each;
            }
        }
        System.out.println("letters = \"" + letters+"\";");
        System.out.println("digits = \"" + digits+"\";");
        System.out.println("specialChars = \"" + specialChars+"\";");
    }
}
/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
        str = "Wooden Spoon!"

        output:
        letters= "WoodenSpoon";
        Digits = "";
        specialChars = " !";
*/

