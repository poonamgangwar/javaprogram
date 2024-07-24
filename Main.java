public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception Handling: String is null");
        }
    }
}
