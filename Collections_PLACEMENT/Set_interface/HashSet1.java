import java.util.*;

public class HashSet1{
    public static void main(String args[]){
        //HashSet is an unordered collection of unique elements
        //HashSet is a collection of unique elements
        Set<Integer> hs=new HashSet<Integer>();
        // Set<Integer> hs1=new LinkedHashSet<Integer>();

        Set<Integer> hs2=new TreeSet<Integer>();


        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);
        hs.remove(20);
        System.out.println(hs);
        System.out.println(hs.contains(40));
        hs.add(10);
        //Iterator
        for(Integer item:hs){
            System.out.println(item+" ");
        }
    }
}
/*
 * add()
 * clear()
 * clone()
 * contains()
 * isEmpty()
 * Iterator<E> iterator(): Returns an iterator over the elements in this set.
 * boolean remove(Object o): Removes the specified element from this set if it is present.
 * size()
 * toArray()
 */