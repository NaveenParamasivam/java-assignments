package studentmanagementsystem;

import java.util.Scanner;

// Main class
public class StudentManagement {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try {
            // Read inputs from user
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            // Create student object
            Student student = new Student(rollNo, name, age, course);

            // Display details
            student.displayStudent();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            // Handle validation errors
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle input issues
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
