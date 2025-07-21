class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class ExceptionExample2 {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18, not allowed.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
