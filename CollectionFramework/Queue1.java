package CollectionFramework;
import java.util.*;
public class Queue1 {
    public static void main(String args[]){
        //using LinkedList
       Queue<Integer> queue=new LinkedList<>();

       queue.offer(5);
       queue.offer(24);
       queue.offer(2);
       System.out.println(queue);
       System.out.println(queue.poll());
       System.out.println(queue);
       System.out.println(queue.peek());
    }
}
/*
 offer()//add in front (true/false)
 add()//add in front    (true/false (throw exception))

 remove()//remove from rear  (exception if empty)
 poll()//head and remove it   (null)

 peek()//head of the queue(null)
 element()//element at head position (throws Exception)

 size()
 */