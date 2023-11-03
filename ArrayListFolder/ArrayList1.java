package ArrayListFolder;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //add element
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);
        //get element
        int element=list.get(1);
        System.out.println(element);
        //add element in between
        list.add(2,4);
        System.out.println(list);
        
        //set element
        list.set(0,6);
        System.out.println(list);

        //delete element
        list.remove(2);//it will delete element at index 2
        System.out.println(list);
        //size
        int size=list.size();
        System.out.println(size);

        list.remove(Integer.valueOf(3)); // This will remove 30 from the list
        System.out.println(list);

        list.add(30);
        list.add(9);
        //sorting
        Collections.sort(list);//ascendding order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);//descending order
       
    }
}
// ArrayList is a Java class implemented using the List interface
