public class AnonymousAbstractClass {
    public static void main(String args[]){
        A obj=new A(){//actually we are not creating the object of abstrat class
            //but still it is working fine. why?
            //here we are creating the object of Aynonmous abstract class
            public void show(){
                System.out.println("show in A");
            }
            public void config(){
                System.out.println("in config ");
            }
        };
        obj.show();
        obj.config();
    }
}
 abstract class A {
    public abstract void show();
    public abstract void config();
}
// #1
// When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
// - You can also provide the implementation for multiple methods in an anonymous inner class.
// - Anonymous inner class can implement only one interface at s time.
// - Anonymous inner class can either extend a class or implement an interface at a time.
// - We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.