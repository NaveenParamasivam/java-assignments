package uppercaseusingmap;

import java.util.stream.Stream;

// Service class for stream operations
public class UppercaseService {

    // Convert stream elements to uppercase
    public void convertToUppercase(Stream<String> names) {
        names
                .map(name -> name.toUpperCase()) // convert to uppercase
                .forEach(System.out::println);   // print each value
    }
}

