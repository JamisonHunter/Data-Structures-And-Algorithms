import java.util.Stack;

public class StackMain{

    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        stack.push("Halo CE");
        stack.push("Halo 2");
        stack.push("Halo 3");

        stack.pop();

        System.out.println(stack.empty());

        // The stack reads as non-empty.

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search("Halo 2"));

        // Stacks can be used to call functions or to implement redo features. 
    }

}