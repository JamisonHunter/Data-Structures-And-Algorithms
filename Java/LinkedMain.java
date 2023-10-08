import java.util.LinkedList;

// Linked lists are like chains of nodes, making them easier to adjust and insert into.
// Arrays are indexed and require shifting the index in order to insert a new piece.
public class LinkedMain {
    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        linkedList.add(0, "E");
        linkedList.remove("C");
        linkedList.addFirst("F");
        linkedList.addLast("0");

        System.out.println(linkedList);

        System.out.println(linkedList.indexOf("E"));

        // Queue methods can be used on linked lists.

        // linkedList.offer("A");
        // linkedList.offer("B");
        // linkedList.offer("C");
        // linkedList.offer("D");
        // linkedList.offer("F");
        // linkedList.poll();

        
    }
}
