package studentmanagementsystem;

// Student class
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        // Check age range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }

        // Check name validity (only alphabets)
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name should not contain numbers or symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}
