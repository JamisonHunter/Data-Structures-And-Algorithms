import java.util.Queue;
import java.util.LinkedList;

public class QueueMain {
    
    public static void main(String[] args) {

        // A Queue is an interface and not a class. It can interface witha linked list class.

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);

        System.out.println(queue.isEmpty());

    }

}
