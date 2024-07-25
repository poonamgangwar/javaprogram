class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int age = 15;
        try {
            checkAge(age);
        } catch (UnderageException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You are underage!");
        } else {
            System.out.println("You are eligible!");
        }
    }
}
