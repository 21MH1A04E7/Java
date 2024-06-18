public class Concatenation1{
    public static void main(String args[]){
        String s1=new String("Hariom");
        s1=s1.concat(" Kumar");//giving the new reference
        System.out.println(s1); 

        String h1="hariom";
        String h2=h1.concat(" Kumar");//memory allocated in heap area not in string constant
        System.out.println(h2);

        String a1=new String("Amit");
        a1=a1.concat(" Kumar");//Changing the Reference
        System.out.println(a1);

        String l1="hello";
        String l2=l1+" how "+" are";
        System.out.println(l2);
    }
}

/*
 by methode (any inbuild methode) memory allocated in heap area
 */