package CollectionFrameWorkAll;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop and display the top element
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);

        // Search for an element
        int searchElement = 20;
        int position = stack.search(searchElement);
        System.out.println("Position of " + searchElement + ": " + position);
    }

}
