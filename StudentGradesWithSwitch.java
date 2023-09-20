/* Write a java program to calculate student grades using switch case method 
take name & marks of student from user
at last print student name and grade of student
grades: 85+ --> A
        75-84--> B
        65-74 --> C
        55-64 --> D
        45-54 --> E
        below 45 --> F i.e. 'Fail' 
*/


import java.util.*;

public class StudentGradesWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store student names and marks
        String[] studentNames = new String[10];
        int[] studentMarks = new int[10];

        // Input student names and marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter marks of student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();

            // Consume the newline character left by nextInt()
            scanner.nextLine();
            System.out.println("");
        }

        // Output student names and grades
        System.out.println(" Students name and grade");
        for (int i = 0; i < 10; i++) {
            char grade = calculateGrade(studentMarks[i]);
            System.out.println("Name: " + studentNames[i] + ", Grade: " + grade);
        }
    }

    // Method to calculate the grade based on marks using switch
    public static char calculateGrade(int marks) {
        char grade;

        switch (marks / 5) {
            case 20:
            case 19:
            case 18:
            case 17:
                grade = 'A';
                break;
            case 16:
            case 15:
                grade = 'B';
                break;
            case 14:
            case 13:
                grade = 'C';
                break;
            case 12:
            case 11:
                grade = 'D';
                break;
            case 10:
            case 9:
                grade = 'E';
                break;
            default:
                grade = 'F'; 
        }

        return grade;
    }
}
