public class Interface4 {
    public static void main(String args[]){
        A obj;//A referance
        obj=new B();
        obj.show();
        obj.config();
        x obj2;//x referance
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
//we can implement more than one interfae
class B implements A,x{
    @Override public void show(){
        System.out.println("IN SHOW");
    }
    @Override public void config(){
        System.out.println("IN CONFIG");
    }
    @Override public void run(){
        System.out.println("running");
    }
}
