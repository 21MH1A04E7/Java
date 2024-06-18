public class Final_Mutable{
    public static void main(String args[]){
        final int a=10;
        // a=20;
        System.out.println(a);
        final StringBuilder name=new StringBuilder("hariom");
        name.append(" sujit");
        name=new StringBuilder("Kumar");
        System.out.println(name);
    }
}
/*
 final =>it will not change the behaviour of string (object)
 final => it will not allow to refere the other object
 
 */