package dayfinder;

import java.util.Scanner;

// Main class
public class WeekdayApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WeekdayService service = new WeekdayService();

        try {
            // Ask user for index
            System.out.print("Enter day index (0-6): ");
            int index = scanner.nextInt();

            // Print day name
            System.out.println("Day is: " + service.getWeekday(index));

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index
            System.out.println("Invalid day index. Please enter between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}

