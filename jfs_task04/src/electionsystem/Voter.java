package electionsystem;

// Voter class
public class Voter {

    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) {

        // Check minimum age
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Display voter details
    public void displayVoter() {
        System.out.println("\nVoter Details");
        System.out.println("Voter ID : " + voterId);
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
    }
}
