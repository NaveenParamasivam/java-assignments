package electionsystem;

import java.util.Scanner;

// Main class
public class VoterManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Read inputs
            System.out.print("Enter Voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            // Create voter object
            Voter voter = new Voter(voterId, name, age);

            // Show details
            voter.displayVoter();

        } catch (InvalidVoterAgeException e) {
            // Handle age issue
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
