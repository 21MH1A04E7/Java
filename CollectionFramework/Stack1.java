package CollectionFramework;
import java.util.Stack;
public class Stack1 {
    public static void main(String args[]){
        //creating a stack
        //last in first out data structure
        Stack<Integer> s=new Stack<>();
        //push
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println("After push operation: "+s);
        //peek
        int peekElement = s.peek();
        System.out.println("top element "+peekElement);
        //pop
        s.pop();
        System.out.println("after pop operation"+s);
        //checking empty
        System.out.println(s.empty());
        //size
        System.out.println("size of stack "+s.size());
    }
}
