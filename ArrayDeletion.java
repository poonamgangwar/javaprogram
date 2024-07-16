import java.util.ArrayList;
import java.util.List;

    public class ArrayDeletion {

        public static void main(String[] args) {
            // Initialize the list with the given elements
            List<Integer> array = new ArrayList<>();
            array.add(1);
            array.add(3);
            array.add(7);
            array.add(9);
            array.add(4);

            // Delete the element at the 2nd index (which is the 3rd position in the list)
            array.remove(2);

            // Print the modified list
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }

