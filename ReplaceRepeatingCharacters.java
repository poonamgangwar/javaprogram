public class ReplaceRepeatingCharacters {

    public static void main(String[] args) {
        // _define-ocg_: Replace repeating characters with underscores

        // Example inputs
        String input1 = "School";
        String input2 = "limitless";

        // Replace repeating characters in the strings
        String result1 = replaceRepeatingCharacters(input1);
        String result2 = replaceRepeatingCharacters(input2);

        // Print the results
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + result2);
    }

    public static String replaceRepeatingCharacters(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Initialize an array to keep track of character counts
        int[] varOcg = new int[256]; // Supports ASCII characters

        // First pass: count the occurrences of each character
        for (char c : charArray) {
            varOcg[c]++;
        }

        // Second pass: replace repeating characters with underscores
        for (int i = 0; i < charArray.length; i++) {
            if (varOcg[charArray[i]] > 1) {
                charArray[i] = '_';
            }
        }

        // Return the modified string
        return new String(charArray);
    }
}
