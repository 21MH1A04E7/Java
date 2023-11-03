public class Thiskeyword {
    public static void main(String args[]){
        new c();
       B obj1=new B(5);
    }
}
class A{
    public A(){
        super();
        System.out.println("A constructor");
    }
    public A(int x){
        super();
        System.out.println("A constructor "+x);
    }
}
class B extends A{
    public B(){
        System.out.println("B constructor");
    }
    public B(int x){
        //this will call the same class contructor 
        //current object contrutor 
        this();
        System.out.println("B constructor "+x);
    }
}