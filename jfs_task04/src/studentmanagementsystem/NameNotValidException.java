package studentmanagementsystem;

// Custom exception for invalid name
public class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
