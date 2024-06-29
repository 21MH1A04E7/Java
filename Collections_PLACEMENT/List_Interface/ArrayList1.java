import java.util.*;
public class ArrayList1{
    public static void main(String args[]){
        ArrayList arr=new ArrayList();//creating a ArrayList object
        arr.add(10);
        arr.add(200);
        arr.add(300);
        System.out.println(arr.get(0));
        System.out.println(arr);

        ArrayList arr2=new ArrayList();
        arr2.add("hariom");
        arr2.add(1);
        arr2.add("suraj");
        System.out.println(arr2);
        System.out.println(arr2.size());
        arr2.add('h');
        System.out.println(arr2.size());
        System.err.println("*********************");

        ArrayList arr3=new ArrayList();
        arr3.add(10);
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        System.out.println(arr3);
        arr3.addAll(arr2);
        System.out.println(arr3);
        arr3.add(0,"hariom");
        System.out.println(arr3);
        arr3.set(0,"suraj");
        System.err.println(arr3);
        arr3.remove(0);
        System.out.println(arr3);

    }
}
/*
 ArrayList is a dynamic array in Java. It can store objects of any type.
 ArrayList has methods like add(), remove(), get(), set(), size(), etc.
 ArrayList is backed by an array, but it provides some additional features like dynamic resizing.
 ArrayList does not maintain the insertion order.
 ArrayList is not thread-safe. If multiple threads need to access and modify the ArrayList simultaneously, synchronization should be done manually.
 ArrayList is faster than LinkedList for adding and removing elements at the end.
 ArrayList is implementing the List interface
 */