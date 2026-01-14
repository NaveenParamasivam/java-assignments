package collectionproblem;

import java.util.Scanner;

// Main class
public class IntegerStackApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IntegerStackService service = new IntegerStackService();

        while (true) {
            // Menu options
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if Empty");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Push element
                    System.out.print("Enter integer value: ");
                    int value = scanner.nextInt();
                    service.pushElement(value);
                    break;

                case 2:
                    // Pop element
                    service.popElement();
                    break;

                case 3:
                    // Check empty
                    service.checkEmpty();
                    break;

                case 4:
                    // Exit program
                    System.out.println("Exiting program");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

