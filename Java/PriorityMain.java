import java.util.*;

public class PriorityMain {
    public static void main(String args[]) {
        // The Queue has been arranged in reverse order using collections.
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder(null));

        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(3.7);
        queue.offer(2.8);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        // The Queue will print in order.
        // A priority Queue of strings prints in alphabetical order.
    }
}
