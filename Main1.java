public class Main1 {
        public static void main(String[] args) {
            String str = null;
            try {
                System.out.println(str.length()); // This will throw a NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Exception Handling: String is null");
            } finally {
                System.out.println("Program continues executing...");
                // Code to handle the situation where the string is null
                str = "Default value";
                System.out.println("Using default value: " + str);
            }
        }
    }


