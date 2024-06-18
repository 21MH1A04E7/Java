public class Test2{
    public static void main(String args[]){
        String s1="hariom";
        String s2="hariom";
        System.out.println(s1==s2);
        //Both have same reference Object in heap->String-Constant

        String s3=new String("sujit");
        String s4=new String("sujit");
        System.out.println(s2==s3);
        //Both have different object in heap
        System.out.println(s3.equals(s4));//Comparing the value
    }
}

/*
 == (Comparing the  reference )
 equals() (Comparing the value)
 */