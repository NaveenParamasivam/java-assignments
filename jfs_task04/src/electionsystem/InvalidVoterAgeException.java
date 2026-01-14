package electionsystem;

// Custom unchecked exception for voter age
public class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}
