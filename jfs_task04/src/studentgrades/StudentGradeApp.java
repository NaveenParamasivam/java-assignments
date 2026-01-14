package studentgrades;

import java.util.Scanner;

// Main class
public class StudentGradeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentGradeService service = new StudentGradeService();

        while (true) {
            // Menu
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add student
                    System.out.print("Enter student name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    service.addStudent(addName, grade);
                    break;

                case 2:
                    // Remove student
                    System.out.print("Enter student name: ");
                    String removeName = scanner.nextLine();
                    service.removeStudent(removeName);
                    break;

                case 3:
                    // Display grade
                    System.out.print("Enter student name: ");
                    String searchName = scanner.nextLine();
                    service.displayGrade(searchName);
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting program");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

