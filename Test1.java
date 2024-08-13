import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 7, 5, 6};
        int[] arr2 = {2, 3, 7, 9, 3};


        System.out.println("Array 1 is distinct: " + areElementsDistinct(arr1));
        System.out.println("Array 2 is distinct: " + areElementsDistinct(arr2));
    }


    public static boolean areElementsDistinct(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
          if (!hs.add(arr[i])) {
                // If add() returns false, it means the element already exists in the set
                return false;

            }
        }

        return true; // All elements are distinct
    }
}

