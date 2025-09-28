import java.util.*;

public class HashMap1{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("apple",4);
        //it will put if key is absent
        map.putIfAbsent("apple",6);
        System.out.println(map);
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsValue(4));
        System.out.println(map.get("apple"));
        
        System.out.println(map.getOrDefault("apple",58));
        System.out.println(map.getOrDefault("dog",58));
        
        map.remove("apple");
        System.out.println(map);
        Set<String> keys=map.keySet(); 
        ArrayList<String> keyArray=new ArrayList<>(map.keySet());
        System.out.println(keyArray);

        ArrayList<Integer> val=new ArrayList<Integer>(map.values());
        System.out.println(val);

        Set<Map.Entry<String,Integer>> entries=map.entrySet();

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());  // prints key and value pair in the map
        }
    }
}
/*
 * get("")
 * getOrDefault("","")
 * containsKey() ->true,false
 * containValue() ->true,false
 * remove() -> key
 * put("key",value)
 * keySet() ->return a set of all the keys present in a map
 * values() ->return a set of all the values present in a map
 * entrySet() ->return a set of all the key/value mapping present in a map
 * Map.Entry<String,Integer>> entries=map.entrySet();
 * getkey();
 * getvalue();
 */ 