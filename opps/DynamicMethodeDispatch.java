public class DynamicMethodeDispatch {
    public static void main(String args[]){
        //storing object show be parent class 
        A obj=new B();
        obj.show();
        // in B show
        obj=new A();
        obj.show();
        //in A show
        obj=new C();
        obj.show();
        //in C show
        //it is Dynamic method dispatch
    }
}
class A{
    public  void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override public void show(){
        System.out.println("in B show");
    }
}
class C extends B{
      @Override public void show(){
        System.out.println("in C show");
    }
}
// Note: during compile time we donot which show() method is called from which class.
//     -- we can know during run time which show method is called this is known as run time polymorphism.
//     -- all this concept is class dynamic method dispatch