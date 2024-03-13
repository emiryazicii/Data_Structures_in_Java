package lesson01_Array.practices;

public class NamesScoresGrades {

    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        // Generate grade report
        String gradeReport = "";
        for (int i = 0; i < grades.length; i++) {
            // Determine grade based on score
            grades[i] = (scores[i] >= 90) ? 'A' : (scores[i] >= 80) ? 'B' : (scores[i] >= 70) ? 'C' : (scores[i] >= 60) ? 'D' : 'F';
            // Build grade report string
            gradeReport += names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i] + "\n";
        }

        // Print grade report
        System.out.println("Grade Report: \n" + gradeReport);
    }
}
