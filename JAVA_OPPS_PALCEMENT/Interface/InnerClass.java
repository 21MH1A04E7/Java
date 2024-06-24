// inner class ->member ,static ,anonymous
class A{
    public void show(){
        System.out.println("in A show");
    }
    //inner class
    // class B{
    //     public void display(){
    //         System.out.println("in B display");
    //     }
    // }
    static class C{
        public void display(){
            System.out.println("in C show");
        }
    }
}
public class InnerClass{
    public static void main(String args[]){
        A obj=new A();
        obj.show();
        // A.B obj1=obj.new B();//for non static class
        // obj1.display();

        A.C obj2=new A.C();//for static class
        obj2.display();
    }
}