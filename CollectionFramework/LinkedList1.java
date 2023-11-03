package CollectionFramework;
import java.util.LinkedList;


public class LinkedList1 {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        //adding element at first position
        list.addFirst(5);
        list.addFirst(8);
        list.addFirst(9);
        System.out.println(list);
        //by default it will add at last position
        list.add(8);
        list.addLast(12);
        System.out.println(list);
        //size 
        System.out.println(list.size());
        //get
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-> ");
        }
        //removeFirst
        list.removeFirst();
        System.out.println("\nAfter removing First Element");
        System.out.println(list);
        //removeLast
        list.removeLast();
        System.out.println("\nAfter Removing Last Element");
        System.out.println(list);
        //removeatindex
        list.remove(1);
        System.out.println("\nAfter Removing Index 1 Element");
        System.out.println(list);
    }
}
