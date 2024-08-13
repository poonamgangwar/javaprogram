import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList() ;
        for (int i = 1; i <= 5; i++) {
            ll.addFirst(i);
        }

        for (int i = 6; i <= 10; i++) {
            ll.addLast(i);
        }

        System.out.println("LinkedList: " + ll);
    }
}