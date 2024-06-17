package CollectionFrameWorkAll;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        //size initall size=10 =n
        //new size=n+n/2+1

        // Adding elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("JavaScript");

        // Displaying elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        for (String language : arrayList) {
            System.out.println(language);
        }

        // Adding an element at a specific index
        arrayList.add(2, "C#");

        // Removing an element by value
        //String.valueOf("value")
        arrayList.remove(String.valueOf("Java"));

        // Displaying elements after modifications
        System.out.println("\nElements after modifications:");
        for (String language : arrayList) {
            System.out.println(language);
        }

        // Accessing elements by index
        System.out.println("\nElement at index 1: " + arrayList.get(1));

        // Checking if an element exists in the ArrayList
        if (arrayList.contains("Python")) {
            System.out.println("\nArrayList contains 'Python'.");
        }
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList.get(0));

        //use to update the value
        arrayList.set(0, "rubi");
        System.out.println(arrayList.get(0));

        System.out.println(arrayList);
        // Size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + arrayList.size());
        arrayList.clear();
        System.out.println(arrayList);

        //iterate
        for (String language : arrayList) {
            System.out.println(language);
        }
        //iterator
        //Iterator<datatype> it=name.iterator
        //it.hasNext()
        
    }
}
//T.C O(N) remove,add,contains
//T.C O(1) add,set