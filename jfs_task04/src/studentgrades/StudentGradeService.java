package studentgrades;

import java.util.HashMap;

// Service class for student grades
public class StudentGradeService {

    private HashMap<String, Integer> studentGrades = new HashMap<>();

    // Add student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added successfully");
    }

    // Remove student
    public void removeStudent(String name) {
        if (studentGrades.remove(name) != null) {
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    // Display grade
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + " is " + studentGrades.get(name));
        } else {
            System.out.println("Student not found");
        }
    }
}

