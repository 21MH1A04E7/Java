public class Functionalinterface {
    public static void main(String args[]){
        B obj=new B();
        obj.show();
    }
}
@FunctionalInterface
//funtionalInterface has only one methods
interface A{
    void show();
    //void config()//getting error
}
class B implements A{
    @Override
    public void show(){
        System.out.println("B in Show");
    }
}