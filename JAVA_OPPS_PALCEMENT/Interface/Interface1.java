interface A{
    // public static final int num=4;//by default
    int num=4;
    // public abstract void show();//by default
    void show();
}
public class Interface1{
    public static void main(String args[]){
        System.out.println("hariom");
        // A.num=5; (we can't change because it is final)
        System.out.println(A.num);
    }
}
/*
 * An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * by default method is abstract (public abstract)
 * it allow only abstract method
 * by default all the variable of interface is |public static final|
 * we can't create the object of interface (it cannot be instantiated)
 * No constructor in the interface
 */