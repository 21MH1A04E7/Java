
import java.util.ArrayDeque;

public class ArrayDeque1 {

    public static void main(String[] args) {
        ArrayDeque dq = new ArrayDeque();
        dq.add(100);
        System.err.println(dq);
        dq.addFirst(200);
        System.out.println(dq);
        dq.offer(300);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.peekLast());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
        dq.clear();
        dq.addLast(5);
        System.out.println(dq);
    }
}
/*
 * Adding Elements:

add(E e): Adds the specified element to the end of the deque.
addFirst(E e): Adds the specified element to the front of the deque.
addLast(E e): Adds the specified element to the end of the deque.
offer(E e): Inserts the specified element at the end of the deque.
offerFirst(E e): Inserts the specified element at the front of the deque.
offerLast(E e): Inserts the specified element at the end of the deque.
Accessing Elements:

getFirst(): Retrieves, but does not remove, the first element of the deque.
getLast(): Retrieves, but does not remove, the last element of the deque.
peek(): Retrieves, but does not remove, the head of the deque.
peekFirst(): Retrieves, but does not remove, the first element of the deque.
peekLast(): Retrieves, but does not remove, the last element of the deque.
Removing Elements:

remove(): Retrieves and removes the head of the deque.
removeFirst(): Retrieves and removes the first element of the deque.
removeLast(): Retrieves and removes the last element of the deque.
poll(): Retrieves and removes the head of the deque.
pollFirst(): Retrieves and removes the first element of the deque.
pollLast(): Retrieves and removes the last element of the deque.
 */
