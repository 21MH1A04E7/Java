//class->class:extends
//interface -> interface :implements
//class -> interface :implements
public class Interface5 {
    public static void main(String args[]){
        A obj;//A reference
        obj=new B();
        obj.show();
        obj.config();
        y obj2;//y reference
        obj2=new B();
        obj2.run();
        System.out.println(A.age);
        System.out.println(A.name);
    }   
}
interface A{
    int age=108;//final static
    String name="Hello";
   
    void show();
    void config();
}
interface x{
    void run();
}
//extending x interface in y interface
interface y extends x{

}
//we can implement more than one interfae
class B implements A,y{
    @Override public void show(){
        System.out.println("IN SHOW");
    }
    @Override public void config(){
        System.out.println("IN CONFIG");
    }
    //extends
    @Override public void run(){
        System.out.println("running");
    }
}