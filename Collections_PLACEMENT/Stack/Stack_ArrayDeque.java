
import java.util.ArrayDeque;

public class Stack_ArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.poll());
        System.out.println("Stack after popping: " + stack);
    }
}