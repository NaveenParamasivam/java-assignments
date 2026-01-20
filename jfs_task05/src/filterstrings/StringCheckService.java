package filterstrings;

import java.util.List;

// Service class for string checks
public class StringCheckService {

    // Check each string empty or not
    public void checkEmptyOrNot(List<String> strings) {
        strings.forEach(str -> {
            if (str.isEmpty()) {
                System.out.println("Empty String");
            } else {
                System.out.println("Not Empty String: " + str);
            }
        });
    }

    // Print only non-empty strings
    public void printNonEmptyStrings(List<String> strings) {
        System.out.println("\nNon-Empty Strings:");
        strings.stream()
                .filter(str -> !str.isEmpty()) // remove empty strings
                .forEach(System.out::println);
    }
}

