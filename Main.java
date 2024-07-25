public class Main {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void divideNumbers(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = a / b;
        System.out.println("Result: " + result);
    }
}
