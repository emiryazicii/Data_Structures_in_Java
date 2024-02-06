package lesson01_Array.practices;

public class Palindrome {

    public static void main(String[] args) {

        String[] str = {"Anna", "Level", "Java"};

        int palindromeCount = 0;
        for (String each : str) {

            String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {

                reversed += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)){
                palindromeCount++;
            }
        }
        System.out.println("Palindrome count: "+palindromeCount);
    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */

