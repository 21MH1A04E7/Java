public class Interface3 {
    public static void main(String args[]){
        //creating referacne of it
        A obj;
        obj=new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.name);
    }
}
interface A{
    //all the variable in the interface by default final and static
    int age=108;//final static
    String name="Hello";
    //interface is used to design 
    //by default show and config method will be public abstract 
    void show();
    void config();
}
//use to implement the abstract class we need to use the implements keyword
//if you fail to declear all the method of interface then your class become abstract class
class B implements A{
    @Override public void show(){
        System.out.println("IN SHOW");
    }
    @Override public void config(){
        System.out.println("IN CONFIG");
    }
}
//in interface by default every method will be public abstract

//interface don't have own memory in the heap