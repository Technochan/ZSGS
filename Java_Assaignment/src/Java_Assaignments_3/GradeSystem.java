package Java_Assaignments_3;
// Create a program that takes a student's score as input and outputs their corresponding grade.
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int score;
    private static ArrayList<String> grades = new ArrayList<>();

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void add(String grade) {
        grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public static ArrayList<String> getGrades() {
        return grades;
    }
}

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the No of Student's Count: ");
        int count = scan.nextInt();
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter the Name of the Student " + i + " :");
            String name = scan.next();
            System.out.println("Enter the Student " + i + " Score (1 - 100) :");
            int score = scan.nextInt();
            Student obj = new Student(name, score);
            String grade = findGrade(score);
            obj.add(grade);
            studentList.add(obj);
        }

        ArrayList<String> gradesList = Student.getGrades();
        for (int i = 0; i < count; i++) {
            Student obj = studentList.get(i); 
            System.out.println("Student " + (i + 1) );
            System.out.println( "Name: " + obj.getName() + "|  Score: " + obj.getScore() + "|  Grade: " + gradesList.get(i));
        }
    }

    public static String findGrade(double score) {
        if (score >= 90) {
            return "First Grade";
        } else if (score >= 80) {
            return "Second Grade";
        } else if (score >= 70) {
            return "Third Grade";
        } else if (score >= 60) {
            return "Fourth Grade";
        } else {
            return "Study Hard";
        }
    }
}
