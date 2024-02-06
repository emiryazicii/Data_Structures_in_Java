package lesson01_Array.practices;

public class NamesScoresGrades {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        String gradeReport = "";
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (scores[i] >= 90)? 'A' :(scores[i] >= 80)? 'B' :(scores[i] >= 70)? 'C' :(scores[i] >= 60)? 'D' : 'F';
            gradeReport += names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]+"\n";
        }
        System.out.println("Grade Report: \n"+gradeReport);
    }
}
/*
 given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */

