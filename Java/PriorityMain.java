import java.util.*;

public class PriorityMain {
    public static void main(String args[]) {
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(3.7);
        queue.offer(2.8);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
