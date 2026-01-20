package filterstudents;

import java.util.List;

// Service class for student filtering
public class StudentFilterService {

    // Filter and print students starting with 'A'
    public void printStudentsStartingWithA(List<String> studentNames) {
        studentNames.stream()
                .filter(name -> name.startsWith("A")) // check name starts with A
                .forEach(System.out::println);        // print filtered names
    }
}
