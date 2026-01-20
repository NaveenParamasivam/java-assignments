package agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Main class
public class AgeCalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AgeCalculatorService service = new AgeCalculatorService();

        // Ask user for birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        // Convert input to LocalDate
        LocalDate birthDate = LocalDate.parse(inputDate);

        // Calculate age
        Period age = service.calculateAge(birthDate);

        // Print age
        System.out.println(
                "Your age is: " +
                        age.getYears() + " years, " +
                        age.getMonths() + " months, and " +
                        age.getDays() + " days."
        );

        scanner.close();
    }
}

