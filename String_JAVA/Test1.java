public class Test1{
    public static void main(String[] args) {
        
        String name="Hariom Kumar";
        String name2=new String("Hariom Kumar");
        name2.concat("sah");
        System.out.println(name2);//not changed because it is immutable

        StringBuilder village=new StringBuilder("mejorganj");//mutable in java
        village.append(" 123");
        System.out.println(village);
    }
}

/*
 Type of String 
 1 ) Immutable String (String)
 2 ) Mutable String (String buffer,String builder)

 Note
 Duplicate is allow in heap (new)
 Duplicate is not allow in string constant


 */