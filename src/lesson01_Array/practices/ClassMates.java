package lesson01_Array.practices;

public class ClassMates {

    public static void main(String[] args) {

        String[] classMates = {"jika jan","momammed alsaadi","ayat alsaadi","borislav despotovic","farkhodjon najimov","hatice yildirim","nadia yatsiuk","nuket pusat","leslie nikolic","mohammed guendouz"};

        String initials = "";
        for (int i = 0; i < classMates.length; i++) {

            initials += classMates[i].substring(0,1).toUpperCase()+"."+classMates[i].substring(classMates[i].indexOf(" ")+1,classMates[i].indexOf(" ")+2).toUpperCase()+"\n";

        }
        System.out.println(initials);
    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */

