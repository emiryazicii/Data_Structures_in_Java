package lesson01_Array.practices;

public class ReverseClassMatesNames {

    public static void main(String[] args) {

        String[] classMates = {"jika jan", "momammed alsaadi", "ayat alsaadi", "borislav despotovic", "farkhodjon najimov", "hatice yildirim", "nadia yatsiuk", "nuket pusat", "leslie nikolic", "mohammed guendouz"};

        for (int i = 0; i < classMates.length; i++) {
            String reversedNames = "";

            for (int j = classMates[i].length() - 1; j >= 0; j--) {
                reversedNames += classMates[i].charAt(j);
            }
            System.out.println(reversedNames);
        }
    }
}
/*
 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */

