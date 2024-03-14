import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> m = new HashMap<String, Integer>();

        String[] subjects = {"English", "Maths", "Physics", "Chemistry", "Computer Science"};

        for (String subject : subjects) {
            System.out.println("Enter the marks obtained in " + subject + " (out of 100):");
            int marks = s.nextInt();
            m.put(subject, marks);
        }

        int totalMark = 0;
        for (int mark : m.values()) {
            totalMark += mark;
        }

    
        double average = totalMark / (double) m.size();

       
        char grade;
        if (average >= 90) {
            grade='A';
        } else if (average >= 80) {
            grade='B';
        } else if (average >= 70) {
            grade='C';
        } else if (average >= 60) {
            grade='D';
        } else if(average>=50){
              grade='E';  
        }else {
            grade='F';
        }

        
        System.out.println("Total Marks: " + totalMark);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}