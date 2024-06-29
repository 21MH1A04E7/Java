interface B{
    void show();
}
interface X{
    void run();
}
class C implements B,X{
    //we must define the inherit abstruct method
    public void show(){
        System.out.println("in C show");
    }
    public void run(){
        System.out.println("in C run");
    }
}
public class Interface2{
    public static void main(String args[]){
        B c1=new C();
        c1.show();
        X c2=new C();
        c2.run();
        System.out.println("---------------");
        C c3=new C();
        c3.show();
        c3.run();
    }
}
/*
 * The interface in Java is a mechanism to achieve abstraction.
 * one class can implements more than one interface
 * one interface can extends other interface
 */