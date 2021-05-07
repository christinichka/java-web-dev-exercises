package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID numbers
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Double newId = input.nextDouble();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
//        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
        }

//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }
}


// 1. It takes in student names and ID numbers (as integers) instead of names and grades.
// 2. The keys should be the IDs and the values should be the names.
// 3. Modify the roster printing code accordingly.