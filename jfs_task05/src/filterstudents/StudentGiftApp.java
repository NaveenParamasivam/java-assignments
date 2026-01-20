package filterstudents;

import java.util.ArrayList;
import java.util.List;

// Main class
public class StudentGiftApp {

    public static void main(String[] args) {

        // List to store student names
        List<String> studentNames = new ArrayList<>();

        // Adding 10 student names
        studentNames.add("Arun");
        studentNames.add("Anitha");
        studentNames.add("Rahul");
        studentNames.add("Aakash");
        studentNames.add("Suresh");
        studentNames.add("Amit");
        studentNames.add("Kiran");
        studentNames.add("Ajay");
        studentNames.add("Neha");
        studentNames.add("Ravi");

        StudentFilterService service = new StudentFilterService();

        System.out.println("Students eligible for special gifts:");
        service.printStudentsStartingWithA(studentNames);
    }
}

