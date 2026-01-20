package uppercaseusingmap;

import java.util.stream.Stream;

// Main class
public class UppercaseApp {

    public static void main(String[] args) {

        // Given stream
        Stream<String> names = Stream.of("aBc", "d", "ef");

        UppercaseService service = new UppercaseService();

        // Call service method
        service.convertToUppercase(names);
    }
}

