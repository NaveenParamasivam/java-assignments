package filterstrings;

import java.util.Arrays;
import java.util.List;

// Main class
public class StringCheckApp {

    public static void main(String[] args) {

        // Given list
        List<String> listStrings = Arrays.asList(
                "abc", "", "bc", "efg", "abcd", "", "jkl"
        );

        StringCheckService service = new StringCheckService();

        // Check empty or not
        service.checkEmptyOrNot(listStrings);

        // Print non-empty strings
        service.printNonEmptyStrings(listStrings);
    }
}
