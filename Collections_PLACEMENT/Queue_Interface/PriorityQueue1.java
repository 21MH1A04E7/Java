
import java.util.*;
import javax.sound.sampled.SourceDataLine;
  
public class PriorityQueue1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//by default implementaion minheap
        // Add elements
        pq.add(10);

        pq.add(20);
        pq.add(15);
        // Check if the queue contains a specific element
        System.out.println("Queue contains 20: " + pq.contains(20)); // Output: true

        // Access the head of the queue
        System.out.println("Head of the queue: " + pq.peek()); // Output: 10

        // Remove and return the head of the queue
        System.out.println("Removed element: " + pq.poll()); // Output: 10

        // Add more elements
        pq.offer(5);
        pq.offer(30);
        System.out.println("Size of the queue: " + pq.size()); // Output: 4
        System.out.println("PriorityQueue"+pq);
        // Remove a specific element
        pq.remove(20);
        System.out.println("Queue after removing 20: " + pq); // Output: [5, 15, 30]
        for (Integer element : pq) {
            System.out.println(element);
        }
        Queue<Integer> maxheap=new PriorityQueue<Integer>((a,b)->b-a);
        maxheap.add(4);
        maxheap.offer(5);
        maxheap.offer(6);
        System.out.println("PriorityQueue with max heap"+maxheap);
    
    }
   
}

/*
 * toArray()
 * Adding Elements
 * add() ->Thorws error
 * offer() ->true,false
 * Removing Elements
 * poll()
 * remove()
 * Accessing Elements:
 * peek() ->null
 * elemet() ->thorws
 */