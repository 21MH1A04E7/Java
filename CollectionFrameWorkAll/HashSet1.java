package CollectionFrameWorkAll;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
       
       Set<Integer> set = new HashSet<>();//random order(T.C(O(1)))
    //    Set<Integer> set = new LinkedHashSet<>();//maintain the order

    //    Set<Integer> set = new TreeSet<>();//sorted order

       set.add(32);
       set.add(2);
       set.add(54);
       set.add(21);
       set.add(65);

       System.out.println(set);

       set.remove(54);

       System.out.println(set);

       System.out.println(set.contains(21));

       System.out.println(set.isEmpty());

       System.out.println(set.size());

       set.clear();

       System.out.println(set);
    }
}
