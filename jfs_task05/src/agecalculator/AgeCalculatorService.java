package agecalculator;

import java.time.LocalDate;
import java.time.Period;

// Service class to calculate age
public class AgeCalculatorService {

    // Calculate age from birthdate
    public Period calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now(); // get today's date
        return Period.between(birthDate, currentDate); // calculate difference
    }
}

