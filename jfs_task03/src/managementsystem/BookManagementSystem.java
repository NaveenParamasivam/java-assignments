package managementsystem;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = getInput.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = getInput.nextInt();
                    getInput.nextLine();

                    System.out.print("Enter Title: ");
                    String title = getInput.nextLine();

                    System.out.print("Enter Author: ");
                    String author = getInput.nextLine();

                    Book book = new Book(id, title, author, true);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = getInput.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = getInput.nextInt();
                    library.searchBook(searchId);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    getInput.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }


    }
}
